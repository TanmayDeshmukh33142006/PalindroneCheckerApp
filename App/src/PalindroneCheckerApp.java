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

// Main application
public class PalindroneCheckerApp {
    // Approach 1: Simple two-pointer check
    public static boolean twoPointerCheck(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    // Approach 2: Stack-based check
    public static boolean stackCheck(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) stack.push(c);
        String reversed = "";
        while (!stack.isEmpty()) reversed += stack.pop();
        return str.equals(reversed);
    }

    // Approach 3: Deque-based check
    public static boolean dequeCheck(String str) {
        Deque<Character> deque = new LinkedList<>();
        for (char c : str.toCharArray()) deque.addLast(c);
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String word = "racecar"; // Hardcoded test string

        // Two-pointer approach timing
        long start1 = System.nanoTime();
        boolean result1 = twoPointerCheck(word);
        long end1 = System.nanoTime();
        System.out.println("Two-pointer result: " + result1 + " | Time: " + (end1 - start1) + " ns");

        // Stack approach timing
        long start2 = System.nanoTime();
        boolean result2 = stackCheck(word);
        long end2 = System.nanoTime();
        System.out.println("Stack result: " + result2 + " | Time: " + (end2 - start2) + " ns");

        // Deque approach timing
        long start3 = System.nanoTime();
        boolean result3 = dequeCheck(word);
        long end3 = System.nanoTime();
        System.out.println("Deque result: " + result3 + " | Time: " + (end3 - start3) + " ns");
    }
}
