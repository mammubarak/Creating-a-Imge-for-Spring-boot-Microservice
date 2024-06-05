package gov.ugsp.healthdepartmentservice.Util.Constants;

public class Constants {

    public static final String REQUEST_ID_VALIDATION_MESSAGE = "ID should be a positive number.";

    // Field names for health profile entity
    public static final String PROFILE_ID = "id";
    public static final String REGISTRATION_NUM = "registration_number";
    public static final String NIC = "nic";
    public static final String NAME = "name";
    public static final String SPECIALIZATION = "specialization";

    public static final String PHONE_NUMBER= "phone_number";

    public static final String REGISTRATION_DATE= "registration_date";
    public static final String EXPIRY_DATE= "expiry_date";

    public static final String EMAIL= "email";
    public static final String PASSWORD= "password";




    //TIN profile specific validation messages
    public static final String PAYMENT_AMOUNT_REQUIRED = "Payment amount must not be empty.";
    public static final String CONSTRAINT_PAYMENT_AMOUNT = "Amount should be grater than 0.00";

    /*Custom Response messages*/
    public static final String RECORD_CREATED_SUCCESSFULLY = "Record created successfully";
    public static final String RECORD_UPDATED_SUCCESSFULLY = "Record updated successfully";
    public static final String RECORD_RETRIEVED_SUCCESSFULLY = "Record retrieved successfully";
    public static final String RECORD_DELETED_SUCCESSFULLY = "Record deleted successfully";
    public static final String RECORD_DOES_NOT_EXIST = "Record does not exist";
    public static final String NO_RECORDS_IN_THE_DATABASE = "No records in the database";

}


