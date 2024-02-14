
// Program to Print an Integer (Entered by the User):
import.java.util.*

public class PrintInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        System.out.println("You entered: " + num);
        scanner.close();
    }
}






// Program to Add Two Integers:


public class AddIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
System.out.println("Sum: " + sum);
        scanner.close();
    }
}



// Program to Multiply two Floating Point Numbers:


public class MultiplyFloats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first floating point number: ");
        float num1 = scanner.nextFloat();
        System.out.print("Enter second floating point number: ");
        float num2 = scanner.nextFloat();
        float product = num1 * num2;
        System.out.println("Product: " + product);
        scanner.close();
    }
}


// Program to Find ASCII Value of a character:


public class ASCIIFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        int asciiValue = (int) ch;
        System.out.println("ASCII value of " + ch + " is: " + asciiValue);
        scanner.close();
    }
}


// Program to Compute Quotient and Remainder:


public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter dividend: ");
        int dividend = scanner.nextInt();
        System.out.print("Enter divisor: ");
        int divisor = scanner.nextInt();
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
        scanner.close();
    }
}


// Program to Swap Two Numbers:


public class SwapNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);
        scanner.close();
    }
}


// Program to Check Whether a Number is Even or Odd:


public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
        scanner.close();
    }
}


// Program to Check Whether an Alphabet is Vowel or Consonant:


public class VowelConsonantChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println(ch + " is a vowel.");
        } else {
            System.out.println(ch + " is a consonant.");
        }
        scanner.close();
    }
}


// Program to Find the Largest Among Three Numbers:


public class LargestAmongThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter third number: ");
        double num3 = scanner.nextDouble();
        double largest = num1 > num2 ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
        System.out.println("Largest number: " + largest);
        scanner.close();
    }
}


// Program to Find all Roots of a Quadratic Equation:


public class QuadraticRoots {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter coefficients a, b, and c of quadratic equation (ax^2 + bx + c): ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Roots are real and different.");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("Roots are real and same.");
            System.out.println("Root: " + root);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("Roots are complex and different.");
            System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
        }
        scanner.close();
    }
}


// Program to Check Leap Year:




public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        boolean isLeapYear = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        scanner.close();
    }
}


// Program to Check Whether a Number is Positive or Negative:




public class PositiveNegativeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = scanner.nextDouble();
        if (num > 0) {
            System.out.println(num + " is positive.");
        } else if (num < 0) {
            System.out.println(num + " is negative.");
        } else {
            System.out.println(num + " is zero.");
        }
        scanner.close();
    }
}


// Program to Check Whether a Character is Alphabet or Not:
public class AlphabetChecker {
    public static void main(String[] args) {
        char ch = 'G';
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is an alphabet.");
        } else {
            System.out.println(ch + " is not an alphabet.");
        }
    }
}


// Program to Calculate the Sum of Natural Numbers:




public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum of first " + n + " natural numbers: " + sum);
        scanner.close();
    }
}


// Program to Find Factorial of a Number:




public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int n = scanner.nextInt();
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + n + ": " + factorial);
        scanner.close();
    }
}


// Program to Generate Multiplication Table:




public class MultiplicationTableGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number for which you want to generate multiplication table: ");
        int num = scanner.nextInt();
        System.out.print("Enter the limit for the multiplication table: ");
        int limit = scanner.nextInt();
        for (int i = 1; i <= limit; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
        scanner.close();
    }
}


// Program to Display Fibonacci Series:
public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10; 
      
      Number of Fibonacci terms to be displayed
        int a = 0, b = 1;
        System.out.println("Fibonacci Series:");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}


// Program to Find GCD of two Numbers:




public class GCDCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        int gcd = findGCD(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + ": " + gcd);
        scanner.close();
    }

    public static int findGCD(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return findGCD(num2, num1 % num2);
    }
}


// Program to Find LCM of two Numbers:




public class LCMCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        int lcm = (num1 * num2) / findGCD(num1, num2);
        System.out.println("LCM of " + num1 + " and " + num2 + ": " + lcm);
        scanner.close();
    }

    public static int findGCD(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return findGCD(num2, num1 % num2);
    }
}


// Program to Display Alphabets (A to Z) using loop:
public class AlphabetsDisplay {
    public static void main(String[] args) {
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch + " ");
        }
    }
}


// Program to Count Number of Digits in an Integer:




public class DigitCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        long num = scanner.nextLong();
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        System.out.println("Number of digits: " + count);
        scanner.close();
    }
}


// Program to Reverse a Number:




public class NumberReverser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println("Reversed number: " + reversed);
        scanner.close();
    }
}


// Program to Calculate the Power of a Number:




public class PowerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base number: ");
        int base = scanner.nextInt();
        System.out.print("Enter exponent: ");
        int exponent = scanner.nextInt();
        long result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        System.out.println("Result: " + result);
        scanner.close();
    }
}


// Program to Check Palindrome:




public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string or number: ");
        String str = scanner.nextLine();
        if (isPalindrome(str)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
        scanner.close();
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}


// Program to Check Whether a Number is Prime or Not:




public class PrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = scanner.nextInt();
        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
        scanner.close();
    }

    public static boolean isPrime(int num) {
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
                    }
