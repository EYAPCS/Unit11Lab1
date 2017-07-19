/**
 * Created by emma on 7/10/17.
 */

/**
 * The Account abstract class lays out the basic variables and the deposit/withdraw methods. It also contains the get set for the variables.
 */

public abstract class Account {

    String accountNumber;
    double balance;
    double annualInterest;
    Date dateCreated;

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterest() {
        return annualInterest;
    }

    public void setAnnualInterest(double annualInterest) {
        this.annualInterest = annualInterest;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

}
