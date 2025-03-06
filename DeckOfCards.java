import java.util.Random;
import java.util.Scanner;

public class DeckOfCards {
    static String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    static String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    // Method to generate deck
    public static String[] createDeck() {
        String[] deck = new String[suits.length * ranks.length];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    // Method to shuffle deck
    public static void shuffleDeck(String[] deck) {
        Random rand = new Random();
        for (int i = 0; i < deck.length; i++) {
            int swapIndex = rand.nextInt(deck.length);
            String temp = deck[i];
            deck[i] = deck[swapIndex];
            deck[swapIndex] = temp;
        }
    }

    // Method to distribute cards among players
    public static String[][] distributeCards(String[] deck, int players, int cardsPerPlayer) {
        if (players * cardsPerPlayer > deck.length) {
            System.out.println("Not enough cards for each player!");
            return null;
        }

        String[][] playerCards = new String[players][cardsPerPlayer];
        int cardIndex = 0;

        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                playerCards[i][j] = deck[cardIndex++];
            }
        }
        return playerCards;
    }

    // Method to print distributed cards
    public static void displayPlayerCards(String[][] playerCards) {
        if (playerCards == null) return;

        System.out.println("\n--- Players & Their Cards ---");
        for (int i = 0; i < playerCards.length; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            for (String card : playerCards[i]) {
                System.out.print(card + " | ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for players and cards per player
        System.out.print("Enter number of players: ");
        int players = scanner.nextInt();
        System.out.print("Enter number of cards per player: ");
        int cardsPerPlayer = scanner.nextInt();

        // Create and shuffle the deck
        String[] deck = createDeck();
        shuffleDeck(deck);

        // Distribute and display the cards
        String[][] playerCards = distributeCards(deck, players, cardsPerPlayer);
        displayPlayerCards(playerCards);

        scanner.close();
    }
}
