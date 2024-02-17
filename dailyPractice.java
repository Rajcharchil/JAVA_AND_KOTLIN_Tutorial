
import java.util.Scanner;

// Program to Find all Roots of a Quadratic Equation:

public class QuadraticRoots {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter coefficients a, b and c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double discriminant = b * b - 4 * a * c;
        double root1, root2;
        if (discriminant > 0) {
            root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Roots are real and different.");
            System.out.println("Root 1 = " + root1 + " and Root 2 = " + root2);
        } else if (discriminant == 0) {
            root1 = root2 = -b / (2 * a);
            System.out.println("Roots are real and same.");
            System.out.println("Root 1 = Root 2 = " + root1);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("Roots are complex and different.");
            System.out.println("Root 1 = " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2 = " + realPart + " - " + imaginaryPart + "i");
        }
        scanner.close();
    }
}


// Program to Check Leap Year:
// import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = scanner.nextInt();
        boolean isLeap = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    isLeap = true;
                else
                    isLeap = false;
            } else
                isLeap = true;
        } else {
            isLeap = false;
        }
        if (isLeap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
        scanner.close();
    }
}


// Program to Check Whether a Number is Positive or Negative:
// import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double num = scanner.nextDouble();
        if (num > 0)
            System.out.println(num + " is positive.");
        else if (num < 0)
            System.out.println(num + " is negative.");
        else
            System.out.println(num + " is zero.");
        scanner.close();
    }
}


// Program to Check Whether a Character is Alphabet or Not:
public class AlphabetOrNot {
    public static void main(String[] args) {
        char ch = 'A';
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
            System.out.println(ch + " is an alphabet.");
        else
            System.out.println(ch + " is not an alphabet.");
    }
}


// Program to Calculate the Sum of Natural Numbers:
// import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; ++i) {
            sum += i;
        }
        System.out.println("Sum = " + sum);
        scanner.close();
    }
}


// Program to Find Factorial of a Number:
// import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        long factorial = 1;
        for (int i = 1; i <= num; ++i) {
            factorial *= i;
        }
        System.out.println("Factorial of " + num + " = " + factorial);
        scanner.close();
    }
}


// Program to Generate Multiplication Table:
// import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();
        System.out.println("Multiplication table of " + num + ":");
        for (int i = 1; i <= 10; ++i) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        scanner.close();
    }
}


// Program to Display Fibonacci Series:
public class Fibonacci {
    public static void main(String[] args) {
        int n = 10, t1 = 0, t2 = 1;
        System.out.print("First " + n + " terms: ");
        for (int i = 1; i <= n; ++i) {
            System.out.print(t1 + " + ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}


// Program to Find GCD of two Numbers:
// import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int gcd = 1;
        for (int i = 1; i <= num1 && i <= num2; ++i) {
            if (num1 % i == 0 && num2 % i == 0)
                gcd = i;
        }
        System.out.println("GCD of " + num1 + " and " + num2 + " = " + gcd);
        scanner.close();
    }
}


// Program to Find LCM of two Numbers:
// import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int lcm = (num1 > num2) ? num1 : num2;
        while(true) {
            if( lcm % num1 == 0 && lcm % num2 == 0 ) {
                System.out.println("LCM of " + num1 + " and " + num2 + " = " + lcm);
                break;
            }
            ++lcm;
        }
        scanner.close();
    }
}


// Program to Display Alphabets (A to Z) using loop:
public class Alphabets {
    public static void main(String[] args) {
        char ch;
        for(ch = 'A'; ch <= 'Z'; ++ch)
            System.out.print(ch + " ");
    }
}


// Program to Count Number of Digits in an Integer:
// import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        long num = scanner.nextLong();
        int count = 0;
        while(num != 0) {
            num /= 10;
            ++count;
        }
        System.out.println("Number of digits: " + count);
        scanner.close();
    }
}


// Program to Reverse a Number:
// import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        int reversed = 0;
        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println("Reversed number: " + reversed);
        scanner.close();
    }
}


// Program to Calculate the Power of a Number:
public class Power {
    public static void main(String[] args) {
        int base = 3, exponent = 4;
        long result = 1;
        while(exponent != 0) {
            result *= base;
            --exponent;
        }
        System.out.println("Result: " + result);
    }
}


// Program to Check Palindrome:
// import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        int originalNum = num;
        int reversedNum = 0;
        while(num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        if(originalNum == reversedNum)
            System.out.println(originalNum + " is a palindrome.");
        else
            System.out.println(originalNum + " is not a palindrome.");
        scanner.close();
    }
}


// Program to Check Whether a Number is Prime or Not:
// import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        boolean isPrime = true;
        if (num <= 1)
            isPrime = false;
        else {
            for (int i = 2; i <= Math.sqrt(num); ++i) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
        scanner.close();
    }
}


// Program to Display Prime Numbers Between Two Intervals:
// import java.util.Scanner;

public class PrimeNumbersBetweenIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        System.out.println("Prime numbers between " + start + " and " + end + " are: ");
        while (start < end) {
            boolean flag = false;
            for(int i = 2; i <= start/2; ++i) {
                if(start % i == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag && start != 0 && start != 1)
                System.out.print(start + " ");
            ++start;
        }
        scanner.close();
    }
}


// Program to Check Armstrong Number:
// import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        int originalNum, remainder, result = 0, n = 0;
        originalNum = num;
        while (originalNum != 0) {
            originalNum /= 10;
            ++n;
        }
        originalNum = num;
        while (originalNum != 0) {
            remainder = originalNum % 10;
            result += Math.pow(remainder, n);
            originalNum /= 10;
        }
        if (result == num)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");
        scanner.close();
    }
}


// Program to Display Armstrong Number Between Two Intervals:
// import java.util.Scanner;

public class ArmstrongNumbersBetweenIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        System.out.println("Armstrong numbers between " + start + " and " + end + " are: ");
        for (int i = start; i <= end; ++i) {
            int num = i;
            int n = String.valueOf(num).length();
            int sum = 0;
            while (num != 0) {
                int digit = num % 10;
                sum += Math.pow(digit, n);
                num /= 10;
            }
if (sum == i)
                System.out.print(i + " ");
        }
        scanner.close();
    }
}


// Program to Display Prime Numbers Between Intervals Using Function:
// import java.util.Scanner;

public class PrimeNumbersBetweenIntervalsFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        System.out.println("Prime numbers between " + start + " and " + end + " are: ");
        for (int i = start; i <= end; ++i) {
            if (isPrime(i))
                System.out.print(i + " ");
        }
        scanner.close();
    }

    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(num); ++i) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}


// Program to Display Armstrong Numbers Between Intervals Using Function:
// import java.util.Scanner;

public class ArmstrongNumbersBetweenIntervalsFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        System.out.println("Armstrong numbers between " + start + " and " + end + " are: ");
        for (int i = start; i <= end; ++i) {
            if (isArmstrong(i))
                System.out.print(i + " ");
        }
        scanner.close();
    }

    public static boolean isArmstrong(int num) {
        int n = String.valueOf(num).length();
        int sum = 0;
        int temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, n);
            temp /= 10;
        }
        return sum == num;
    }
}


// Program to Display Factors of a Number:
// import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        System.out.println("Factors of " + num + " are: ");
        for (int i = 1; i <= num; ++i) {
            if (num % i == 0)
                System.out.print(i + " ");
        }
        scanner.close();
    }
}


// Program to Make a Simple Calculator Using switch...case:
// import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        System.out.println("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        double result;
        switch(operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }
        System.out.println("Result: " + result);
        scanner.close();
    }
}


// Program to Check Whether a Number can be Expressed as Sum of Two Prime Numbers:
// import java.util.Scanner;

public class SumOfTwoPrimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            if (isPrime(i)) {
                if (isPrime(num - i)) {
                    System.out.println(num + " = " + i + " + " + (num - i));
                    flag = true;
                }
            }
        }
        if (!flag)
            System.out.println(num + " cannot be expressed as the sum of two prime numbers.");
        scanner.close();
    }

    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(num); ++i) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}


// Program to Find the Sum of Natural Numbers using Recursion:
// import java.util.Scanner;

public class SumOfNaturalNumbersRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int num = scanner.nextInt();
        int sum = sumOfNaturalNumbers(num);
        System.out.println("Sum = " + sum);
        scanner.close();
    }

    public static int sumOfNaturalNumbers(int n) {
        if (n != 0)
            return n + sumOfNaturalNumbers(n - 1);
        else
            return n;
    }
}


// Program to Find Factorial of a Number Using Recursion:
// import java.util.Scanner;

public class FactorialUsingRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a non-negative integer: ");
        int num = scanner.nextInt();
        long factorial = factorial(num);
        System.out.println("Factorial of " + num + " = " + factorial);
        scanner.close();
    }

    public static long factorial(int n) {
        if (n == 0)
            return 1;
        else
            return (n * factorial(n - 1));
    }
}


// Program to Find G.C.D Using Recursion:
// import java.util.Scanner;

public class GCDUsingRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two non-negative integers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int gcd = gcd(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " = " + gcd);
        scanner.close();
    }

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }
}


// Program to Convert Binary Number to Decimal and vice-versa:
// import java.util.Scanner;

public class BinaryDecimalConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose conversion: ");
        System.out.println("1. Binary to Decimal");
        System.out.println("2. Decimal to Binary");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter a binary number: ");
                String binary = scanner.next();
                System.out.println("Decimal equivalent: " + binaryToDecimal(binary));
                break;
            case 2:
                System.out.println("Enter a decimal number: ");
                int decimal = scanner.nextInt();
                System.out.println("Binary equivalent: " + decimalToBinary(decimal));
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
        scanner.close();
    }

    public static int binaryToDecimal(String binary) {
        return Integer.parseInt(binary, 2);
    }

    public static String decimalToBinary(int decimal) {
        return Integer.toBinaryString(decimal);
    }
}


// Program to Convert Octal Number to Decimal and vice-versa:
// import java.util.Scanner;

public class OctalDecimalConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose conversion: ");
        System.out.println("1. Octal to Decimal");
        System.out.println("2. Decimal to Octal");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter an octal number: ");
                String octal = scanner.next();
                System.out.println("Decimal equivalent: " + octalToDecimal(octal));
                break;
            case 2:
                System.out.println("Enter a decimal number: ");
                int decimal = scanner.nextInt();
                System.out.println("Octal equivalent: " + decimalToOctal(decimal));
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
        scanner.close();
    }

    public static int octalToDecimal(String octal) {
        return Integer.parseInt(octal, 8);
    }

    public static String decimalToOctal(int decimal) {
        return Integer.toOctalString(decimal);
    }
}


// Program to Convert Binary Number to Octal and vice-versa:
// import java.util.Scanner;

public class BinaryOctalConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose conversion: ");
        System.out.println("1. Binary to Octal");
        System.out.println("2. Octal to Binary");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter a binary number: ");
                String binary = scanner.next();
                System.out.println("Octal equivalent: " + binaryToOctal(binary));
                break;
            case 2:
                System.out.println("Enter an octal number: ");
                String octal = scanner.next();
                System.out.println("Binary equivalent: " + octalToBinary(octal));
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
        scanner.close();
    }

    public static String binaryToOctal(String binary) {
        int decimal = Integer.parseInt(binary, 2);
        return Integer.toOctalString(decimal);
    }

    public static String octalToBinary(String octal) {
        int decimal = Integer.parseInt(octal, 8);
        return Integer.toBinaryString(decimal);
    }
}


// Program to Reverse a Sentence Using Recursion:
// import java.util.Scanner;

public class ReverseSentenceRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.println("Reversed sentence: " + reverseSentence(sentence));
        scanner.close();
    }

    public static String reverseSentence(String sentence) {
        if (sentence.isEmpty())
            return sentence;
        return reverseSentence(sentence.substring(1)) + sentence.charAt(0);
    }
}


// Program to calculate the power using recursion:
// import java.util.Scanner;

public class PowerRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter base: ");
        int base = scanner.nextInt();
        System.out.println("Enter exponent: ");
        int exponent = scanner.nextInt();
        long result = power(base, exponent);
        System.out.println(base + " raised to the power " + exponent + " = " + result);
        scanner.close();
    }

    public static long power(int base, int exponent) {
        if (exponent != 0)
            return base * power(base, exponent - 1);
        else
            return 1;
    }
}


// Program to Calculate Average Using Arrays:
// import java.util.Scanner;

public class AverageUsingArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = scanner.nextInt();
        double[] arr = new double[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextDouble();
        }
        double sum = 0;
        for (double num : arr) {
            sum += num;
        }
        double average = sum / n;
        System.out.println("Average = " + average);
        scanner.close();
    }
}


// Program to Find Largest Element of an Array:
// import java.util.Scanner;

public class LargestElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Largest element: " + max);
        scanner.close();
    }
}


// Program to Calculate Standard Deviation:
// import java.util.Scanner;

public class StandardDeviation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = scanner.nextInt();
        double[] arr = new double[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextDouble();
        }
        double mean = 0.0, sum = 0.0;
        for (double num : arr) {
            sum += num;
        }
        mean = sum / n;
        double deviation = 0.0;
        for (double num : arr) {
            deviation += Math.pow(num - mean, 2);
        }
        deviation = Math.sqrt(deviation / n);
        System.out.printf("Standard Deviation = %.2f", deviation);
        scanner.close();
    }
}


// Program to Add Two Matrix Using Multi-dimensional Arrays:
// import java.util.Scanner;

public class AddMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of matrix: ");
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        int[][] matrix1 = new int[rows][columns];
        int[][] matrix2 = new int[rows][columns];
        System.out.println("Enter the elements of first matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter the elements of second matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }
        int[][] sum = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("Sum of matrices: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}


// Program to Multiply Two Matrix Using Multi-dimensional Arrays:
// import java.util.Scanner;

public class MultiplyMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of first matrix: ");
        int rows1 = scanner.nextInt();
        int columns1 = scanner.nextInt();
        System.out.println("Enter the number of rows and columns of second matrix: ");
        int rows2 = scanner.nextInt();
        int columns2 = scanner.nextInt();
        if (columns1 != rows2) {
            System.out.println("Matrices cannot be multiplied");
            return;
        }
        int[][] matrix1 = new int[rows1][columns1];
        int[][] matrix2 = new int[rows2][columns2];
        System.out.println("Enter the elements of first matrix: ");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter the elements of second matrix: ");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < columns2; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }
        int[][] product = new int[rows1][columns2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns2; j++) {
                for (int k = 0; k < columns1; k++) {
                    product[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        System.out.println("Product of matrices: ");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns2; j++) {
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}


// Program to Multiply two Matrices by Passing Matrix to a Function:
// import java.util.Scanner;

public class MultiplyMatricesFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of first matrix: ");
        int rows1 = scanner.nextInt();
        int columns1 = scanner.nextInt();
        System.out.println("Enter the number of rows and columns of second matrix: ");
        int rows2 = scanner.nextInt();
        int columns2 = scanner.nextInt();
        if (columns1 != rows2) {
            System.out.println("Matrices cannot be multiplied");
            return;
        }
        int[][] matrix1 = new int[rows1][columns1];
        int[][] matrix2 = new int[rows2][columns2];
        System.out.println("Enter the elements of first matrix: ");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter the elements of second matrix: ");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < columns2; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }
        int[][] product = multiplyMatrices(matrix1, matrix2);
        System.out.println("Product of matrices: ");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns2; j++) {
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int columns1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int columns2 = matrix2[0].length;
        int[][] product = new int[rows1][columns2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns2; j++) {
                for (int k = 0; k < columns1; k++) {
                    product[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return product;
    }
          }
