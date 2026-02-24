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
    // Method to normalize string (remove spaces and lowercase)
    public static String normalize(String str) {
        // Remove all spaces using regex and convert to lowercase
        return str.replaceAll("\\s+", "").toLowerCase();
    }

    // Method to check palindrome
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Main method
    public static void main(String[] args) {
        // Hardcoded string with spaces and mixed case
        String word = "A man a plan a canal Panama";

        // Normalize string
        String normalized = normalize(word);

        // Check palindrome
        if (isPalindrome(normalized)) {
            System.out.println("\"" + word + "\" is a palindrome (ignoring case and spaces).");
        } else {
            System.out.println("\"" + word + "\" is not a palindrome.");
        }
    }
}