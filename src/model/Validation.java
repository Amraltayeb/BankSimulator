package model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Amr on 3/30/2016.
 */
public class Validation {

    public String errorMsg;
    private boolean valid = true;


    public Validation() {
    }

    public static String emailValidety(String email) {
        String validEmail = "0";
        Pattern p = Pattern.compile("[a-zA-Z0-9\\.]+@[a-zA-Z0-9\\-\\_\\.]+\\.[a-zA-Z0-9]{3}");
        //el shakl el sabt lel emadl address  - patter mean : - el shakle el matlob elli 3ayz atl3 zayo
        //------------------------------------------
        Matcher m = p.matcher(email);
        //match m3naha wasal el shakl eli 3ayz atl3 zayo  ((email)user input using scanner )
        //---------------------------------------------------------------------

        if (m.matches() == (true)) { // lw elli user katabo sa7 ? connect


            System.out.println("valid email ");
            validEmail = "1";
        }
        try {
            // error r =new error();
            if (m.matches() == (false)) { // lw elli user katabo 3'alat ? throw exeception
                System.out.println("EmailAddress (should follow this format)  abc123@xyz.net");
                //throw  new RuntimeException("not valid");
                validEmail = "EmailAddress (should follow this format)  abc123@xyz.net";
            }
        } catch (Exception e) {
            System.out.println("exception handled");
        }
        return validEmail;

    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }


}
