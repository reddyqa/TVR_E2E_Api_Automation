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

}
