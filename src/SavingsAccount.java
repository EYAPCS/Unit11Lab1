/**
 * Created by emma on 7/10/17.
 */
public class SavingsAccount extends Account {

    String accountNumber;
    double balance;
    double annualInterest;
    Date dateCreated;
    private double overdrawLimit;

    public SavingsAccount(String newAccountNumber, double newBalance, double newAnnualInterest, Date newDateCreated, double newOverdrawLimit) {

        setAccountNumber(newAccountNumber);
        setBalance(newBalance);
        setAnnualInterest(newAnnualInterest);
        setDateCreated(newDateCreated);
        setOverdrawLimit(newOverdrawLimit);

    }

    public void deposit(double amount) {
        setBalance(getBalance() + amount);
    }

    public void withdraw(double amount) {

        if(amount <= overdrawLimit)
            setBalance(getBalance() - amount);
        else
            System.out.println("Exceeds overdraw limit!");

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

    public double getOverdrawLimit() {
        return overdrawLimit;
    }

    public void setOverdrawLimit(double overdrawLimit) {
        this.overdrawLimit = overdrawLimit;
    }
}
