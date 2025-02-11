# Java Utility Program: String Manipulation and Prime Number Generation

This Java program demonstrates key utility methods for common programming tasks using basic algorithms. It showcases string manipulation (reversal and palindrome checking) and the generation of prime numbers. The code includes detailed examples and reusable methods for learning or general-purpose applications.

---

## Features

1. **String Reversal**:
    - Input: A string.
    - Output: The reversed version of the input string.
    - Handles null and empty strings appropriately.

2. **Palindrome Checking**:
    - Input: A string.
    - Output: A boolean indicating whether the input is a palindrome.
    - Palindromes are strings that read the same forwards and backwards.
    - Handles null and empty strings with appropriate validation.

3. **Prime Number Generation**:
    - Input: The number of prime numbers to generate.
    - Output: A list of the first 'n' prime numbers.
    - Validates primality using a straightforward algorithm.

---

## How to Use

1. Clone the repository or download the source code.
2. Open the `Main` class and run the `main` method to see the demonstration of various functionalities.
3. Use the utility methods for custom inputs as needed.

---

## Code Examples

### String Reversal

```java
String original = "Hello, World!";
String reversed = Main.reverseString(original);
System.out.println(reversed); // Output: "!dlroW ,olleH"
```

### Palindrome Checking

```java
boolean result = Main.isPalindrome("racecar");
System.out.println(result); // Output: true
```

### Prime Number Generation

```java
List<Integer> primes = Main.generatePrimes(5);
System.out.println(primes); // Output: [2, 3, 5, 7, 11]
```

---

## Methods

### `reverseString(String input)`
- **Description**: Reverses the input string.
- **Input**: `String input` (nullable).
- **Output**: `String` (reversed).

### `isPalindrome(String input)`
- **Description**: Checks if the input string is a palindrome.
- **Input**: `String input` (nullable).
- **Output**: `boolean` (true if palindrome, false otherwise).

### `generatePrimes(int n)`
- **Description**: Generates the first `n` prime numbers.
- **Input**: `int n` (number of primes).
- **Output**: `List<Integer>` of primes.

---

## Requirements

- Java 8 or later.

---

## License

This project is open-source, use it freely for personal or educational purposes.
