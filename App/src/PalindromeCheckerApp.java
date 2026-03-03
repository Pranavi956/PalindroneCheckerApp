/**
 * UC7: Deque Based Optimized Palindrome Checker
 * Palindrome Checker Application
 */
public class PalindromeCheckerApp {

    /**
     * Application entry point for UC7.
     */
    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("Welcome to Palindrome Checker Application");
        System.out.println("Version 7.0");
        System.out.println("====================================");

        String original = "racecar";

        // Create Deque (Double Ended Queue)
        java.util.Deque<Character> deque = new java.util.LinkedList<>();

        // Insert characters into deque
        for (int i = 0; i < original.length(); i++) {
            deque.addLast(original.charAt(i));
        }

        boolean isPalindrome = true;

        // Compare front and rear elements
        while (deque.size() > 1) {

            char frontChar = deque.removeFirst();
            char rearChar = deque.removeLast();

            if (frontChar != rearChar) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("The string \"" + original + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + original + "\" is NOT a Palindrome.");
        }

        System.out.println("Program finished.");
    }
}