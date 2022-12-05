package bl.com.stockaccount;
import java.util.Scanner;
/**
 *
 * @author Raja
 *
 */
public class ManageAccount {

    Scanner sc = new Scanner(System.in); //Create object

    static String name;
    private static int balance = 10000;     // to generate balance

    /*
     * Showing the balance with object viewBalance
     */
    public void viewBalnce() {
        System.out.println(balance);
    }
    public void addBalnce() {
        System.out.println("Please enter the valid amount to add : ");
        int amount = sc.nextInt();
        balance = balance + amount;    // adding amount to balance
        System.out.println("The updated account balance is : " + balance);
    }
    /*
     * method to withdraw money
     *
     */
    public void withdrawBalance() {
        System.out.println("Enter the amount to be withdrawn : ");
        int amount = sc.nextInt();
        if (amount <= 0) {
            System.out.println("Enter valid amount for withdraw : ");

        } else if (amount <= balance) {
            System.out.println("withdrawn is under process \nWithdrawn process is successfull..!!");
            balance = balance - amount;   // subtracting amount to balance
            System.out.println("Updated balance is = " + balance);
        } else {
            System.out.println("Insufficient balance....!!");
        }
    }
}