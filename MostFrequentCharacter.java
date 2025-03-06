import java.util.Scanner;

public class MostFrequentCharacter {

    // Method to find the most frequent character in the string.
    public static char findMostFrequent(String str) {
        int[] freq = new int[256]; // Array to store frequency of all ASCII characters.
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }
        int max = -1;
        char mostFreq = ' ';
        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] > max) {
                max = freq[str.charAt(i)];
                mostFreq = str.charAt(i);
            }
        }
        return mostFreq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        System.out.println("Most Frequent Character: '" + findMostFrequent(input) + "'");
        sc.close();
    }
}
