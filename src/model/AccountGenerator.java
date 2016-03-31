package model;

/**
 * Created by Amr on 3/31/2016.
 */
public class AccountGenerator {
    private static long accountNumber = 5555333003L;


    public long getAccountNumber() {
        accountNumber++;
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        AccountGenerator.accountNumber = accountNumber;
    }
}
