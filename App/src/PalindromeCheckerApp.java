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

        // Convert string to character array
        char[] chars = original.toCharArray();

        // Two-pointer approach
        int start = 0;
        int end = chars.length - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
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
