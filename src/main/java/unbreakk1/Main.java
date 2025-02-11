package unbreakk1;

import java.util.ArrayList;
import java.util.List;

/**
 * The Main class demonstrates functionalities such as string reversal,
 * palindrome checking, and prime number generation.
 * It showcases the use of utility methods for practical examples.
 */
public class Main
{
    public static void main(String[] args)
    {
        // A welcome message is printed to the console.
        System.out.println("Hello and welcome!");

        // Demonstrating string reversal.
        String original = "Cookie cutter program!";
        String reversed = reverseString(original);

        // Printing the original and reversed strings.
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);

        // Demonstrating palindrome checking with sample inputs.
        System.out.println(isPalindrome("anna"));    // True
        System.out.println(isPalindrome("hello"));   // False
        System.out.println(isPalindrome("racecar")); // True
        System.out.println(isPalindrome(""));        // False (empty string cannot be a palindrome)
        System.out.println(isPalindrome(null));      // False (null is not a palindrome)

        // Generating the first 'n' prime numbers and demonstrating the output.
        int n = 10; // Desired count of primes
        List<Integer> primes = generatePrimes(n);

        // Printing the generated list of prime numbers.
        System.out.println("The first " + n + " prime numbers are: " + primes);
    }

    /**
     * Reverses the given string.
     *
     * @param input The string to reverse.
     * @return The reversed string, or the original input if it is null or empty.
     */
    public static String reverseString(String input)
    {
        // Return the input unchanged if it is null or empty.
        if (input == null || input.isEmpty())
            return input;

        // Use StringBuilder to reverse the string efficiently.
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }

    /**
     * Checks whether the given string is a palindrome.
     *
     * @param input The string to check.
     * @return true if the input is a palindrome; false otherwise.
     */
    public static boolean isPalindrome(String input)
    {
        // Null or empty strings are not considered palindromes.
        if (input == null || input.isEmpty())
            return false;

        // Initialize pointers to start (left) and end (right) of the string.
        int left = 0;
        int right = input.length() - 1;

        // Compare characters from both ends moving inward.
        while (left < right)
        {
            // If characters don't match, it's not a palindrome.
            if (input.charAt(left) != input.charAt(right))
                return false;

            // Move the pointers closer to the center.
            left++;
            right--;
        }

        // All characters matched; input is a palindrome.
        return true;
    }

    /**
     * Generates a list of the first 'n' prime numbers.
     *
     * @param n The number of prime numbers to generate.
     * @return A list containing the first 'n' prime numbers.
     */
    public static List<Integer> generatePrimes(int n)
    {
        // A list to store the prime numbers.
        List<Integer> primes = new ArrayList<>();
        int number = 2; // The first prime number.

        // Continue generating primes until the list contains 'n' elements.
        while (primes.size() < n)
        {
            // Check if the current number is prime. If so, add it to the list.
            if (isPrime(number)) {
                primes.add(number);
            }
            number++; // Increment number to check the next.
        }
        // Return the filled list of prime numbers.
        return primes;
    }

    /**
     * Checks whether a given number is prime.
     *
     * @param num The number to check.
     * @return true if the number is prime; false otherwise.
     */
    private static boolean isPrime(int num)
    {
        // Numbers less than 2 are not prime.
        if (num < 2)
            return false;

        // Check divisors from 2 to the square root of the number.
        for (int i = 2; i <= Math.sqrt(num); i++)
        {
            // If the number is divisible by 'i', it is not prime.
            if (num % i == 0)
                return false;
        }
        // The number passed all tests; it is prime.
        return true;
    }
}
