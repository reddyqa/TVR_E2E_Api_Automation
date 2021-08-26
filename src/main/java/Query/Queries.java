package Query;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.MSIL.Setup.BaseSetup;
import com.MSIL.TestUtils.Database;
import com.MSIL.TestUtils.ReadFromDB;

public class Queries extends BaseSetup
{
	static String query;
	static Map<String, String> lhmap_db_data = new HashMap<String, String>();
	public static String getOTP(String mobile_number)
	{
		query = "select otp from user_mobile_otp "+ 
							"where mobile_no= '"+mobile_number+ "';";
		String otp = ReadFromDB.getData(Database.COMMON_USER_MANAGEMENT, query).get(0);
		System.out.println("OTP Value: "+otp);
            return otp;
      
	}
	
	public static String getUuid()
	{
		query = "select user_uuid from customer_master order by id desc;" ;
		String uuid = ReadFromDB.getData(Database.COMMON_CUSTOMER, query).get(0);
		System.out.println("UUID Value : "+uuid);
		return uuid;
	}
	
	public static String customer_exists(String mobile)
	{
		query = "select user_uuid from customer_master "+ "where mobile= '"+mobile+ "';";
		String uuid = ReadFromDB.getData(Database.COMMON_CUSTOMER, query).get(0);
		System.out.println("UUID Value : "+uuid);
		return uuid;
	}
	
	
	public static List<String> get_customer_exists(String user_uuid)
	{
		query = "select mobile, first_name,middle_name, last_name, email,  gender, dob, business_type, occupation_type, referred_by, referral_code from customer_master "+ "where user_uuid= '"+user_uuid+ "';";
		List<String>list = ReadFromDB.getData(Database.COMMON_CUSTOMER, query);
		System.out.println(list.get(0));
		return list;
	}
	
	public static String getOTPCustomer(Object object)
	{
		query = "select otp from otp_details "+ 
							"where contact_info= '"+object+ "';";
		String otp = ReadFromDB.getData(Database.COMMON_CUSTOMER, query).get(0);
		System.out.println("OTP Value: "+otp);
            return otp;
      
	}
	
	
	public static String citygroupid()
	{
		query = "select city_group_id from city_group_master";
		String city_group_id = ReadFromDB.getData(Database.COMMON_MASTERDATA, query).get(0);
		System.out.println("City Group id: "+city_group_id);
            return city_group_id;
      
	}
	
	public static String partnerName(String id)
	{
		query = "select name1 from partner_master "+ "where id= '"+id+ "';";
		String partner_name = ReadFromDB.getData(Database.PARTNER_ACL, query).get(0);
		System.out.println("Partner Name: "+partner_name);
            return partner_name;
      
	}
	
	public static String partnerlogoid(String id)
	{
		query = "select id from partner_logo "+ "where partner_id= '"+id+ "';";
		String partnerlogo_id = ReadFromDB.getData(Database.PARTNER_ACL, query).get(0);
		System.out.println("Partner Name: "+partnerlogo_id);
            return partnerlogo_id;
      
	}
	
	public static double minprice_payment(String variantcode, String city_id)
	{
		query = "select min(net_monthly_post_gst) from dms_price_mapping "
				+ "INNER JOIN category_models ON category_models.id=dms_price_mapping.category_model_id where category_models.variant_cd='"+variantcode+"' and category_models.city_id='"+city_id+"' and CURRENT_DATE between valid_from and valid_to";
		String min_price = ReadFromDB.getData(Database.PAYMENT, query).get(0);
		double minprice=Double.valueOf(min_price);
		System.out.println("Minimum Price: "+min_price +"After Roundoff :"+minprice);
            return minprice;
	}
	
	public static String color_mileage_tenure(String variantcode)
	{
		query = "select color_type, mileage_code, tenure_id from category_models where id="
				+ "(select category_model_id from dms_price_mapping where net_monthly_post_gst = ("
				+ "select min(net_monthly_post_gst) from dms_price_mapping "
				+ "INNER JOIN "
				+ "category_models"
				+ "ON category_models.id=dms_price_mapping.category_model_id"
				+ "where category_models.variant_cd='"+variantcode+"' and CURRENT_DATE between valid_from and valid_to));";
		String min_price = ReadFromDB.getData(Database.PAYMENT, query).get(0);
		System.out.println("color_mileage_tenure: "+min_price);
            return min_price;
	}
	
	public static String model_master_ranking(String modelCode)
	{
		query = "Select ranking from model_master where model_code='"+modelCode+"';";
		String model_ranking = ReadFromDB.getData(Database.SUBSCRIBE_VEHICLE_MANAGEMENT, query).get(0);
		System.out.println("Model Ranking: "+model_ranking);
            return model_ranking;
	}
	
	//Hero Image URL
	public static String model_hero_image(String modelCode)
	{
		query = "select i.image_url from model_image_v2 i INNER JOIN model_master m"
				+ "ON i.reference_model_fkid=m.hero_reference_model_fkid"
				+ "where m.model_code='"+modelCode+"';";
		String Image_URL = ReadFromDB.getData(Database.SUBSCRIBE_VEHICLE_MANAGEMENT, query).get(0);
		System.out.println("image_URL: "+Image_URL);
            return Image_URL;
	}
	//city master number plate
		public static List<String> city_master_number_plate(String cityId)
		{
			query = "select license_plate_code from whitelist_city_Reg_type where city_group_details_ID='"+cityId+"';";
			List<String> license_plate = ReadFromDB.getData(Database.COMMON_MASTERDATA, query);
			System.out.println("Number Plate: "+license_plate );
	            return license_plate;
		}

	
	//Whitelist dealer
		public static List<String> whitelist_leasing_companies(String cityGroupId)
		{
			query = "Select c.partner_id from city_partner_mapping c INNER JOIN whitelist_partner w "
					+ "on c.partner_id = w.partner_id where c.partner_role = 1 and c.city_group_id ='"+cityGroupId+"';";
			List <String> Whitelist_Companies = ReadFromDB.getData(Database.PARTNER_ACL, query);
			System.out.println("Whitelist_Companies: "+Whitelist_Companies);
	            return Whitelist_Companies;
		}
		
		//Subscription Tenure
				public static List<String> Subscription_tenure(String cityId)
				{
					query = "Select DISTINCT c.tenure_id from category_models c INNER JOIN dms_price_mapping d "
							+ "ON c.id = d.category_model_id where d.net_monthly_post_gst > 0 and "
							+ "CURRENT_DATE >= d.valid_from and CURRENT_DATE <= d.valid_to and c.city_id ='"+cityId+"' order by tenure_id;";
					List<String> Subscription_Tenure = ReadFromDB.getData(Database.PAYMENT, query);
					System.out.println("Subscription_Tenure: "+Subscription_Tenure);
			            return Subscription_Tenure;
				}
				
				//isHybrid whitelist Ref
				public static boolean Whitelist_Ref_ishybrid_query(String variantCodes)
				{
					query = "select is_hybrid from whitelist_reference_model_v2 where variant_cd='"+variantCodes+"';";
					String isHybrid = ReadFromDB.getData(Database.SUBSCRIBE_VEHICLE_MANAGEMENT, query).get(0);
					boolean hybrid_db_res=Boolean.parseBoolean(isHybrid);
					System.out.println("Hybrid Flag is: "+hybrid_db_res );
			            return hybrid_db_res;
				}
			//get customer address	
				public static String get_customer_id()
				{
				query = "select id from address_master order by id desc limit 1;";
				String id = ReadFromDB.getData(Database.COMMON_CUSTOMER, query).get(0);
				System.out.println("Customer id: "+id);
				return id;
				}

				
		// get customer address
				public static String get_customer_address(int id)
				{
					query = "select address_master.address_line1 from address_master where id='"+id+"';";
					String addressline1 = ReadFromDB.getData(Database.COMMON_CUSTOMER, query).get(0);
					System.out.println("addressline1: "+addressline1);
			            return addressline1;
				}

		// get occupation code
				public static String get_occupation_code(int occupation_id)
				{
					query = "select occupation_type from customer_occupation_details where id ='"+occupation_id+"';";
					String occupation_Type = ReadFromDB.getData(Database.COMMON_CUSTOMER, query).get(0);
					System.out.println("occupation_Type: "+occupation_Type);
			        return occupation_Type;
				}
				

		// get_occupation
				public static String get_occupation_id()
				{
					query = "select id from customer_occupation_details order by id desc;";
					String occupation_id = ReadFromDB.getData(Database.COMMON_CUSTOMER, query).get(0);
					System.out.println("occupation_id: "+occupation_id);
			        return occupation_id;
				}
				
		//get_uuid_id
				public static String get_uuid_id()
				{
					query = "select user_uuid from customer_master where mobile ='8130009677';";
					String uuid_id = ReadFromDB.getData(Database.COMMON_CUSTOMER, query).get(0);
					System.out.println("occupation_id: "+uuid_id);
			        return uuid_id;
				}
				

	

}
