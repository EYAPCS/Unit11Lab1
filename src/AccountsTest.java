/**
 * Created by emma on 7/10/17.
 */
public class AccountsTest {

    public static void main(String[] args) {

        SavingsAccount mySavings = new SavingsAccount("123456789", 100.00, .05, new Date(5,1,2003), 50);

        System.out.println(mySavings.getBalance());
        mySavings.deposit(10);
        System.out.println(mySavings.getBalance());
        mySavings.withdraw(55);
        System.out.println(mySavings.getBalance());
        mySavings.deposit(15);
        System.out.println(mySavings.getBalance());
        mySavings.withdraw(25);
        System.out.println(mySavings.getBalance());

        

    }

}
