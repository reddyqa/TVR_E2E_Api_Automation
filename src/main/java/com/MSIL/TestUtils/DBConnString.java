package com.MSIL.TestUtils;


public class DBConnString
{
	public static final class LOCAL {

		public static final String URL = ReadFromProperty.getProperty(Properties.LOCAL_URL);
		public static final String USERNAME = ReadFromProperty.getProperty(Properties.LOCAL_USERNAME);
		public static final String PASSWORD = ReadFromProperty.getProperty(Properties.LOCAL_PASSWORD);

	}

	public static final class DEV {

		public static final String URL = ReadFromProperty.getProperty(Properties.DEV_URL);
		public static final String USERNAME = ReadFromProperty.getProperty(Properties.DEV_USERNAME);
		public static final String PASSWORD = ReadFromProperty.getProperty(Properties.DEV_PASSWORD);

	}

	public static final class QA {

		public static final String URL = ReadFromProperty.getProperty(Properties.QA_URL);

		public static final class PAYMENT {
			public static final String USERNAME = ReadFromProperty.getProperty(Properties.QA_PAYMENT_USERNAME);
			public static final String PASSWORD = ReadFromProperty.getProperty(Properties.QA_PAYMENT_PASSWORD);
		}

		public static final class COMMON_MASTERDATA {
			public static final String USERNAME = ReadFromProperty
					.getProperty(Properties.QA_COMMON_MASTERDATA_USERNAME);
			public static final String PASSWORD = ReadFromProperty
					.getProperty(Properties.QA_COMMON_MASTERDATA_PASSWORD);
		}

		public static final class COMMON_USER_MANAGEMENT {
			public static final String USERNAME = ReadFromProperty
					.getProperty(Properties.QA_COMMON_USER_MANAGEMENT_USERNAME);
			public static final String PASSWORD = ReadFromProperty
					.getProperty(Properties.QA_COMMON_USER_MANAGEMENT_PASSWORD);
		}

		public static final class SUBSCRIBE_VEHICLE_MANAGEMENT {
			public static final String USERNAME = ReadFromProperty
					.getProperty(Properties.QA_SUBSCRIBE_VEHICLE_MANAGEMENT_USERNAME);
			public static final String PASSWORD = ReadFromProperty
					.getProperty(Properties.QA_SUBSCRIBE_VEHICLE_MANAGEMENT_PASSWORD);
		}
		
		public static final class COMMON_CUSTOMER {
			public static final String USERNAME = ReadFromProperty
					.getProperty(Properties.QA_COMMON_CUSTOMER_USERNAME);
			public static final String PASSWORD = ReadFromProperty
					.getProperty(Properties.QA_COMMON_CUSTOMER_PASSWORD);
		}

	}

	public static final class HOTFIX {

		public static final String URL = ReadFromProperty.getProperty(Properties.HOTFIX_URL);
		public static final String USERNAME = ReadFromProperty.getProperty(Properties.HOTFIX_USERNAME);
		public static final String PASSWORD = ReadFromProperty.getProperty(Properties.HOTFIX_PASSWORD);

	}

	public static final class PREPROD {

		public static final String URL = ReadFromProperty.getProperty(Properties.PREPROD_URL);

		public static final class PAYMENT {
			public static final String USERNAME = ReadFromProperty.getProperty(Properties.PREPROD_PAYMENT_USERNAME);
			public static final String PASSWORD = ReadFromProperty.getProperty(Properties.PREPROD_PAYMENT_PASSWORD);
		}

		public static final class PARTNER_ACL {
			public static final String USERNAME = ReadFromProperty.getProperty(Properties.PREPROD_PARTNER_ACL_USERNAME);
			public static final String PASSWORD = ReadFromProperty.getProperty(Properties.PREPROD_PARTNER_ACL_PASSWORD);
		}

		public static final class SUBSCRIBE_VEHICLE_MANAGEMENT {
			public static final String USERNAME = ReadFromProperty
					.getProperty(Properties.PREPROD_SUBSCRIBE_VEHICLE_MANAGEMENT_USERNAME);
			public static final String PASSWORD = ReadFromProperty
					.getProperty(Properties.PREPROD_SUBSCRIBE_VEHICLE_MANAGEMENT_PASSWORD);
		}

		public static final class COMMON_MASTERDATA {
			public static final String USERNAME = ReadFromProperty
					.getProperty(Properties.PREPROD_COMMON_MASTERDATA_USERNAME);
			public static final String PASSWORD = ReadFromProperty
					.getProperty(Properties.PREPROD_COMMON_MASTERDATA_PASSWORD);
		}

		public static final class COMMON_USER_MANAGEMENT {
			public static final String USERNAME = ReadFromProperty
					.getProperty(Properties.PREPROD_COMMON_USER_MANAGEMENT_USERNAME);
			public static final String PASSWORD = ReadFromProperty
					.getProperty(Properties.PREPROD_COMMON_USER_MANAGEMENT_PASSWORD);
		}

	}

	public static final class PROD {

		public static final String URL = ReadFromProperty.getProperty(Properties.PROD_URL);

		public static final class PAYMENT {
			public static final String USERNAME = ReadFromProperty.getProperty(Properties.PROD_PAYMENT_USERNAME);
			public static final String PASSWORD = ReadFromProperty.getProperty(Properties.PROD_PAYMENT_PASSWORD);
		}

		public static final class PARTNER_ACL {
			public static final String USERNAME = ReadFromProperty.getProperty(Properties.PROD_PARTNER_ACL_USERNAME);
			public static final String PASSWORD = ReadFromProperty.getProperty(Properties.PROD_PARTNER_ACL_PASSWORD);
		}

		public static final class SUBSCRIBE_VEHICLE_MANAGEMENT {
			public static final String USERNAME = ReadFromProperty
					.getProperty(Properties.PROD_SUBSCRIBE_VEHICLE_MANAGEMENT_USERNAME);
			public static final String PASSWORD = ReadFromProperty
					.getProperty(Properties.PROD_SUBSCRIBE_VEHICLE_MANAGEMENT_PASSWORD);
		}

		public static final class SUBSCRIBE_BOOKING_MANAGEMENT {
			public static final String USERNAME = ReadFromProperty
					.getProperty(Properties.PROD_SUBSCRIBE_BOOKING_MANAGEMENT_USERNAME);
			public static final String PASSWORD = ReadFromProperty
					.getProperty(Properties.PROD_SUBSCRIBE_BOOKING_MANAGEMENT_PASSWORD);
		}

		public static final class COMMON_USER_MANAGEMENT {
			public static final String USERNAME = ReadFromProperty
					.getProperty(Properties.PROD_COMMON_USER_MANAGEMENT_USERNAME);
			public static final String PASSWORD = ReadFromProperty
					.getProperty(Properties.PROD_COMMON_USER_MANAGEMENT_PASSWORD);
		}

		public static final class COMMON_MASTERDATA {
			public static final String USERNAME = ReadFromProperty
					.getProperty(Properties.PROD_COMMON_MASTERDATA_USERNAME);
			public static final String PASSWORD = ReadFromProperty
					.getProperty(Properties.PROD_COMMON_MASTERDATA_PASSWORD);
		}

	}

}
