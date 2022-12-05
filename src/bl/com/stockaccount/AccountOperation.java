package bl.com.stockaccount;
import java.util.Scanner;
/**
 *
 * @author Raja
 *
 */
public class AccountOperation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);   //create a object
        System.out.println("1. To view current balance \n2. To add balance \n3. To withdraw balance");
        ManageAccount account = new ManageAccount();
        int choice = scanner.nextInt();

        /*
         * The Switched case used to give a choice up
         * to 3 (Withdraw,check bl,add bl)
         * Mention 1 to print the view current balance
         * Mention 2 to add balance and updated balance
         * Mention 3 to withdraw money
         */
        switch (choice) {
            case 1:
                System.out.println("The balance is:");
                account.viewBalnce();
                break;
            case 2:
                account.addBalnce();
                break;
            case 3:
                account.withdrawBalance();
                break;
        }
    }

}