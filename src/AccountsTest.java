/**
 * Created by emma on 7/10/17.
 */

/**
 * AccountsTest class tests the Savings and CheckingAccount classes
 */

public class AccountsTest {

    public static void main(String[] args) {

        SavingsAccount mySavings = new SavingsAccount("123456789", 100.00, .05, new Date(5,1,2003));
        CheckingAccount myChecking = new CheckingAccount("987654321", 100.00, .05, new Date(5,1,2003), 50);

        System.out.println("Savings:");

        System.out.println("Initial Balance: " + mySavings.getBalance());
        System.out.println("Deposit $10");
        mySavings.deposit(10);
        System.out.println(mySavings.getBalance());
        System.out.println("Withdraw $55");
        mySavings.withdraw(55);
        System.out.println(mySavings.getBalance());
        System.out.println("Deposit $15");
        mySavings.deposit(15);
        System.out.println(mySavings.getBalance());
        System.out.println("Withdraw $100");
        mySavings.withdraw(100);
        System.out.println(mySavings.getBalance());
        System.out.println("Withdraw $20");
        mySavings.withdraw(20);
        System.out.println(mySavings.getBalance());

        System.out.println();

        System.out.println("Checking: ");

        System.out.println("Initial Balance: " + myChecking.getBalance());
        System.out.println("Deposit $20");
        myChecking.deposit(20);
        System.out.println(myChecking.getBalance());
        System.out.println("Withdraw $60");
        myChecking.withdraw(60);
        System.out.println(myChecking.getBalance());
        System.out.println("Deposit $25");
        myChecking.deposit(25);
        System.out.println(myChecking.getBalance());
        System.out.println("Withdraw $150");
        myChecking.withdraw(150);
        System.out.println(myChecking.getBalance());
        System.out.println("Withdraw $60");
        myChecking.withdraw(60);
        System.out.println(myChecking.getBalance());

    }

}
