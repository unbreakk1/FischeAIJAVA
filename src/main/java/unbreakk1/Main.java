package unbreakk1;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello and welcome!");

        String original = "olleH";
        String reversed = reverseString(original);

        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);

        int n = 10; // Generate the first 10 prime numbers
        List<Integer> primes = generatePrimes(n);

        System.out.println("The first " + n + " prime numbers are: " + primes);
    }

    public static String reverseString(String input)
    {
        if (input == null || input.isEmpty())
            return input; // Return the input as is if it's null or empty


        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }

    public static boolean isPalindrome(String input)
    {
        if (input == null || input.isEmpty())
            return false;


        int left = 0;
        int right = input.length() - 1;

        while (left < right)
        {
            // Compare characters at the two ends
            if (input.charAt(left) != input.charAt(right))
                return false; // If characters differ, it's not a palindrome

            left++;
            right--;
        }
        return true; // String is a palindrome
    }

    public static List<Integer> generatePrimes(int n)
    {
        List<Integer> primes = new ArrayList<>();
        int number = 2; // The first prime number

        while (primes.size() < n)
        {
            if (isPrime(number)) {
                primes.add(number);
            }
            number++;
        }

        return primes;
    }

    // Helper method to check if a number is prime
    private static boolean isPrime(int num)
    {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++)
        {
            if (num % i == 0)
                return false;

        }
        return true;
    }
}