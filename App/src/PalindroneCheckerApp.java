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

    // Recursive method to check palindrome
    public static boolean isPalindrome(String str, int left, int right) {
        // Base condition: if pointers cross or meet
        if (left >= right) {
            return true;
        }
        // If mismatch found
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }
        // Recursive call moving inward
        return isPalindrome(str, left + 1, right - 1);
    }

    // Main method
    public static void main(String[] args) {
        String word = "madam"; // Hardcoded string

        if (isPalindrome(word, 0, word.length() - 1)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}