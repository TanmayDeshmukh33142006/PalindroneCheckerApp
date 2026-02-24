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
    // Node class for singly linked list
    static class Node {
        char data;
        Node next;
        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method to convert string into linked list
    public static Node buildLinkedList(String word) {
        Node head = null;
        Node tail = null;
        for (int i = 0; i < word.length(); i++) {
            Node newNode = new Node(word.charAt(i));
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        return head;
    }

    // Method to reverse a linked list
    public static Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        while (current != null) {
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }

    // Method to check palindrome using linked list
    public static boolean isPalindrome(Node head) {
        if (head == null || head.next == null) return true;

        // Find middle using fast & slow pointer
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        Node secondHalf = reverse(slow.next);

        // Compare halves
        Node firstHalf = head;
        Node temp = secondHalf;
        boolean palindrome = true;
        while (temp != null) {
            if (firstHalf.data != temp.data) {
                palindrome = false;
                break;
            }
            firstHalf = firstHalf.next;
            temp = temp.next;
        }

        return palindrome;
    }
    public static void main(String[] args) {
        String word = "radar"; // Hardcoded string

        Node head = buildLinkedList(word);

        if (isPalindrome(head)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}