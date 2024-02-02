import java.util.*;

public class recursion {
    public static void printX() {

    }

    public static void main(String[] args) {

    }

}

// =====================================================

public class Recursion {
public static void fibonacci(int a, int b, int n) {
if (n == 0) {
return;
}
System.out.println(a);
fibonacci(b, a + b, n - 1);
}

public static void main(String[] args) {
fibonacci(0, 1, 9);
}

}

// =================================================

public class Recursion {
public static void factorial(int n, int fact) {
if (n == 0) {
System.out.println(fact);
return;
}
fact = fact * n;
factorial(n - 1, fact);
}

public static void main(String[] args) {
factorial(5, 1);
}
}

//// ================================================================

public class Recursion {
public static void printfirstSumNaturalnumber(int n, int sum) {
if (n == 0) {
System.out.println(sum);
return;

}
sum = sum + n;
printfirstSumNaturalnumber(n - 1, sum);
}

public static void main(String[] args) {
printfirstSumNaturalnumber(5, 0);
}

}

//
==============================================================================

public class Recursion {
public static void printnum(int n) {
if (n == 0) {
return;

}
System.out.println(n);
printnum(n - 1);

}

public static void main(String[] args) {
int n = 5;
printnum(n);

}

}

//
================================================================================

public class Recursion {
public static void printreverse(int n) {
if (n == 6) {
return;
}
System.out.println(n);
printreverse(n + 1);

}

public static void main(String[] args) {
int n = 0;
printreverse(n);

}

}

/////
=========================================================================

public class recursion {
public static void main(String[] args) {
int n = 10;
System.out.println("Fibonacci Series up to " + n + " terms:");
for (int i = 0; i < n; i++) {
System.out.print(fibonacci(i) + " ");
}
}

private static int fibonacci(int n) {
if (n <= 1) {
return n;
} else {
return fibonacci(n - 1) + fibonacci(n - 2);
}
}
}
//// ===========================================

// sum of two digit
public class recursion {
public static void main(String[] args) {
int number = 12345;
int sum = calculateSumOfDigits(number);
System.out.println("Sum of digits of " + number + " is: " + sum);
}

private static int calculateSumOfDigits(int num) {
if (num == 0) {
return 0;
} else {
return num % 10 + calculateSumOfDigits(num / 10);
}
}
}

////
===============================================================================

public class recursion {
public static void main(String[] args) {
int base = 2;
int exponent = 5;
int result = calculatePower(base, exponent);
System.out.println(base + " raised to the power " + exponent + " is: " +
result);
}

private static int calculatePower(int base, int exponent) {
if (exponent == 0) {
return 1;
} else {
return base * calculatePower(base, exponent - 1);
}
}
}

////
===================================================================================

// C# program to count substrings
// with same first and last characters

public class recursion {

// Function to count substrings
// with same first and
// last characters
static int countSubstrs(string str, int i,
int j, int n) {

// base cases
if (n == 1)
return 1;
if (n <= 0)
return 0;

int res = countSubstrs(str, i + 1, j, n - 1)
+ countSubstrs(str, i, j - 1, n - 1)
- countSubstrs(str, i + 1, j - 1, n - 2);

if (str[i] == str[j])
res++;

return res;
}

// Driver code
public static void Main() {
string str = "abcab";
int n = str.Length;

Console.WriteLine(
countSubstrs(str, 0, n - 1, n));
}
}
