import java.util.Random;

public class VotingEligibility {
    // Method to generate random ages for students
    public static int[] generateAges(int numStudents) {
        Random rand = new Random();
        int[] ages = new int[numStudents];

        for (int i = 0; i < numStudents; i++) {
            ages[i] = 10 + rand.nextInt(11); // Ages between 10 and 20
        }
        return ages;
    }

    // Method to determine voting eligibility
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] results = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            results[i][0] = String.valueOf(ages[i]);
            results[i][1] = (ages[i] >= 18) ? "Can Vote" : "Cannot Vote";
        }
        return results;
    }

    // Method to display the results
    public static void displayTable(String[][] data) {
        System.out.println("\nVoting Eligibility:");
        System.out.printf("%-10s %-15s%n", "Age", "Status");
        System.out.println("---------------------------");
        for (String[] row : data) {
            System.out.printf("%-10s %-15s%n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        int[] ages = generateAges(10);
        String[][] results = checkVotingEligibility(ages);
        displayTable(results);
    }
}
