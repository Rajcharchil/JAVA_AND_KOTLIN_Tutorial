import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// #####   StringArrayMatrixProgram

public class bestQuestion {

    // Function to reverse a string
    static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    // Function to check if a string is a palindrome
    static boolean isPalindrome(String str) {
        return str.equals(reverseString(str));
    }

    // Function to count occurrences of a character in a string
    static int countCharOccurrences(String str, char target) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == target) {
                count++;
            }
        }
        return count;
    }

    // Function to check if two strings are anagrams
    static boolean areAnagrams(String str1, String str2) {
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);
    }

    // Function to calculate the number of vowels and consonants in a string
    static void countVowelsAndConsonants(String str) {
        int vowels = 0, consonants = 0;
        str = str.toLowerCase();
        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    // Function to swap two numbers without using a third variable
    static void swapNumbers(int a, int b) {
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }

    // Function to check if a vowel is present in a string
    static boolean isVowelPresent(String str) {
        str = str.toLowerCase();
        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                return true;
            }
        }
        return false;
    }

    // Function to check if a number is prime
    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Function to print Fibonacci sequence using recursion
    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Function to check if a list of integers contains only odd numbers
    static boolean containsOnlyOddNumbers(int[] arr) {
        for (int num : arr) {
            if (num % 2 == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reverse a string
        System.out.println("Enter a string to reverse:");
        String inputString = scanner.nextLine();
        System.out.println("Reversed String: " + reverseString(inputString));

        // Check if a string is a palindrome
        System.out.println("Enter a string to check if it's a palindrome:");
        inputString = scanner.nextLine();
        System.out.println("Is Palindrome: " + isPalindrome(inputString));

        // Count occurrences of a character in a string
        System.out.println("Enter a string:");
        inputString = scanner.nextLine();
        System.out.println("Enter a character to count:");
        char targetChar = scanner.next().charAt(0);
        System.out.println("Occurrences of '" + targetChar + "': " + countCharOccurrences(inputString, targetChar));

        // Check if two strings are anagrams
        System.out.println("Enter the first string:");
        String str1 = scanner.next();
        System.out.println("Enter the second string:");
        String str2 = scanner.next();
        System.out.println("Are Anagrams: " + areAnagrams(str1, str2));

        // Calculate the number of vowels and consonants in a string
        System.out.println("Enter a string:");
        inputString = scanner.next();
        countVowelsAndConsonants(inputString);

        // Swap two numbers without using a third variable
        System.out.println("Enter two numbers to swap:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        swapNumbers(num1, num2);

        // Check if a vowel is present in a string
        System.out.println("Enter a string:");
        inputString = scanner.next();
        System.out.println("Vowel Present: " + isVowelPresent(inputString));

        // Check if a number is prime
        System.out.println("Enter a number to check if it's prime:");
        int numToCheck = scanner.nextInt();
        System.out.println("Is Prime: " + isPrime(numToCheck));

        // Print Fibonacci sequence using recursion
        System.out.println("Enter the length of the Fibonacci sequence:");
        int fibLength = scanner.nextInt();
        System.out.print("Fibonacci Sequence: ");
        for (int i = 0; i < fibLength; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();

        // Check if a list of integers contains only odd numbers
        System.out.println("Enter the size of the integer list:");
        int listSize = scanner.nextInt();
        int[] intList = new int[listSize];
        System.out.println("Enter the integers in the list:");
        for (int i = 0; i < listSize; i++) {
            intList[i] = scanner.nextInt();
        }
        System.out.println("Contains Only Odd Numbers: " + containsOnlyOddNumbers(intList));

        scanner.close();
    }
}




public class bestQuestion{
    public static void main(String[] args){
        System.out.println("jai shree ram");

    }
}