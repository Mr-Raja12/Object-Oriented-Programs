package bl.com.stockaccount;
import java.util.Scanner;
/**
 *
 * @author Raja
 *
 */
public class StockAccount {
    /*
     * Initialized the required variable
     */
    private static int noOfStocks;
    private static String shareName;
    private static int noOfShare;
    private static int sharePrice;
    static int StockPrice;
    static int TotalValue;
    /*
     *Getter and setter method created
     */
    public static int getNoOfStocks() {
        return noOfStocks;
    }
    public static void setNoOfStocks(int noOfStocks) {      //set methods
        StockAccount.noOfStocks = noOfStocks;				//used to set values of a stock
    }

    public static String getShareName() {		//getter methods
        return shareName;						//return variables of a object
    }

    public static void setShareName(String shareName) {
        StockAccount.shareName = shareName;
    }
    public static int getNoOfShare() {
        return noOfShare;
    }
    public static void setNoOfShare(int noOfShare) {
        StockAccount.noOfShare = noOfShare;
    }

    public static int getSharePrice() {
        return sharePrice;
    }

    public static void setSharePrice(int sharePrice) {
        StockAccount.sharePrice = sharePrice;
    }
    public static int getStockPrice() {
        return StockPrice;
    }
    public static void setStockPrice(int stockPrice) {
        StockPrice = stockPrice;
    }
    public static int getTotalValue() {
        return TotalValue;
    }
    public static void setTotalValue(int totalValue) {
        TotalValue = totalValue;
    }
    public void addShare() {

        /*
         *  Taken input from user for No.of Stock
         * and share
         */
        Scanner input = new Scanner(System.in);      //create object
        System.out.println("\nEnter the Name of Share");
        shareName = input.nextLine();
        System.out.println("Enter the number of Share");
        noOfShare = input.nextInt();
        System.out.println("Enter the price for Share");
        sharePrice = input.nextInt();
        StockPrice = noOfShare * sharePrice;
        System.out.println("\nValue of Stock " + shareName + " is = " + StockPrice);
        input.close();
    }

}