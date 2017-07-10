/**
 * Created by emma on 7/10/17.
 */
public class SavingsAccount extends Account {

    String accountNumber;
    double balance;
    double annualInterest;
    Date dateCreated;

    public SavingsAccount(String newAccountNumber, double newBalance, double newAnnualInterest, Date newDateCreated) {

        setAccountNumber(newAccountNumber);
        setBalance(newBalance);
        setAnnualInterest(newAnnualInterest);
        setDateCreated(newDateCreated);

    }

    public void deposit(double amount) {
        setBalance(getBalance() + amount);
    }

    public void withdraw(double amount) {
        setBalance(getBalance() - amount);
    }

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
