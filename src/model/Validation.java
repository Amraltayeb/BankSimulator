package model;

/**
 * Created by Amr on 3/30/2016.
 */
public class Validation {
    private User user = new User();
    private String errorMsg;
    private boolean valid = true;

    /**
     * Validation class constructor
     *
     * @param user new user to check validation
     */
    public Validation(User user) {
        this.user = user;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public boolean isValid() {

        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean Emailvalidety(String email){
//        if (!isSting(email) ){
//
//
//        }
        return false;
    }


}
