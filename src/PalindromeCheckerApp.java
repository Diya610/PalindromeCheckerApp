import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a text: ");
        String input = sc.nextLine();

        // Normalize string
        // Convert to lowercase and remove spaces
        String normalized = input.toLowerCase().replaceAll("\\s+", "");

        boolean isPalindrome = true;

        int start = 0;
        int end = normalized.length() - 1;

        // Check palindrome
        while(start < end) {

            if(normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        // Output
        System.out.println("Original Input: " + input);
        System.out.println("Processed Input: " + normalized);
        System.out.println("Is Palindrome: " + isPalindrome);

        sc.close();
    }
}