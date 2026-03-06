import java.util.Scanner;

/*
 * MAIN CLASS - UseCase13PalindromeCheckerApp
 *
 * Use Case 13: Performance Comparison
 *
 * Description:
 * This class measures and compares the execution
 * performance of palindrome validation algorithms.
 *
 * It captures start time and end time and calculates
 * total execution duration.
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Record start time
        long startTime = System.nanoTime();

        // Call palindrome checking method
        boolean result = checkPalindrome(input);

        // Record end time
        long endTime = System.nanoTime();

        // Calculate execution time
        long executionTime = endTime - startTime;

        // Display results
        System.out.println("\nInput : " + input);
        System.out.println("Is Palindrome : " + result);
        System.out.println("Execution Time : " + executionTime + " ns");

        scanner.close();
    }

    // Palindrome checking method
    public static boolean checkPalindrome(String input) {

        int start = 0;
        int end = input.length() - 1;

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