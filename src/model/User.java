package model;

/**
 * Created by Amr on 3/24/2016.
 */
public class User {
    private String firstName, lastName, mobNumber, eMail,  address1, address2;
    private String Nationalty, socialId;
    private Integer initialAccount;

    public User() {
//        this.firstName = "Amr";
//        this.lastName = "Aly";
//        this.mobNumber = "0100100100";
//        this.eMail = "Email@mail.com";
//        this.address1 = "11 abbaas el akkad";
//        this.address2 = "Madenet nasr, cairo";
//        this.Nationality = "Egyption";
//        this.socialId = "28451235625554";
//        this.initialAccount = 1020;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobNumber() {
        return mobNumber;
    }

    public void setMobNumber(String mobNumber) {
        this.mobNumber = mobNumber;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getNationalty() {
        return Nationalty;
    }

    public void setNationalty(String nationalty) {
        Nationalty = nationalty;
    }

    public String getSocialId() {
        return socialId;
    }

    public void setSocialId(String socialId) {
        this.socialId = socialId;
    }

    public Integer getInitialAccount() {
        return initialAccount;
    }

    public void setInitialAccount(Integer initialAccount) {
        this.initialAccount = initialAccount;
    }
}
