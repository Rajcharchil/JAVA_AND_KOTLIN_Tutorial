


fun main() {
    print("Enter an integer: ")
    val number = readLine()!!.toInt()
    println("You entered: $number")
}




fun main() {
    val num1 = 10
    val num2 = 20
    val sum = num1 + num2
    println("Sum: $sum")
}


//==========================
fun main() {
    val num1 = 10.5
    val num2 = 5.5
    val product = num1 * num2
    println("Product: $product")
}


// ====




fun main() {
    val char = 'A'
    val ascii = char.toInt()
    println("ASCII value of $char is $ascii")
}
// =====




fun main() {
    val dividend = 25
    val divisor = 4
    val quotient = dividend / divisor
    val remainder = dividend % divisor
    println("Quotient: $quotient")
    println("Remainder: $remainder")
}
// ========




fun main() {
    var num1 = 10
    var num2 = 20
    println("Before swapping: num1 = $num1, num2 = $num2")
    val temp = num1
    num1 = num2
    num2 = temp
    println("After swapping: num1 = $num1, num2 = $num2")
}
// =====



fun main() {
    val number = 25
    if (number % 2 == 0) {
        println("$number is even")
    } else {
        println("$number is odd")
    }
}





// Check Whether an Alphabet is Vowel or Consonant:
fun main() {
    val alphabet = 'A'
    val vowels = "AEIOUaeiou"
    if (alphabet in vowels) {
        println("$alphabet is a vowel")
    } else {
        println("$alphabet is a consonant")
    }
}



// Find the Largest Among Three Numbers:
fun main() {
    val num1 = 10
    val num2 = 20
    val num3 = 15
    val max = if (num1 >= num2 && num1 >= num3) {
        num1
    } else if (num2 >= num1 && num2 >= num3) {
        num2
    } else {
        num3
    }
    println("Largest number is: $max")
}



// Find all Roots of a Quadratic Equation:
import kotlin.math.sqrt

fun main() {
    val a = 1.0
    val b = -5.0
    val c = 6.0
    val discriminant = b * b - 4 * a * c
    val root1: Double
    val root2: Double

    if (discriminant > 0) {
        root1 = (-b + sqrt(discriminant)) / (2 * a)
        root2 = (-b - sqrt(discriminant)) / (2 * a)
        println("Root1: $root1")
        println("Root2: $root2")
    } else if (discriminant == 0.0) {
        root1 = -b / (2 * a)
        println("Root1 and Root2: $root1")
    } else {
        val realPart = -b / (2 * a)
        val imaginaryPart = sqrt(-discriminant) / (2 * a)
        println("Root1: $realPart + $imaginaryPart i")
        println("Root2: $realPart - $imaginaryPart i")
    }
}






// an Integer (Entered by the User):
fun main() {
    print("Enter an integer: ")
    val number = readLine()!!.toInt()
    println("You entered: $number")
}



// Integers:
fun main() {
    val num1 = 10
    val num2 = 20
    val sum = num1 + num2
    println("Sum: $sum")
}



// Floating Point Numbers:
fun main() {
    val num1 = 10.5
    val num2 = 5.5
    val product = num1 * num2
    println("Product: $product")
}



// Find ASCII value of a character:
fun main() {
    val char = 'A'
    val ascii = char.toInt()
    println("ASCII value of $char is $ascii")
}


// Compute Quotient and Remainder:
fun main() {
    val dividend = 25
    val divisor = 4
    val quotient = dividend / divisor
    val remainder = dividend % divisor
    println("Quotient: $quotient")
    println("Remainder: $remainder")
}



// Numbers:
fun main() {
    var num1 = 10
    var num2 = 20
    println("Before swapping: num1 = $num1, num2 = $num2")
    val temp = num1
    num1 = num2
    num2 = temp
    println("After swapping: num1 = $num1, num2 = $num2")
}



// Check Whether a Number is Even or Odd:
fun main() {
    val number = 25
    if (number % 2 == 0) {
        println("$number is even")
    } else {
        println("$number is odd")
    }
}



// Check Whether an Alphabet is Vowel or Consonant:
fun main() {
    val alphabet = 'A'
    val vowels = "AEIOUaeiou"
    if (alphabet in vowels) {
        println("$alphabet is a vowel")
    } else {
        println("$alphabet is a consonant")
    }
}



// Find the Largest Among Three Numbers:
fun main() {
    val num1 = 10
    val num2 = 20
    val num3 = 15
    val max = if (num1 >= num2 && num1 >= num3) {
        num1
    } else if (num2 >= num1 && num2 >= num3) {
        num2
    } else {
        num3
    }
    println("Largest number is: $max")
}




// Find all Roots of a Quadratic Equation:
import kotlin.math.sqrt

fun main() {
    val a = 1.0
    val b = -5.0
    val c = 6.0
    val discriminant = b * b - 4 * a * c
    val root1: Double
    val root2: Double

    if (discriminant > 0) {
        root1 = (-b + sqrt(discriminant)) / (2 * a)
        root2 = (-b - sqrt(discriminant)) / (2 * a)
        println("Root1: $root1")
        println("Root2: $root2")
    } else if (discriminant == 0.0) {
        root1 = -b / (2 * a)
        println("Root1 and Root2: $root1")
    } else {
        val realPart = -b / (2 * a)
        val imaginaryPart = sqrt(-discriminant) / (2 * a)
        println("Root1: $realPart + $imaginaryPart i")
        println("Root2: $realPart - $imaginaryPart i")
    }
}
