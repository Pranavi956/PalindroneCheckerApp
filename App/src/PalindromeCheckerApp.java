/**
 * UC12: Strategy Pattern for Palindrome Algorithms
 * Palindrome Checker Application
 */
public class PalindromeCheckerApp {

    /**
     * Application entry point for UC12.
     */
    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("Welcome to Palindrome Checker Application");
        System.out.println("Version 12.0");
        System.out.println("====================================");

        String original = "racecar";

        // Choose strategy at runtime
        PalindromeStrategy strategy;

        // Change this to test different strategies
        strategy = new StackStrategy();
        // strategy = new DequeStrategy();

        boolean isPalindrome = strategy.check(original);

        if (isPalindrome) {
            System.out.println("The string \"" + original + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + original + "\" is NOT a Palindrome.");
        }

        System.out.println("Program finished.");
    }
}


/**
 * INTERFACE – PalindromeStrategy
 * Defines contract for all palindrome algorithms.
 */
interface PalindromeStrategy {
    boolean check(String input);
}


/**
 * CLASS – StackStrategy
 * Uses Stack-based palindrome checking.
 */
class StackStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        java.util.Stack<Character> stack = new java.util.Stack<>();

        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}


/**
 * CLASS – DequeStrategy
 * Uses Deque-based palindrome checking.
 */
class DequeStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        java.util.Deque<Character> deque = new java.util.LinkedList<>();

        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }
}