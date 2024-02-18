// 1. Kotlin Program to Display Characters from A to Z using loop
fun main() {
    for (c in 'A'..'Z') {
        print("$c ")
    }
}

// 2. Kotlin Program to Count Number of Digits in an Integer
fun main() {
    val num = 12345
    var count = 0
    var temp = num
    while (temp != 0) {
        temp /= 10
        ++count
    }
    println("Number of digits: $count")
}

// 3. Kotlin Program to Reverse a Number
fun main() {
    val num = 12345
    var reversed = 0
    var original = num
    while (original != 0) {
        val digit = original % 10
        reversed = reversed * 10 + digit
        original /= 10
    }
    println("Reversed number: $reversed")
}

// 4. Kotlin Program to Calculate the Power of a Number
fun main() {
    val base = 3
    val exponent = 4
    var result = 1
    for (i in 1..exponent) {
        result *= base
    }
    println("Result: $result")
}

// 5. Kotlin Program to Check Whether a Number is Palindrome or Not
fun main() {
    val num = 12321
    val reversed = num.toString().reversed()
    val isPalindrome = num.toString() == reversed
    if (isPalindrome) {
        println("$num is palindrome.")
    } else {
        println("$num is not palindrome.")
    }
}

// 6. Kotlin Program to Check Whether a Number is Prime or Not
fun main() {
    val num = 29
    var isPrime = true
    if (num <= 1) {
        isPrime = false
    } else {
        for (i in 2 until num) {
            if (num % i == 0) {
                isPrime = false
                break
            }
        }
    }
    if (isPrime) {
        println("$num is prime.")
    } else {
        println("$num is not prime.")
    }
}

// 7. Kotlin Program to Display Prime Numbers Between Two Intervals
fun main() {
    val start = 10
    val end = 50
    println("Prime numbers between $start and $end are:")
    for (num in start..end) {
        var isPrime = true
        if (num <= 1) {
            continue
        } else {
            for (i in 2 until num) {
                if (num % i == 0) {
                    isPrime = false
                    break
                }
            }
        }
        if (isPrime) {
            print("$num ")
        }
    }
}

// 8. Kotlin Program to Check Armstrong Number
fun main() {
    val num = 153
    var original = num
    var result = 0
    val power = num.toString().length
    while (original != 0) {
        val digit = original % 10
        result += Math.pow(digit.toDouble(), power.toDouble()).toInt()
        original /= 10
    }
    if (result == num) {
        println("$num is an Armstrong number.")
    } else {
        println("$num is not an Armstrong number.")
    }
}

// 9. Kotlin Program to Display Armstrong Number Between Two Intervals

fun main(args: Array<String>) {
    val low = 999
    val high = 99999

    for (number in low + 1..high - 1) {
        if (isArmstrong(number)) {
            print("$number ")
        }
    }
}

fun isArmstrong(number: Int): Boolean {
    var originalNumber: Int
    var remainder: Int
    var result = 0
    var n = 0

    originalNumber = number

    while (originalNumber != 0) {
        originalNumber /= 10
        ++n
    }

    originalNumber = number

    while (originalNumber != 0) {
        remainder = originalNumber % 10
        result += Math.pow(remainder.toDouble(), n.toDouble()).toInt()
        originalNumber /= 10
    }

    return if (result == number) {
        true
    } else false
}

// 10. Kotlin Program to Display Prime Numbers Between Intervals Using Function

fun main(args: Array<String>) {
    val low = 20
    val high = 50

    while (low < high) {
        if (checkPrime(low))
            print("$low ")

        ++low
    }
}

fun checkPrime(num: Int): Boolean {
    var flag = true

    for (i in 2..num / 2) {
        if (num % i == 0) {
            flag = false
            break
        }
    }
    return flag
}

// 11. Kotlin Program to Display Armstrong Numbers Between Intervals Using Function

fun main(args: Array<String>) {
    val low = 999
    val high = 99999

    for (number in low + 1 until high) {
        if (checkArmstrong(number))
            print("$number ")
    }
}

fun checkArmstrong(num: Int): Boolean {
    var digits = 0
    var result = 0
    var originalNumber = num

    while (originalNumber != 0) {
        originalNumber /= 10
        ++digits
    }

    originalNumber = num

    while (originalNumber != 0) {
        val remainder = originalNumber % 10
        result += Math.pow(remainder.toDouble(), digits.toDouble()).toInt()
        originalNumber /= 10
    }

    if (result == num) return true

    return false
}

// 12. Kotlin Program to Display Factors of a Number

fun main(args: Array<String>) {
    val number = 60

    println("Factors of $number are: ")
    for (i in 1..number) {
        if (number % i == 0) {
            print("$i ")
        }
    }
}

// 13. Kotlin Program to Make a Simple Calculator Using switch...case

fun main() {
    val operator = '+'
    val first = 10.5
    val second = 5.5
    var result: Double

    when (operator) {
        '+' -> result = first + second
        '-' -> result = first - second
        '*' -> result = first * second
        '/' -> result = first / second
        else -> {
            println("Error! Operator is not correct")
            return
        }
    }

    println("The result of $first $operator $second = $result")
}

// 14. Kotlin Program to Check Whether a Number can be Expressed as Sum of Two Prime Numbers

fun main(args: Array<String>) {
    val num = 34
    var flag = false

    for (i in 2..num / 2) {
        if (checkPrime(i)) {
            if (checkPrime(num - i)) {
                println("$num = $i + ${num - i}")
                flag =
