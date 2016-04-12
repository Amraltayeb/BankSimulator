package model;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Amr on 3/30/2016.
 */
public class Validation {


    /**
     * @param email to be checked
     * @return int with value of 1 if the email is valid
     */
    public static int emailValidetion(String email) {
        int validEmail = 0;
        Pattern p = Pattern.compile("[a-zA-Z0-9\\.]+@[a-zA-Z0-9\\-\\_\\.]+\\.[a-zA-Z0-9]{3}");
        //el shakl el sabt lel emadl address  - patter mean : - el shakle el matlob elli 3ayz atl3 zayo
        //------------------------------------------
        Matcher m = p.matcher(email);
        //match m3naha wasal el shakl eli 3ayz atl3 zayo  ((email)user input using scanner )
        //---------------------------------------------------------------------
        try{
            if(email == null){
                validEmail = 0;
            }else{
                if (m.matches()) { // lw elli user katabo sa7 ? connect
                    System.out.println("valid email ");
                    validEmail = 1;
                } else { // lw elli user katabo 3'alat ? throw exeception
                    System.out.println("EmailAddress (should follow this format)  abc123@xyz.net");
                    //throw  new RuntimeException("not valid");
                    validEmail = -1;
                }
            }
        } catch (Exception e) {
            System.out.println("exception handled");
//            throw new Exception("Mail Exception");
        }
        return validEmail;

    }

    /**
     *
     * @param password to be checked
     * @return int with value of 0 if the password is null
     * @return int with value of -1 if the password is invalid
     * @return int with value of 1 if the password is valid
     */
    public static String passwordValidation(String password) {

        return "0";
    }

    /**
     *
     * @param firstName to be checked
     * @return int with value of 0 if the firstName is null
     * @return int with value of -1 if the firstName is invalid
     * @return int with value of 1 if the firstName is valid
     */
    public static String firstNameValidation(String firstName) {

        return "0";
    }

    /**
     *
     * @param lastName to be checked
     * @return int with value of 0 if the lastName is null
     * @return int with value of -1 if the lastName is invalid
     * @return int with value of 1 if the lastName is valid
     */
    public static String lastNameValidation(String lastName) {

        return "0";
    }

    /**
     *
     * @param mobileNumber to be checked
     * @return int with value of 0 if the mobileNumber is null
     * @return int with value of -1 if the mobileNumber is invalid
     * @return int with value of 1 if the mobileNumber is valid
     */
    public static String mobileNumberValidation(String mobileNumber) {

        return "0";
    }

    /**
     * @param address to be checked
     * @return int with value of 1 if the address is valid
     */
    public static String addressValidation(String address) {

        return "0";
    }

    /**
     * @param socailID to be checked
     * @return int with value of 1 if the socailID is valid
     */
    public static String socailIdValidation(String socailID) {

        return "0";
    }

    /**
     * @param initialAmmount to be checked
     * @return int with value of 1 if the initialAmmount is valid
     */
    public static String initialAmountValidation(String initialAmmount) {

        return "0";
    }


}
