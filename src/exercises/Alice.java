package exercises;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String aliceFirstLine = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

        System.out.println("Hello, please enter a term to search: ");
        String term = input.next().toLowerCase();

        int index = aliceFirstLine.indexOf(term);
        int length = term.length();

        if (aliceFirstLine.toLowerCase().contains(term) == true) {
            System.out.println("Your term " + term + " was found. It is located at " + index + " and is " + length + " characters long.");
            String newAliceFirstLine = aliceFirstLine.replace(term,"");
            System.out.println(newAliceFirstLine);
        } else if (aliceFirstLine.toLowerCase().contains(term) == false) {
            System.out.println("Your term " + term + " was not found.");
        }

    }
}
