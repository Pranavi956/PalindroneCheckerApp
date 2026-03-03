/**
 * UC13: Performance Comparison
 * Palindrome Checker Application
 */
public class PalindromeCheckerApp {

    /**
     * Application entry point for UC13.
     */
    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("Welcome to Palindrome Checker Application");
        System.out.println("Version 13.0");
        System.out.println("====================================");

        String input = "racecar";

        // Strategy 1: Stack
        PalindromeStrategy stackStrategy = new StackStrategy();

        long startTime = System.nanoTime();
        boolean result1 = stackStrategy.check(input);
        long endTime = System.nanoTime();

        long stackDuration = endTime - startTime;

        // Strategy 2: Deque
        PalindromeStrategy dequeStrategy = new DequeStrategy();

        startTime = System.nanoTime();
        boolean result2 = dequeStrategy.check(input);
        endTime = System.nanoTime();

        long dequeDuration = endTime - startTime;

        // Display results
        System.out.println("Input: " + input);
        System.out.println("Stack Strategy Result: " + result1);
        System.out.println("Stack Execution Time (ns): " + stackDuration);

        System.out.println("Deque Strategy Result: " + result2);
        System.out.println("Deque Execution Time (ns): " + dequeDuration);

        System.out.println("Program finished.");
    }
}


/**
 * Strategy Interface
 */
interface PalindromeStrategy {
    boolean check(String input);
}


/**
 * Stack-Based Strategy
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
 * Deque-Based Strategy
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