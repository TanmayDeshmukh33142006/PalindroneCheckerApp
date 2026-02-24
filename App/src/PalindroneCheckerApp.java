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

        // Welcome Message
        System.out.println("=====================================");
        System.out.println(" Palindrome Checker App - UC3 ");
        System.out.println(" Version : 3.0 ");
        System.out.println("=====================================");

        // Hardcoded String
        String input = "level";

        // Variable to store reversed string
        String reversed = "";

        // Reverse string using loop (as per hint)
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);   // String Concatenation
        }

        // Display reversed string
        System.out.println("Original String : " + input);
        System.out.println("Reversed String : " + reversed);

        // Compare original and reversed using equals()
        if (input.equals(reversed)) {
            System.out.println("Result : The given string is a Palindrome.");
        } else {
            System.out.println("Result : The given string is NOT a Palindrome.");
        }

        System.out.println("Application Execution Completed.");
    }
}