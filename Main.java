
import java.util.*;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
// 2. User Input:
// java

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter something: ");
        String userInput = scanner.nextLine();
        System.out.println("You entered: " + userInput);
        scanner.close();
    }
}
// 3. Even or Odd:
// java

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

        scanner.close();
    }
}
// 4. Factorial Calculation:
// java

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        long factorial = 1;
        for (int i = 1; i <= n; ++i) {
            factorial *= i;
        }

        System.out.println("Factorial of " + n + " = " + factorial);

        scanner.close();
    }
}
// 5. Palindrome Check:
// java

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String reversed = new StringBuilder(input).reverse().toString();

        if (input.equalsIgnoreCase(reversed)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }

        scanner.close();
    }
}
// 6. Fibonacci Series:
// java

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        int first = 0, second = 1;

        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < n; ++i) {
            System.out.print(first + ", ");

            int next = first + second;
            first = second;
            second = next;
        }

        scanner.close();
    }
}

// 7. Array Sum:

public class ArraySum {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        int sum = 0;

        for (int num : array) {
            sum += num;
        }

        System.out.println("Sum of array elements: " + sum);
    }
}

// 8. Find Maximum Element:

public class FindMaxElement {
    public static void main(String[] args) {
        int[] array = { 10, 5, 7, 3, 15, 20 };
        int max = array[0];

        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Maximum element in the array: " + max);
    }
}

// 9. String Reversal:
// java

public class StringReversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String reversed = "";
        for (int i = input.length() - 1; i >= 0; --i) {
            reversed += input.charAt(i);
        }

        System.out.println("Reversed string: " + reversed);

        scanner.close();
    }
}
// 10. Binary to Decimal Conversion:
// java

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binary = scanner.nextLine();

        int decimal = Integer.parseInt(binary, 2);

        System.out.println("Decimal equivalent: " + decimal);

        scanner.close();
    }
}
// 11. Bubble Sort:

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = { 64, 25, 12, 22, 11 };
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.print("Sorted array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
// 12. File Handling:
// Assuming you have a file named "example.txt" with some text in it:

// java
// Copy code
// import java.io.BufferedReader;
// import java.io.FileReader;
// import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) {
        String fileName = "example.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
// 13. Inheritance:

class BaseClass {
    void displayBase() {
        System.out.println("This is the base class.");
    }
}

class DerivedClass extends BaseClass {
    void displayDerived() {
        System.out.println("This is the derived class.");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        DerivedClass derivedObj = new DerivedClass();
        derivedObj.displayBase();
        derivedObj.displayDerived();
    }
}