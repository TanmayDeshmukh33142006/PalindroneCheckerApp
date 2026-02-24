/**
 * ===========================================
 * MAIN CLASS - UseCase5PalindromeApp
 * ===========================================
 *
 * Use Case 5: Stack-Based Palindrome Checker
 *
 * Description:
 * This class is the entry point of the
 * Palindrome Checker Management System.
 *
 * At this stage, the application:
 * 1. Displays a welcome message
 * 2. Shows application version
 * 3. Checks a hardcoded string for palindrome
 * 4. Prints the result
 *
 * @Author : Tanmay
 * @Version : 5.0
 */
import java.util.Deque;
import java.util.LinkedList;
public class PalindroneCheckerApp {

    public static void main(String[] args) {
        // Hardcoded string to check
        String word = "rotor";

        // Create a deque and insert characters
        Deque<Character> deque = new LinkedList<>();
        for (int i = 0; i < word.length(); i++) {
            deque.addLast(word.charAt(i)); // insert at rear
        }

        // Compare front and rear until empty or mismatch
        boolean isPalindrome = true;
        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if (isPalindrome) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}