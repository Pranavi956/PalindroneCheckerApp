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

        // Hardcoded String Literal
        String word = "madam";

        // Check if the string is a palindrome
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Conditional Statement (if-else)
        if (word.equals(reversed)) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }

        // Program exits
        System.out.println("Program finished.");
    }
}
