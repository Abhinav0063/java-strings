import java.util.Scanner;

public class ReplaceWordInSentence {

    // Method to replace a word in a sentence with another word.
    public static String replaceWord(String sentence, String oldWord, String newWord) {
        // Use the replaceAll method with word boundaries to ensure whole words are replaced.
        // Note: For simple cases, String.replace() would work as well.
        return sentence.replaceAll("\\b" + oldWord + "\\b", newWord);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        System.out.print("Enter the word to replace: ");
        String oldWord = sc.next();
        System.out.print("Enter the new word: ");
        String newWord = sc.next();
        sc.nextLine(); // Clear buffer if needed.
        System.out.println("Modified Sentence: " + replaceWord(sentence, oldWord, newWord));
        sc.close();
    }
}
