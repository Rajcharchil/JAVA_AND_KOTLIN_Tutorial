import java.util.*;

// // // 17. How do you sort an array in Java?

// public class PracticeQuestion_2 {

//     public static void main(String []args){
//         int[] array = {1, 2, 3, -1, -2, 4};
//         Arrays.sort(array);

//         System.out.println(Arrays.toString(array));
//     }

// }

// // // 18. How do you implement a binary search in Java?

// // // The array elements must be sorted to implement binary search. The binary search algorithm is based on the following conditions:

// // // If the key is less than the middle element, then you now need to search only in the first half of the array.
// // // If the key is greater than the middle element, then you need to search only in the second half of the array.
// // // If the key is equal to the middle element in the array, then the search ends.
// // // Finally, if the key is not found in the whole array, then it should return -1. This indicates that the element is not present.

// public class PracticeQuestion_2 {
//     public static int binarySearch(int arr[], int low, int high, int key) {
//         int mid = (low + high) / 2;

//         while (low <= high) {
//          if (arr[mid] < key) {
//           low = mid + 1;
//          } else if (arr[mid] == key) {
//           return mid;
//          } else {
//           high = mid - 1;
//          }
//          mid = (low + high) / 2;
//         }

//         if (low > high) {
//          return -1;
//         }

//         return -1;
//        }

// }

// // 19. Write a Java program that illustrates merge sort.

// // Merge sort is one of the most efficient sorting algorithms. It works on the principle of “divide and conquer”. 
// // It is based on the idea of breaking down a list into several sub-lists until each sub-list consists of a single element, and then merging those sub-lists in a manner that results in a sorted list. 
// // The following example code shows one way to use merge sort:

// public class PracticeQuestion_2 {

//     public static void main(String[] args) {
//         int[] arr = { 70, 50, 30, 10, 20, 40, 60 };

//         int[] merged = mergeSort(arr, 0, arr.length - 1);

//         for (int val : merged) {
//             System.out.print(val + " ");
//         }
//     }

//     public static int[] mergeTwoSortedArrays(int[] one, int[] two) {
//         int[] sorted = new int[one.length + two.length];

//         int i = 0;
//         int j = 0;
//         int k = 0;

//         while (i < one.length && j < two.length) {
//             if (one[i] < two[j]) {
//                 sorted[k] = one[i];
//                 k++;
//                 i++;
//             } else {
//                 sorted[k] = two[j];
//                 k++;
//                 j++;
//             }
//         }

//         if (i == one.length) {
//             while (j < two.length) {
//                 sorted[k] = two[j];
//                 k++;
//                 j++;
//             }
//         }

//         if (j == two.length) {
//             while (i < one.length) {
//                 sorted[k] = one[i];
//                 k++;
//                 i++;
//             }
//         }

//         return sorted;
//     }

//     public static int[] mergeSort(int[] arr, int lo, int hi) {
//         if (lo == hi) {
//             int[] br = new int[1];
//             br[0] = arr[lo];

//             return br;
//         }

//         int mid = (lo + hi) / 2;

//         int[] fh = mergeSort(arr, lo, mid);
//         int[] sh = mergeSort(arr, mid + 1, hi);

//         int[] merged = mergeTwoSortedArrays(fh, sh);

//         return merged;
//     }

// }

////=======================================================================================================

// public class PracticeQuestion_2 {
//     public static void printarray(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         int arr[] = { 3, 4, 7, 9, 2, 1, 0 };

//         // bubblw sort
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr.length - i - 1; j++) {
//                 if (arr[j] > arr[j + 1]) {

//                     // Swap
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                 }
//             }
//         }
//         printarray(arr);

//     }

// }

/////==================================================================

//  Reverse a String
// Write a Java program to reverse a given string.

public class ReverseString {
    public static void main(String[] args) {
        String original = "Hello, World!";
        String reversed = reverseString(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }

    private static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }

        return new String(charArray);
    }
}

// Question 2: Find the Largest Element in an Array
// Write a Java program to find the largest element in an array.

public class FindLargestElement {
    public static void main(String[] args) {
        int[] numbers = { 45, 78, 12, 89, 64, 23 };
        int largest = findLargestElement(numbers);
        System.out.println("The largest element is: " + largest);
    }

    private static int findLargestElement(int[] arr) {
        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        return largest;
    }
}

// Question 3: Factorial Calculation
// Write a Java program to calculate the factorial of a given number.

public class Factorial {
    public static void main(String[] args) {
        int number = 5;
        long factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
    }

    private static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}