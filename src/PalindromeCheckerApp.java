import java.util.Scanner;

/*
 * UC11 - Object-Oriented Palindrome Service
 *
 * This program checks whether a given string is a palindrome
 * using object-oriented design.
 * The palindrome logic is encapsulated inside the PalindromeService class.
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Create object of service class
        PalindromeService service = new PalindromeService();

        // Call palindrome method
        boolean result = service.checkPalindrome(input);

        // Display result
        System.out.println("Input: " + input);
        System.out.println("Is Palindrome: " + result);

        scanner.close();
    }
}

/*
 * Service class that contains palindrome logic
 */
class PalindromeService {

    // Method to check palindrome
    public boolean checkPalindrome(String input) {

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