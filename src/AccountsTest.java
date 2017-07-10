/**
 * Created by emma on 7/10/17.
 */
public class AccountsTest {

    public static void main(String[] args) {

        SavingsAccount mySavings = new SavingsAccount("123456789", 100.00, .05, new Date(5,1,2003));
        CheckingAccount myChecking = new CheckingAccount("987654321", 100.00, .05, new Date(5,1,2003), 50);

        System.out.println("Savings:");

        System.out.println(mySavings.getBalance());
        mySavings.deposit(10);
        System.out.println(mySavings.getBalance());
        mySavings.withdraw(55);
        System.out.println(mySavings.getBalance());
        mySavings.deposit(15);
        System.out.println(mySavings.getBalance());
        mySavings.withdraw(25);
        System.out.println(mySavings.getBalance());

        System.out.println("Checking:");

        System.out.println(myChecking.getBalance());
        myChecking.deposit(20);
        System.out.println(myChecking.getBalance());
        myChecking.withdraw(60);
        System.out.println(myChecking.getBalance());
        myChecking.deposit(25);
        System.out.println(myChecking.getBalance());
        myChecking.withdraw(12);
        System.out.println(myChecking.getBalance());

    }

}
