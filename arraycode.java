import java.util.*;
import java.util.Arrays;

public class arraycode {
    public static void reverseArray(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}

    //// ==============================================================================================

    //// Find the Maximum Element in an Array:

    int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    //// Remove Duplicates from Sorted Array:

    int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    // ================================================================================
    int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    // ================================================================================

    void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, k = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }

    //// ================================================================================

    void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    // ================================================================================
    /// Find Missing Number:

    int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n * (n + 1) / 2;
        for (int num : nums) {
            sum -= num;
        }
        return sum;
    }

    // ================================================================================

    /// Implement a Stack using Arrays:

    class Stack {
        private static final int MAX_SIZE = 1000;
        private int[] arr;
        private int top;

        Stack() {
            arr = new int[MAX_SIZE];
            top = -1;
        }

        void push(int value) {
            if (top >= MAX_SIZE - 1) {
                throw new StackOverflowError();
            }
            arr[++top] = value;
        }

        int pop() {
            if (top < 0) {
                throw new EmptyStackException();
            }
            return arr[top--];
        }

        int peek() {
            if (top < 0) {
                throw new EmptyStackException();
            }
            return arr[top];
        }

        boolean isEmpty() {
            return top < 0;
        }
    }

    // ================================================================================

    /// Check if a String is a Palindrome:

    boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // ================================================================================

    // Implement Binary Search:

    int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    // ================================================================================

    /// Calculate Factorial:

    int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // ================================================================================

    // Check for Balanced Parentheses:

    public class arraycode {

        public static boolean isBalanced(String s) {
            Stack<Character> stack = new Stack<>();
            for (char ch : s.toCharArray()) {
                if (ch == '(' || ch == '{' || ch == '[') {
                    stack.push(ch);
                } else if (ch == ')' && !stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else if (ch == '}' && !stack.isEmpty() && stack.peek() == '{') {
                    stack.pop();
                } else if (ch == ']' && !stack.isEmpty() && stack.peek() == '[') {
                    stack.pop();
                } else {
                    return false;
                }
            }
            return stack.isEmpty();
        }

    }
    // //================================================================================

    // Find Intersection of Two Arrays:

    public class arraycode {

        public static int[] intersection(int[] nums1, int[] nums2) {
            Set<Integer> set1 = new HashSet<>();
            Set<Integer> result = new HashSet<>();
            for (int num : nums1) {
                set1.add(num);
            }
            for (int num : nums2) {
                if (set1.contains(num)) {
                    result.add(num);
                }
            }
            return result.stream().mapToInt(Integer::intValue).toArray();
        }
    }

    //// =======================================================================================

    public class MaxOfTwoNumbers {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter two numbers:");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int result = findMax(num1, num2);
            System.out.println("Maximum of " + num1 + " and " + num2 + " is: " + result);
        }

        static int findMax(int a, int b) {
            return (a > b) ? a : b;
        }
    }

    //// =============================================================================================

    public class Factorial {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number:");
            int num = scanner.nextInt();
            int result = calculateFactorial(num);
            System.out.println("Factorial of " + num + " is: " + result);
        }

        static int calculateFactorial(int n) {
            if (n == 0 || n == 1) {
                return 1;
            } else {
                return n * calculateFactorial(n - 1);
            }
        }
    }
    //// =============================================================================================

    public class PrimeNumber {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number:");
            int num = scanner.nextInt();
            boolean isPrime = checkPrime(num);
            System.out.println(num + (isPrime ? " is prime." : " is not prime."));
        }

        static boolean checkPrime(int n) {
            if (n <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
    //// =============================================================================================

    public class ReverseString {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a string:");
            String input = scanner.nextLine();
            String reversed = reverseString(input);
            System.out.println("Reversed string: " + reversed);
        }

        static String reverseString(String str) {
            StringBuilder reversed = new StringBuilder();
            for (int i = str.length() - 1; i >= 0; i--) {
                reversed.append(str.charAt(i));
            }
            return reversed.toString();
        }
    }
    //// =============================================================================================

    public class SumOfDigits {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number:");
            int num = scanner.nextInt();
            int sum = calculateSumOfDigits(num);
            System.out.println("Sum of digits in " + num + " is: " + sum);
        }

        static int calculateSumOfDigits(int n) {
            int sum = 0;
            while (n != 0) {
                sum += n % 10;
                n /= 10;
            }
            return sum;
        }
    }
    //// =============================================================================================

    public class AverageOfThreeNumbers {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter three numbers:");
            double num1 = scanner.nextDouble();
            double num2 = scanner.nextDouble();
            double num3 = scanner.nextDouble();
            double average = calculateAverage(num1, num2, num3);
            System.out.println("Average of three numbers is: " + average);
        }

        static double calculateAverage(double a, double b, double c) {
            return (a + b + c) / 3;
        }
    }
    //// =============================================================================================

    public class PalindromeCheck {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a string:");
            String input = scanner.nextLine();
            boolean isPalindrome = checkPalindrome(input);
            System.out.println(input + (isPalindrome ? " is a palindrome." : " is not a palindrome."));
        }

        static boolean checkPalindrome(String str) {
            StringBuilder reversed = new StringBuilder();
            for (int i = str.length() - 1; i >= 0; i--) {
                reversed.append(str.charAt(i));
            }
            return str.equals(reversed.toString());
        }
    }
    //// =============================================================================================

    public class GCD {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter two numbers:");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int gcd = findGCD(num1, num2);
            System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
        }

        static int findGCD(int a, int b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }
    }
    //// =============================================================================================

    public class FibonacciSeries {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number of terms for Fibonacci series:");
            int n = scanner.nextInt();
            System.out.println("Fibonacci series up to " + n + " terms:");
            for (int i = 0; i < n; i++) {
                System.out.print(fibonacci(i) + " ");
            }
        }

        static int fibonacci(int n) {
            if (n == 0) {
                return 0;
            } else if (n == 1) {
                return 1;
            } else {
                return fibonacci(n - 1) + fibonacci(n - 2);
            }
        }
    }

    //// 10. Write a Java program to find the square root of a number using a
    //// function.
    //// =============================================================================================

public class SquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        double num = scanner.nextDouble();
        double squareRoot = findSquareRoot(num);
        System.out.println("Square root of " + num + " is: " + squareRoot);
    }

    static double findSquareRoot(double n) {
        return Math.sqrt(n);
    }
}