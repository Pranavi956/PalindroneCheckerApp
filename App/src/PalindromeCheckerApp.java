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

        // Original String (Hardcoded)
        String original = "level";

        // Reverse string using for loop
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);   // String concatenation
        }

        // Compare original and reversed using equals()
        if (original.equals(reversed)) {
            System.out.println("The string \"" + original + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + original + "\" is NOT a Palindrome.");
        }

        // Program exits
        System.out.println("Program finished.");
    }
}
