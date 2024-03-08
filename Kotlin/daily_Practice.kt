import kotlin.math.pow



// 1. Display Characters from A to Z using loop
fun displayCharacters() {
    for (ch in 'A'..'Z') {
        print("$ch ")
    }
    println()
}



// 2. Count Number of Digits in an Integer
fun countDigits(number: Int): Int {
    var count = 0
    var num = number

    while (num != 0) {
        num /= 10
        ++count
    }
    return count
}



// 3. Reverse a Number
fun reverseNumber(number: Int): Int {
    var reversed = 0
    var num = number

    while (num != 0) {
        val digit = num % 10
        reversed = reversed * 10 + digit
        num /= 10
    }
    return reversed
}



// 4. Calculate the Power of a Number
fun power(base: Int, exponent: Int): Long {
    var result = 1L
    for (i in 1..exponent) {
        result *= base
    }
    return result
}



// 5. Check Whether a Number is Palindrome or Not
fun isPalindrome(number: Int): Boolean {
    val originalNumber = number
    var reversedNumber = 0
    var remainder: Int

    var num = number
    while (num != 0) {
        remainder = num % 10
        reversedNumber = reversedNumber * 10 + remainder
        num /= 10
    }
    return originalNumber == reversedNumber
}



// 6. Check Whether a Number is Prime or Not
fun isPrime(number: Int): Boolean {
    if (number <= 1) {
        return false
    }

    for (i in 2 until number) {
        if (number % i == 0) {
            return false
        }
    }
    return true
}



// 7. Display Prime Numbers Between Two Intervals
fun displayPrimeNumbers(start: Int, end: Int) {
    println("Prime numbers between $start and $end are:")
    for (num in start..end) {
        if (isPrime(num)) {
            print("$num ")
        }
    }
    println()
}



// 8. Check Armstrong Number
fun isArmstrongNumber(number: Int): Boolean {
    var num = number
    val numDigits = countDigits(number)
    var sum = 0

    while (num != 0) {
        val digit = num % 10
        sum += digit.toDouble().pow(numDigits).toInt()
        num /= 10
    }
    return sum == number
}



// 9. Display Armstrong Numbers Between Two Intervals
fun displayArmstrongNumbers(start: Int, end: Int) {
    println("Armstrong numbers between $start and $end are:")
    for (num in start..end) {
        if (isArmstrongNumber(num)) {
            print("$num ")
        }
    }
    println()
}



// 10. Display Prime Numbers Between Intervals Using Function
fun displayPrimeNumbersInRange(start: Int, end: Int) {
    println("Prime numbers between $start and $end are:")
    for (num in start..end) {
        if (isPrime(num)) {
            print("$num ")
        }
    }
    println()
}



// 11. Display Armstrong Numbers Between Intervals Using Function
fun displayArmstrongNumbersInRange(start: Int, end: Int) {
    println("Armstrong numbers between $start and $end are:")
    for (num in start..end) {
        if (isArmstrongNumber(num)) {
            print("$num ")
        }
    }
    println()
}



// 12. Display Factors of a Number
fun displayFactors(number: Int) {
    println("Factors of $number are:")
    for (i in 1..number) {
        if (number % i == 0) {
            print("$i ")
        }
    }
    println()
}



// 13. Make a Simple Calculator Using switch...case
fun calculate(operator: Char, num1: Double, num2: Double): Double {
    return when (operator) {
        '+' -> num1 + num2
        '-' -> num1 - num2
        '*' -> num1 * num2
        '/' -> num1 / num2
        else -> throw IllegalArgumentException("Operator $operator is not supported")
    }
}



// 14. Check Whether a Number can be Expressed as Sum of Two Prime Numbers
fun isSumOfTwoPrimes(number: Int): Boolean {
    for (i in 2..number / 2) {
        if (isPrime(i) && isPrime(number - i)) {
            return true
        }
    }
    return false
}



// 15. Find the Sum of Natural Numbers using Recursion
fun sumOfNaturalNumbers(n: Int): Int {
    return if (n != 0)
        n + sumOfNaturalNumbers(n - 1)
    else
        0
}



// 16. Find Factorial of a Number Using Recursion
fun factorial(n: Int): Long {
    return if (n == 0)
        1
    else
        n * factorial(n - 1)
}



// 17. Find G.C.D Using Recursion
fun gcd(a: Int, b: Int): Int {
    return if (b == 0)
        a
    else
        gcd(b, a % b)
}



// 18. Convert Binary Number to Decimal and vice-versa
fun binaryToDecimal(binary: String): Int {
    return binary.toInt(2)
}

fun decimalToBinary(decimal: Int): String {
    return Integer.toBinaryString(decimal)
}



// 19. Convert Octal Number to Decimal and vice-versa
fun octalToDecimal(octal: String): Int {
    return octal.toInt(8)
}

fun decimalToOctal(decimal: Int): String {
    return Integer.toOctalString(decimal)
}



// 20. Convert Binary Number to Octal and vice-versa
fun binaryToOctal(binary: String): String {
    val decimal = binaryToDecimal(binary)
    return decimalToOctal(decimal)
}

fun octalToBinary(octal: String): String {
    val decimal = octalToDecimal(octal)
    return decimalToBinary(decimal)
}



// 21. Reverse a Sentence Using Recursion
fun reverseSentence(sentence: String): String {
    val words = sentence.split(" ")
    return words.reversed().joinToString(" ")
}



// 22. Calculate the Power using Recursion
fun powerUsingRecursion(base: Int, exponent: Int): Long {
    return if (exponent == 0)
        1
    else
        base * powerUsingRecursion(base, exponent - 1)
}

fun main() {
    
  
  // Test your functions here
}
