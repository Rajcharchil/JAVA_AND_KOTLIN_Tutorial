// 1. Kotlin Program to Find G.C.D Using Recursion
// kotlin


fun gcd(a: Int, b: Int): Int {
    return if (b == 0) a else gcd(b, a % b)
}

fun main() {
    val num1 = 56
    val num2 = 98
    println("G.C.D of $num1 and $num2 is: ${gcd(num1, num2)}")
}





// 2. Kotlin Program to Convert Binary Number to Decimal and Vice-Versa
// Convert Binary to Decimal:
// kotlin



fun binaryToDecimal(binary: Long): Int {
    var decimal = 0
    var n = 0
    var bin = binary
    while (bin > 0) {
        val temp = bin % 10
        decimal += (temp * Math.pow(2.0, n.toDouble())).toInt()
        bin /= 10
        n++
    }
    return decimal
}

fun main() {
    val binary = 101010L
    println("Binary $binary to Decimal: ${binaryToDecimal(binary)}")
}



// Convert Decimal to Binary:
// kotlin



fun decimalToBinary(decimal: Int): Long {
    var dec = decimal
    var binary = 0L
    var place = 1L

    while (dec > 0) {
        val remainder = dec % 2
        binary += remainder * place
        dec /= 2
        place *= 10
    }
    return binary
}

fun main() {
    val decimal = 42
    println("Decimal $decimal to Binary: ${decimalToBinary(decimal)}")
}
// 3. Kotlin Program to Convert Octal Number to Decimal and Vice-Versa
// Convert Octal to Decimal:
// kotlin


fun octalToDecimal(octal: Int): Int {
    var oct = octal
    var decimal = 0
    var n = 0
    while (oct != 0) {
        val remainder = oct % 10
        decimal += remainder * Math.pow(8.0, n.toDouble()).toInt()
        oct /= 10
        n++
    }
    return decimal
}

fun main() {
    val octal = 57
    println("Octal $octal to Decimal: ${octalToDecimal(octal)}")
}
// Convert Decimal to Octal:
// kotlin


fun decimalToOctal(decimal: Int): Int {
    var dec = decimal
    var octal = 0
    var place = 1

    while (dec > 0) {
        val remainder = dec % 8
        octal += remainder * place
        dec /= 8
        place *= 10
    }
    return octal
}

fun main() {
    val decimal = 47
    println("Decimal $decimal to Octal: ${decimalToOctal(decimal)}")
}
// 4. Kotlin Program to Convert Binary Number to Octal and Vice-Versa
// Convert Binary to Octal:
// kotlin


fun binaryToOctal(binary: Long): Int {
    val decimal = binaryToDecimal(binary)
    return decimalToOctal(decimal)
}

fun main() {
    val binary = 110101L
    println("Binary $binary to Octal: ${binaryToOctal(binary)}")
}
Convert Octal to Binary:
kotlin
Copy code
fun octalToBinary(octal: Int): Long {
    val decimal = octalToDecimal(octal)
    return decimalToBinary(decimal)
}

fun main() {
    val octal = 65
    println("Octal $octal to Binary: ${octalToBinary(octal)}")
}
// 5. Kotlin Program to Reverse a Sentence Using Recursion
// kotlin


fun reverseSentence(sentence: String): String {
    if (sentence.isEmpty()) return sentence
    return reverseSentence(sentence.substring(1)) + sentence[0]
}

fun main() {
    val sentence = "Hello World"
    println("Original: $sentence")
    println("Reversed: ${reverseSentence(sentence)}")
}
