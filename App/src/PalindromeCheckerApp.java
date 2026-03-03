/**
 * UC11: Object-Oriented Palindrome Service
 * Palindrome Checker Application
 */
public class PalindromeCheckerApp {

    /**
     * Application entry point for UC11.
     */
    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("Welcome to Palindrome Checker Application");
        System.out.println("Version 11.0");
        System.out.println("====================================");

        String original = "racecar";

        // Create service object
        PalindromeService service = new PalindromeService();

        // Call encapsulated logic
        boolean isPalindrome = service.checkPalindrome(original);

        if (isPalindrome) {
            System.out.println("The string \"" + original + "\" is a Palindrome.");
        } else {
            System.out.println("The string \"" + original + "\" is NOT a Palindrome.");
        }

        System.out.println("Program finished.");
    }
}


/**
 * Service class that contains palindrome logic.
 */
class PalindromeService {

    /**
     * Checks whether the input string is a palindrome.
     *
     * @param input Input string
     * @return true if palindrome, false otherwise
     */
    public boolean checkPalindrome(String input) {

        int start = 0;
        int end = input.length() - 1;

        // Compare characters moving inward
        while (start < end) {

            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}