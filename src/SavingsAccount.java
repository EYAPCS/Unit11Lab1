/**
 * Created by emma on 7/10/17.
 */

/**
 * The SavingsAccount class cannot be withdrawn below 0.
 * @author Emma Yang
 */

public class SavingsAccount extends Account {

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
        if(getBalance() - amount < 0) {
            System.out.println("Cannot be overdrawn!");
        } else {
            setBalance(getBalance() - amount);
        }
    }

}
