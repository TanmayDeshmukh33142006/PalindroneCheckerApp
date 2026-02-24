/**
 * ===========================================
 * MAIN CLASS - UseCase3PalindromeApp
 * ===========================================
 *
 * Use Case 3: Palindrome Check Using String Reverse
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
 * @Version : 3.0
 */

public class PalindroneCheckerApp {

    public static void main(String[] args) {

        // Hardcoded string to check
        String word = "radar";

        // Convert string to character array
        char[] chars = word.toCharArray();

        // Two-pointer approach
        int left = 0;
        int right = chars.length - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (chars[left] != chars[right]) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}