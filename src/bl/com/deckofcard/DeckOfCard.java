package bl.com.deckofcard;
import java.util.Random;
public class DeckOfCard {
    /*
     *To initialize deck of cards having suit
     */
    String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
    String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
    String[][] cards = new String[4][13];
    String[][] player = new String[4][9];

    public void getCardCombination() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                cards[i][j] = ranks[j] + suits[i];
            }
        }
    }
    public void getPlayer() {
        /*
         *Shuffle the cards using Random method and then distribute 9 Cards to 4 Players
         *Print the Cards received by
         *the 4 Players using 2D Array...
         */
        int i;
        int j;
        for (i = 0; i < 4; i++) {
            System.out.println("\n ~ Cards for Player " + (i + 1) + " ~\n");
            for (j = 0; j < 9; j++) {
                Random random = new Random();   //create random number generator
                int randomSuit = random.nextInt(4);   //between 1 to 4
                int randomRank = random.nextInt(13);	//1 to 13
                player[i][j] = cards[randomSuit][randomRank];    //randomly selected cards
                System.out.print(player[i][j] + "   \n");
            }
        }
    }
}
