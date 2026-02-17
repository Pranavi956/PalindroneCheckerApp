/**
 * UC1: Application Entry & Welcome Message
 * Palindrome Checker Application
 */
public class PalindromeCheckerApp {

    // Application constants
    static final String APP_NAME = "Palindrome Checker Application";
    static final String APP_VERSION = "Version 1.0";

    /**
     * Main Method - Entry point of the Java Application
     * JVM invokes this method without creating an object (static keyword)
     */
    public static void main(String[] args) {

        // Program starts
        System.out.println("====================================");
        System.out.println("Welcome to " + APP_NAME);
        System.out.println(APP_VERSION);
        System.out.println("====================================");

        // Original string
        String original = "racecar";

        // Create Stack
        java.util.Stack<Character> stack = new java.util.Stack<>();

        // Push characters into stack
        for (int i = 0; i < original.length(); i++) {
            stack.push(original.charAt(i));
        }

        // Pop and compare
        boolean isPalindrome = true;

        for (int i = 0; i < original.length(); i++) {
            char poppedChar = stack.pop();

            if (original.charAt(i) != poppedChar) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if (isPalindrome) {
            System.out.println("The string \"" + original + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + original + "\" is NOT a Palindrome.");
        }

        // Program exits
        System.out.println("Program finished.");
    }

}
