package exercises;

import org.launchcode.java.demos.lsn1datatypes.Message;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String aliceStatement = "Alice was beginning to get very tired of sitting by her sister on the bank, and of " +
                "having nothing to do: once or twice she had peeped into the book her sister was reading, but it had " +
                "no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures " +
                "or conversation?'";
        String aliceLower = aliceStatement.toLowerCase();

        Scanner input = new Scanner(System.in);
        System.out.println("Hello, what would you like to search for?");
        String search = input.nextLine();
        System.out.println(aliceLower.contains(search));


    }
}
