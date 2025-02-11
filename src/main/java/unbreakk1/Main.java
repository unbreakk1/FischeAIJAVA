package unbreakk1;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello and welcome!");

        String original = "Cookie cutter program!";
        String reversed = reverseString(original);

        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);

        System.out.println(isPalindrome("anna"));
        System.out.println(isPalindrome("hello"));
        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome(""));
        System.out.println(isPalindrome(null));


        int n = 10;
        List<Integer> primes = generatePrimes(n);

        System.out.println("The first " + n + " prime numbers are: " + primes);
    }

    public static String reverseString(String input)
    {
        if (input == null || input.isEmpty())
            return input;


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
            if (input.charAt(left) != input.charAt(right))
                return false;

            left++;
            right--;
        }
        return true;
    }

    public static List<Integer> generatePrimes(int n)
    {
        List<Integer> primes = new ArrayList<>();
        int number = 2;

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
        if (num < 2)
            return false;

        for (int i = 2; i <= Math.sqrt(num); i++)
        {
            if (num % i == 0)
                return false;

        }
        return true;
    }
}