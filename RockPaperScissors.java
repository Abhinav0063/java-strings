import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    // Method to get a random choice for the computer
    public static String getComputerChoice() {
        String[] choices = {"Rock", "Paper", "Scissors"};
        return choices[new Random().nextInt(3)];
    }

    // Method to determine the winner
    public static String findWinner(String player, String computer) {
        if (player.equals(computer)) return "Draw";
        if ((player.equals("Rock") && computer.equals("Scissors")) ||
            (player.equals("Scissors") && computer.equals("Paper")) ||
            (player.equals("Paper") && computer.equals("Rock"))) {
            return "Player";
        }
        return "Computer";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rounds, playerWins = 0, computerWins = 0, draws = 0;

        // User input for number of games
        System.out.print("Enter number of rounds: ");
        rounds = scanner.nextInt();

        for (int i = 1; i <= rounds; i++) {
            System.out.print("Enter Rock, Paper, or Scissors: ");
            String playerChoice = scanner.next();
            String computerChoice = getComputerChoice();
            String winner = findWinner(playerChoice, computerChoice);

            // Update stats
            if (winner.equals("Player")) playerWins++;
            else if (winner.equals("Computer")) computerWins++;
            else draws++;

            // Display result
            System.out.printf("Round %d: Player (%s) vs Computer (%s) => %s Wins%n", i, playerChoice, computerChoice, winner);
        }

        // Display statistics
        System.out.println("\nFinal Stats:");
        System.out.printf("Player Wins: %d, Computer Wins: %d, Draws: %d%n", playerWins, computerWins, draws);
        System.out.printf("Winning Percentage: Player %.2f%% | Computer %.2f%%%n",
                (playerWins * 100.0 / rounds), (computerWins * 100.0 / rounds));

        scanner.close();
    }
}
