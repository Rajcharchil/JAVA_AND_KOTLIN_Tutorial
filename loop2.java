
import java.util.*;

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