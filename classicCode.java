import java.util.Arrays;
// Java Program to Calculate Average Using Arrays:
public class CalculateAverage {
    public static void main(String[] args) {
        double[] numbers = { 10.5, 20.5, 30.5, 40.5, 50.5 };
        double sum = 0;

        for (double num : numbers) {
            sum += num;
        }

        double average = sum / numbers.length;
        System.out.println("Average: " + average);
    }
}



// Java Program to Find Largest Element of an Array:
public class FindLargestElement {
    public static void main(String[] args) {
        int[] numbers = { 10, 20, 15, 25, 30, 40, 50 };
        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println("Largest element: " + largest);
    }
}



// Java Program to Calculate Standard Deviation: (Assuming you have a function to calculate mean)


public class CalculateStandardDeviation {
    public static void main(String[] args) {
        double[] numbers = { 10.5, 20.5, 30.5, 40.5, 50.5 };
        double mean = Arrays.stream(numbers).sum() / numbers.length;
        double sumSquaredDiff = 0;

        for (double num : numbers) {
            sumSquaredDiff += Math.pow(num - mean, 2);
        }

        double standardDeviation = Math.sqrt(sumSquaredDiff / numbers.length);
        System.out.println("Standard Deviation: " + standardDeviation);
    }
}



// Java Program to Add Two Matrix Using Multi-dimensional Arrays:
public class AddMatrices {
    public static void main(String[] args) {
        int[][] matrix1 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        int[][] matrix2 = { {9, 8, 7}, {6, 5, 4}, {3, 2, 1} };
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] sum = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Printing the sum matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}



// Java Program to Multiply Two Matrix Using Multi-dimensional Arrays:
public class MultiplyMatrices {
    public static void main(String[] args) {
        int[][] matrix1 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        int[][] matrix2 = { {9, 8, 7}, {6, 5, 4}, {3, 2, 1} };
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int cols2 = matrix2[0].length;

        if (cols1 != rows2) {
            System.out.println("Matrices cannot be multiplied!");
            return;
        }

        int[][] result = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        // Printing the result matrix
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}



// Java Program to Multiply two Matrices by Passing Matrix to a Function:
public class MultiplyMatricesFunction {
    public static void main(String[] args) {
        int[][] matrix1 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        int[][] matrix2 = { {9, 8, 7}, {6, 5, 4}, {3, 2, 1} };
        int[][] result = multiplyMatrices(matrix1, matrix2);

        // Printing the result matrix
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int rows1 = a.length;
        int cols1 = a[0].length;
        int rows2 = b.length;
        int cols2 = b[0].length;

        if (cols1 != rows2) {
            System.out.println("Matrices cannot be multiplied!");
            return null;
        }

        int[][] result = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        return result;
    }
}



// Java Program to Find Transpose of a Matrix:
public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Printing the transpose matrix
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}



// Java Program to Find the Frequency of Character in a String:
// import java.util.HashMap;
// import java.util.Map;

public class CharacterFrequency {
    public static void main(String[] args) {
        String str = "hello world";
        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}



// Java Program to Count the Number of Vowels and Consonants in a Sentence:
public class VowelConsonantCount {
    public static void main(String[] args) {
        String sentence = "hello world";
        int vowels = 0, consonants = 0;

        sentence = sentence.toLowerCase();
        for (int i = 0; i < sentence.length(); ++i) {
            char ch = sentence.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    ++vowels;
                } else {
                    ++consonants;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}



// Java Program to Sort Elements in Lexicographical Order (Dictionary Order):
// import java.util.Arrays;

public class LexicographicalSort {
    public static void main(String[] args) {
        String[] arr = {"banana", "apple", "orange", "grape"};

        Arrays.sort(arr);

        for (String str : arr) {
            System.out.println(str);
        }
          }
