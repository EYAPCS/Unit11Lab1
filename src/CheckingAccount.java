/**
 * Created by emma on 7/10/17.
 */

/**
 * CheckingAccount class has an overdraft limit.
 * @author Emma Yang
 */

public class CheckingAccount extends Account {

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

        if(getBalance() - amount < (overdraftLimit * -1))
            System.out.println("Goes below overdraft limit of $" + getOverdraftLimit());
        else
            setBalance(getBalance() - amount);

    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
}
