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
import java.util.Stack;
import java.util.Deque;
import java.util.LinkedList;

// Strategy interface
interface PalindromeStrategy {
    boolean checkPalindrome(String str);
}

// Stack-based strategy
class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean checkPalindrome(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            stack.push(c);
        }
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }
        return str.equals(reversed);
    }
}

// Deque-based strategy
class DequeStrategy implements PalindromeStrategy {
    @Override
    public boolean checkPalindrome(String str) {
        Deque<Character> deque = new LinkedList<>();
        for (char c : str.toCharArray()) {
            deque.addLast(c);
        }
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }
}

// Context class
class PalindromeChecker {
    private PalindromeStrategy strategy;

    // Inject strategy at runtime
    public PalindromeChecker(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean isPalindrome(String str) {
        return strategy.checkPalindrome(str);
    }
}

// Main application
public class PalindroneCheckerApp {
    public static void main(String[] args) {
        String word = "level"; // Hardcoded string

        // Use Stack strategy
        PalindromeChecker stackChecker = new PalindromeChecker(new StackStrategy());
        System.out.println("Using StackStrategy: " +
                (stackChecker.isPalindrome(word) ? word + " is a palindrome." : word + " is not a palindrome."));

        // Use Deque strategy
        PalindromeChecker dequeChecker = new PalindromeChecker(new DequeStrategy());
        System.out.println("Using DequeStrategy: " +
                (dequeChecker.isPalindrome(word) ? word + " is a palindrome." : word + " is not a palindrome."));
    }
}
