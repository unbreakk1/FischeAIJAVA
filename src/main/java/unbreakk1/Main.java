package unbreakk1;

public class Main
{
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        // Example usage of reverseString method
        String original = "olleH";
        String reversed = reverseString(original);

        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
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
}