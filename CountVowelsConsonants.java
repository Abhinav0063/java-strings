import java.util.Scanner;

public class CountVowelsConsonants {

    // Method to count vowels and consonants in the input string.
    public static void countVowelsAndConsonants(String str) {
        int vowels = 0;
        int consonants = 0;
        // Convert the string to lowercase for simplicity.
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Check if the character is a letter.
            if (ch >= 'a' && ch <= 'z') {
                // If the character is a vowel.
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        countVowelsAndConsonants(input);
        sc.close();
    }
}
