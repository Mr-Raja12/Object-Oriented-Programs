package bl.com.stockaccount;
import java.util.Scanner;
/**
 *
 * @author Raja
 *
 */
public class Portfolio extends StockAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the total number of Stocks");
        setNoOfStocks(scanner.nextInt());
        for (int i = 1; i <= getNoOfStocks(); i++) {     //initialize
            StockAccount stock = new StockAccount();
            stock.addShare();
            TotalValue += StockPrice;
        }
        System.out.println("\nTotal Value is " + TotalValue);  //printed total value
    }

}
