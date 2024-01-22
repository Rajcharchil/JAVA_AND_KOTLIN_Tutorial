import java.util.*;
import java.util.Arrays;

public class basic {
    public static void main(String[] args) {
        String name = "Charchil";
        int age = 19;

        String raj = "Sumangal";
        String nickName = raj;

        System.out.println(name + " age:=" + age + " " + nickName);

    }

}

//// ==========================================================

public class basic {
    public static void main(String[] args) {
        byte age = 30;
        int phone = 1234567890;
        long phone2 = 12345678900L;
        float pi = 3.14F;
        char letter = '@';
        boolean isAdult = false;

        System.out.println(isAdult);
    }

}

//// ================================================================
//// lenght key words

public class basic {
    public static void main(String[] args) {
        String name = "Charchil";

        System.out.println(name.length());

    }

}

//// ==================================================================

public class basic {
    public static void main(String[] args) {
        String name = "Charchil";
        String friend = new String("Sumangal");

        System.out.println(friend.length());
        System.out.println(name.length() + name);

        System.out.println(friend.charAt(1));

    }
}

// ===================================================================

public class basic {
    public static void main(String[] args) {

        String name = "Charchil";

        String name2 = name.replace('C', 'S');

        System.out.println(name2);
        System.out.println(name);

    }
}

// =========================================================================

public class basic {
    public static void main(String[] args) {

        String name = "Charchil with Sumangal";

        System.out.println(name.substring(0, 22));

    }
}

// =================================================================================

// Array

public class basic {

    public static void main(String[] args) {
        // int age = 30;
        // int phy = 67;
        // int chem = 98;
        // int eng = 95;

        int[] marks = new int[3];
        marks[0] = 96;
        marks[1] = 90;
        marks[2] = 67;

        // print marks
        System.out.println(marks[0]);

        // length
        System.out.println(marks.length);

        // short
        Arrays.sort(marks);
        System.out.println(marks[0]);

    }
}

// ====================================================================

public class basic {
    public static void main(String[] args) {

        int[] marks = { 67, 78, 90 };

        int[][] finalMarks = { { 56, 67, 98 }, { 48, 90, 57 } };
        System.out.println(finalMarks[0][2]);

    }

}

//// ====================================================

public class basic {

    public static void main(String[] args) {
        double price = 100.00;
        double finalprice = price + 18;

        System.out.println(finalprice);

        int p = 100;
        int fp = p + (int) 18.0;
        System.out.println(fp);
    }
}

// ===============================================================

public class basic {
    public static void main(String[] args) {

        // Operators

        int a = 1;
        int b = 2;
        int diff = a - b;
        System.out.println(diff);
    }

}

// ===================================================================

public class basic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age:");
        int age = sc.nextInt();

        System.out.println(age);
    }

}

// =========================================================================

public class basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String name = sc.next();
        String name = sc.nextLine();

        System.out.println(name);
    }

}

// ===================================================================================

public class basic {

    public static void main(String[] args) {
        System.out.println("hi" + 3 * 6);
    }
}

// =================================================================================

public class basic {

    public static void main(String[] args) {

        // a==b
        // a!=b
        // a<b
        // a>b
        // a<=b
        // a>=b

        boolean issunup = true;
        if (issunup == true) {
            System.out.println("day");
        } else {
            System.out.println("night");
        }
    }

}

//// ===============================================================

/**
 * basic
 */
public class basic {

    public static void main(String[] args) {
        // logincal consition
        int a = 30;
        int b = 40;

        if (a < 50 && b < 50)
            System.out.println("both less than 50");

        if (a < 50 || b < 50)
            System.out.println("atlest one less than 50");
    }
}

//// ==========================================================================

/**
 * basic
 */
public class basic {

    public static void main(String[] args) {
        boolean isAdult = true;
        if (!isAdult) {
            System.out.println("is adult");
        } else {
            System.out.println("not adult");
        }

    }
}

//// =========================================================================

/**
 * basic
 */
public class basic {

    public static void main(String[] args) {
        // conditional statements
        Scanner sc = new Scanner(System.in);
        System.out.print("take money: ");
        int cash = sc.nextInt();

        if (cash < 10) {
            System.out.println("can't by any things");
        } else if (cash < 40) {
            System.out.println("buy pen");

        } else {
            System.out.println("buy all things");
        }
    }
}

//// ===================================================================

/**
 * Switch condition
 */
public class basic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number:");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("monday");
                break;

            case 2:
                System.out.println("tuesday");

            default:
                System.out.println("wed - sun");
                break;
        }
    }
}

//// ===========================================================

/**
 * loop
 */
public class basic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("how many time ram jaap: ");
        int hanumaanJI = sc.nextInt();
        for (int i = 1; i <= hanumaanJI; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("Sita Ram...");

            }

            System.out.println();
        }
        for (int j = 1; j <= hanumaanJI; j++) {
            System.out.println("jai Sita Ram");
        }

    }
}

//// =========================================================================

// // *
// // * 1 *
// // * 1 2 1 *
// // * 1 2 3 2 1 *

// // * 1 2 3 2 1 *
// // * 1 *
// // *
public class basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int rc = sc.nextInt();

        for (int i = 1; i <= rc; i = i + 2) {
            for (int j = 1; j <= i; j = j + 1) {
                if (i == 2 || j == 1) {

                    System.out.print();

                } else {
                    System.out.print(j);
                }
            }
            System.out.println();
        }

    }

}

//// ===================================================================================================================

public class basic {

    public static void printjava() {
        System.out.println("hello java");

    }

    public static void main(String[] args) {

        printjava();
        printjava();
        printjava();
    }

}

//// =============================================================================================

public class basic {

    public static void sum(int a, int b) {

        int sum = a + b;
        System.out.println(sum);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        sum(a, b);

    }
}

//// ===================================================================================================

public class basic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int myNumber = (int) (Math.random() * 100);
        int userNumber = 0;

        do {
            System.out.print("Guess my number: ");

            userNumber = sc.nextInt();

            if (userNumber == myNumber) {
                System.out.println("WOOHOO....CORRECT NUMBER!!");

                break;
            } else if (userNumber > myNumber) {
                System.out.println("your number is too large ");
            } else {
                System.out.println("you number is too small ");
            }
        } while (userNumber >= 0);
        System.out.print("my number was : ");
        System.out.println(myNumber);
    }
}

//// ====================================================================

public class basic {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age > 18) {
            System.out.println("Adult");

        } else {
            System.out.println("Not Adult");
        }

    }
}

// ////=========================================================

public class basic {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        if (age > 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Not Adult");
        }
    }
}

// //=======================================================================

public class basic {

    public static int biggernumber(int n, int m) {
        if (n > m) {
            return n;
        } else {
            return m;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(biggernumber(n, m));

    }
}

// //========================================================

public class basic {

    public static String voterlist(int num) {
        if (num > 18) {
            return ("eligibal");

        } else {
            return ("not eligibal");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(voterlist(num));
    }
}

// //===========================================================

public class basic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        char choice;

        do {
            System.out.print("Enter a number (press 'q' to quit): ");
            String input = scanner.next();

            if (input.equalsIgnoreCase("q")) {
                break;
            }

            double number = Double.parseDouble(input);

            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }

        } while (true);

        System.out.println("Count of positive numbers: " + positiveCount);
        System.out.println("Count of negative numbers: " + negativeCount);
        System.out.println("Count of zero numbers: " + zeroCount);

        scanner.close();
    }
}

// ================================================================

//// it is similar to 2D matrics taht we studied
public class basic {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        // input rows

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}

//// =======================================================================

public class basic {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Search for an element x in matrix: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        // input
        // rows
        for (int i = 0; i < rows; i++) {
            // columns
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // compare with x
                if (numbers[i][j] == x) {
                    System.out.println("x found at location (" + i + ", " + j + ")");
                }
            }
        }

    }
}

///// ====================================================================================

public class basic {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int matrix[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("The Spiral Order Matrix is : ");
        int rowStart = 0;

        int rowEnd = n - 1;
        int colStart = 0;
        int colEnd = m - 1;

        // To print spiral order matrix
        while (rowStart <= rowEnd && colStart <= colEnd) {
            // 1
            for (int col = colStart; col <= colEnd; col++) {
                System.out.print(matrix[rowStart][col] + " ");
            }
            rowStart++;

            // 2
            for (int row = rowStart; row <= rowEnd; row++) {
                System.out.print(matrix[row][colEnd] + " ");
            }
            colEnd--;

            // 3
            for (int col = colEnd; col >= colStart; col--) {
                System.out.print(matrix[rowEnd][col] + " ");
            }
            rowEnd--;

            // 4
            for (int row = rowEnd; row >= rowStart; row--) {
                System.out.print(matrix[row][colStart] + " ");
            }
            colStart++;

            System.out.println();
        }
    }
}

//// ========================================================================
/////// For a given matrix of N x M, print its transpose.

public class basic {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int matrix[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("The transpose is : ");
        // To print transpose
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
