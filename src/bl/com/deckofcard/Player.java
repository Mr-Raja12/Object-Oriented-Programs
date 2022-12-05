package bl.com.deckofcard;
import java.util.Scanner;
public class Player {
    /*
     * @param Raja
     */
    public static void main(String[] args) {
        //calling methods
        System.out.println("\nPress 1 ->> To view cards of 4 Players");
        DeckOfCard cards = new DeckOfCard();
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        switch (number) {
            case 1:
                cards.getCardCombination();
                cards.getPlayer();
                break;
            default:
                System.out.println("!!invalid input!!");
                break;
        }
    }
}

