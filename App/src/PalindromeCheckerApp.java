public static void main(String[] args) {

    // Program starts
    System.out.println("====================================");
    System.out.println("Welcome to " + APP_NAME);
    System.out.println(APP_VERSION);
    System.out.println("====================================");

    // Original string
    String original = "racecar";

    // Create Stack (LIFO)
    java.util.Stack<Character> stack = new java.util.Stack<>();

    // Create Queue (FIFO)
    java.util.Queue<Character> queue = new java.util.LinkedList<>();

    // Insert characters into both Stack and Queue
    for (int i = 0; i < original.length(); i++) {
        char ch = original.charAt(i);
        stack.push(ch);     // LIFO
        queue.add(ch);      // FIFO
    }

    // Compare elements
    boolean isPalindrome = true;

    while (!stack.isEmpty() && !queue.isEmpty()) {

        char fromStack = stack.pop();      // Last In First Out
        char fromQueue = queue.remove();  // First In First Out

        if (fromStack != fromQueue) {
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