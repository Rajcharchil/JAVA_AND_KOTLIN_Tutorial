
import java.util.*;

// Find the missing number in a given integer array of 1 to 100:
// java

public class MissingNumber {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 6, /*...*/, 99, 100}; // Array with one missing number
        int n = 100;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : array) {
            actualSum += num;
        }

        int missingNumber = expectedSum - actualSum;
        System.out.println("Missing Number: " + missingNumber);
    }
}

// Find the duplicate number in a given integer array:
// java

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 2, 5 }; // Array with a duplicate number
        int duplicate = -1;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    duplicate = array[i];
                    break;
                }
            }
        }

        System.out.println("Duplicate Number: " + duplicate);
    }
}

// Find the largest and smallest number in an unsorted integer array:

public class LargestSmallest {
    public static void main(String[] args) {
        int[] array = { 3, 1, 9, 5, 7, 2 }; // Unsorted array
        int smallest = array[0];
        int largest = array[0];

        for (int num : array) {
            if (num < smallest) {
                smallest = num;
            } else if (num > largest) {
                largest = num;
            }
        }

        System.out.println("Smallest Number: " + smallest);
        System.out.println("Largest Number: " + largest);
    }
}

// Find all pairs of integer arrays whose sum is equal to a given number:

public class PairSum {
    public static void findPairs(int[] array, int targetSum) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == targetSum) {
                    System.out.println("Pair: (" + array[i] + ", " + array[j] + ")");
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = { 2, 4, 7, 5, 9, 10 };
        int targetSum = 12;

        findPairs(array, targetSum);
    }
}

// Find duplicate numbers in an array with multiple duplicates:

public class MultipleDuplicates {
    public static void findDuplicates(int[] array) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Duplicate Number: " + entry.getKey());
            }
        }
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 2, 4, 5, 3, 6 };
        findDuplicates(array);
    }
}

// Remove duplicates from a given array in Java:

// import java.util.HashSet;

public class RemoveDuplicates {
    public static int[] removeDuplicates(int[] array) {
        HashSet<Integer> set = new HashSet<>();
        int length = 0;

        for (int num : array) {
            if (set.add(num)) {
                array[length++] = num;
            }
        }

        return java.util.Arrays.copyOf(array, length);
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 2, 4, 5, 3, 6 };
        array = removeDuplicates(array);

        System.out.print("Array without duplicates: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}

// Sort an integer array in place using the QuickSort algorithm:

public class QuickSort {
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);

            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                swap(array, i, j);
            }
        }

        swap(array, i + 1, high);
        return i + 1;
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] array = { 5, 3, 8, 4, 2, 7, 1 };
        quickSort(array, 0, array.length - 1);

        System.out.print("Sorted Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}

// Remove duplicates from an array in place:

public class RemoveDuplicatesInPlace {
    public static int removeDuplicates(int[] array) {
        int length = array.length;

        for (int i = 0; i < length - 1; i++) {
            if (array[i] == array[i + 1]) {
                for (int j = i + 1; j < length - 1; j++) {
                    array[j] = array[j + 1];
                }
                length--;
                i--;
            }
        }

        return length;
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 2, 4, 5, 3, 6 };
        int newLength = removeDuplicates(array);

        System.out.print("Array without duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

// Reverse an array in place in Java:

public class ReverseArray {
    public static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        reverseArray(array);

        System.out.print("Reversed Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}

// Find multiple missing numbers in a given integer array with duplicates:

public class MultipleMissingNumbers {
    public static void findMissingNumbers(int[] array) {
        int n = array.length + 1;
        HashSet<Integer> set = new HashSet<>();

        for (int num : array) {
            set.add(num);
        }

        System.out.print("Missing Numbers: ");
        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 4, 6, 4, 7, 8 };
        findMissingNumbers(array);
    }
}

public class loop2 {
    public static void main(String[] args) {
        System.out.println("helllo");
    }
}

// 1
// 2 2
// 3 3
// 4444444

public class loop2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int r = sc.nextInt();
        for (int i = 1; i <= r; i++) {

            for (int j = 1; j <= r - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(i);

            }
            System.out.println();
        }
    }

}

public class loop2 {
    public static void main(String[] args) {
        int n = 4; // Change the value of 'n' for a different pattern size

        for (int i = 1; i <= n; i++) {
            // Spaces before the first set of numbers
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // First set of numbers
            System.out.print(i);

            // Spaces between the two sets of numbers
            for (int j = 1; j < 2 * i - 1; j++) {
                System.out.print(" ");
            }

            // Second set of numbers (only for i > 1)
            if (i > 1) {
                System.out.print(i);
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}

public class loop2 {
    public static void main(String[] args) {
        int n = 4; // Change the value of 'n' for a different pattern size

        for (int i = 1; i <= n; i++) {
            // Spaces before the numbers
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Numbers in increasing order
            for (int j = 1; j <= 2 * i - 1; j++) {
                // Skip 2 or 3 between the first and second occurrence
                if (j == i + 1 && i != 1) {
                    if (i == 2) {
                        System.out.print(" ");
                    } else if (i == 3) {
                        continue;
                    }
                }
                System.out.print(i);
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}

//// =======================================================================================================

public class loop2 {
    public static void main(String[] args) {
        String sentence = "lets go for watching movie";
        String name = sentence.substring(12, sentence.length());
        System.out.println(name);
    }

}

// =====================================================================

public class loop2 {
    public static void main(String[] args) {

        StringBuilder suString = new StringBuilder("RAM");

        // show char
        System.out.println(suString.charAt(1));

        // set char
        suString.setCharAt(0, 'r');
        System.out.println(suString);

        // insert

        suString.insert(2, 'V');
        suString.insert(3, 'A');
        suString.insert(4, 'N');
        System.out.println(suString);

        // delete

        suString.delete(5, 6);
        System.out.println(suString);
    }
}

// ==============================================================================

public class loop2 {

    public static void main(String[] args) {

        StringBuilder sc = new StringBuilder("H");
        sc.append('A');
        sc.append('N');
        sc.append('U');
        sc.append('M');
        sc.append('A');
        sc.append('A');
        sc.append('N');
        System.out.println(sc);

    }
}

// =======================================================================================

public class loop2 {
    public static void main(String[] args) {
        StringBuilder su = new StringBuilder("Hello");
        su.setCharAt(4, 'o');
        su.setCharAt(3, 'l');
        su.setCharAt(2, 'l');
        su.setCharAt(1, 'e');
        su.setCharAt(0, 'H');
        System.out.println(su);

    }

}

// ======================================================================================

// reverse the string

public class loop2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter: ");
        String x = sc.nextLine();
        StringBuilder su = new StringBuilder(x);

        for (int i = 0; i < su.length() / 2; i++) {
            int front = i;
            int back = su.length() - 1 - i;

            char frontchar = su.charAt(front);
            char backchar = su.charAt(back);

            su.setCharAt(front, backchar);
            su.setCharAt(back, frontchar);

        }
        System.out.println(su);

    }
}
