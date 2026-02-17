/**
 * UC1: Application Entry & Welcome Message
 * Palindrome Checker Application
 */
public class UseCase1PalindromeCheckerApp {

    // Application constants
    static final String APP_NAME = "Palindrome Checker Application";
    static final String APP_VERSION = "Version 1.0";

    /**
     * Main Method - Entry point of the Java Application
     * JVM invokes this method without creating an object (static keyword)
     */
    public static void main(String[] args) {

        // Display Welcome Message
        System.out.println("====================================");
        System.out.println("Welcome to " + APP_NAME);
        System.out.println(APP_VERSION);
        System.out.println("====================================");

        // Application startup completed
        System.out.println("Application started successfully.");
        System.out.println("Ready to proceed to the next use case.");
    }
}
