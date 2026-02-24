/**
 * ===========================================
 * MAIN CLASS - UseCase2PalindromeApp
 * ===========================================
 *
 * Use Case 2: Hardcoded Palindrome Result
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
 * @Version : 2.0
 */

public class PalindroneCheckerApp {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=====================================");
        System.out.println(" Welcome to Palindrome Checker App ");
        System.out.println(" Version : 2.0 ");
        System.out.println("=====================================");

        // Hardcoded String Literal
        String input = "madam";

        // Flag variable to track palindrome status
        boolean isPalindrome = true;

        // Loop to compare characters from start and end
        for (int i = 0; i < input.length() / 2; i++) {

            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Conditional Statement to print result
        if (isPalindrome) {
            System.out.println("The given string \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("The given string \"" + input + "\" is NOT a Palindrome.");
        }

        System.out.println("Application Execution Completed.");
    }
}