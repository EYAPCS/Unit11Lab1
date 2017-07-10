/**
 * Created by emma on 7/10/17.
 */
public abstract class Account {

    String accountNumber;
    double balance;
    double annualInterest;
    Date dateCreated;

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

}
