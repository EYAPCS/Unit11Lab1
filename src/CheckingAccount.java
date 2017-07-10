/**
 * Created by emma on 7/10/17.
 */
public class CheckingAccount extends Account {

    String accountNumber;
    double balance;
    double annualInterest;
    Date dateCreated;
    private double overdraftLimit;

    public CheckingAccount(String newAccountNumber, double newBalance, double newAnnualInterest, Date newDateCreated, double newOverdraftLimit) {

        setAccountNumber(newAccountNumber);
        setBalance(newBalance);
        setAnnualInterest(newAnnualInterest);
        setDateCreated(newDateCreated);
        setOverdraftLimit(newOverdraftLimit);

    }

    public void deposit(double amount) {
        setBalance(getBalance() + amount);
    }

    public void withdraw(double amount) {

        if(amount <= overdraftLimit)
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

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
}
