


// Reverse a Sentence Using Recursion:




fun reverseSentence(sentence: String): String {
    if (sentence.isEmpty()) {
        return sentence
    }
    return reverseSentence(sentence.substring(1)) + sentence[0]
}

fun main() {
    val sentence = "Hello, World!"
    val reversed = reverseSentence(sentence)
    println("Original sentence: $sentence")
    println("Reversed sentence: $reversed")
}



// Calculate the Power Using Recursion:




fun power(base: Int, exponent: Int): Int {
    return if (exponent == 0) {
        1
    } else {
        base * power(base, exponent - 1)
    }
}

fun main() {
    val base = 2
    val exponent = 3
    val result = power(base, exponent)
    println("$base raised to the power of $exponent is $result")
}



// Calculate Average Using Arrays:




fun calculateAverage(numbers: IntArray): Double {
    return numbers.average()
}

fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    val average = calculateAverage(numbers)
    println("Average of the numbers is $average")
}



// Find Largest Element in an Array:




fun findLargestElement(array: IntArray): Int {
    var max = array[0]
    for (element in array) {
        if (element > max) {
            max = element
        }
    }
    return max
}

fun main() {
    val array = intArrayOf(10, 20, 5, 30, 15)
    val largest = findLargestElement(array)
    println("Largest element in the array is $largest")
}



// Calculate Standard Deviation:



import 

.math.pow
import 

.math.sqrt


fun calculateMean(numbers: DoubleArray): Double {
    return numbers.average()
}

fun calculateStandardDeviation(numbers: DoubleArray): Double {
    val mean = calculateMean(numbers)
    val sumOfSquaredDifferences = numbers.map { (it - mean).pow(2) }.sum()
    return sqrt(sumOfSquaredDifferences / numbers.size)
}

fun main() {
    val numbers = doubleArrayOf(2.0, 4.0, 4.0, 4.0, 5.0, 5.0, 7.0, 9.0)
    val standardDeviation = calculateStandardDeviation(numbers)
    println("Standard deviation: $standardDeviation")
}



// Add Two Matrix Using Multi-dimensional Arrays:




fun addMatrices(matrix1: Array<IntArray>, matrix2: Array<IntArray>): Array<IntArray> {
    val rows = matrix1.size
    val columns = matrix1[0].size
    val result = Array(rows) { IntArray(columns) }

    for (i in 0 until rows) {
        for (j in 0 until columns) {
            result[i][j] = matrix1[i][j] + matrix2[i][j]
        }
    }
    return result
}

fun main() {
    val matrix1 = arrayOf(intArrayOf(1, 2), intArrayOf(3, 4))
    val matrix2 = arrayOf(intArrayOf(5, 6), intArrayOf(7, 8))
    val result = addMatrices(matrix1, matrix2)

    println("Matrix 1:")
    for (row in matrix1) {
        println(row.joinToString())
    }
    println("Matrix 2:")
    for (row in matrix2) {
        println(row.joinToString())
    }
    println("Resultant Matrix:")
    for (row in result) {
        println(row.joinToString())
    }
}



// Multiply Two Matrix Using Multi-dimensional Arrays:




fun multiplyMatrices(matrix1: Array<IntArray>, matrix2: Array<IntArray>): Array<IntArray> {
    val rows1 = matrix1.size
    val columns1 = matrix1[0].size
    val columns2 = matrix2[0].size

    val result = Array(rows1) { IntArray(columns2) }

    for (i in 0 until rows1) {
        for (j in 0 until columns2) {
            for (k in 0 until columns1) {
                result[i][j] += matrix1[i][k] * matrix2[k][j]
            }
        }
    }
    return result
}

fun main() {
    val matrix1 = arrayOf(intArrayOf(1, 2), intArrayOf(3, 4))
    val matrix2 = arrayOf(intArrayOf(5, 6), intArrayOf(7, 8))
    val result = multiplyMatrices(matrix1, matrix2)

    println("Matrix 1:")
    for (row in matrix1) {
        println(row.joinToString())
    }
    println("Matrix 2:")
    for (row in matrix2) {
        println(row.joinToString())
    }
    println("Resultant Matrix:")
    for (row in result) {
        println(row.joinToString())
    }
}



// Multiply two Matrices by Passing Matrix to a Function:




fun multiplyMatrices(matrix1: Array<IntArray>, matrix2: Array<IntArray>): Array<IntArray> {
    val rows1 = matrix1.size
    val columns1 = matrix1[0].size
    val columns2 = matrix2[0].size

    val result = Array(rows1) { IntArray(columns2) }

    for (i in 0 until rows1) {
        for (j in 0 until columns2) {
            for (k in 0 until columns1) {
                result[i][j] += matrix1[i][k] * matrix2[k][j]
            }
        }
    }
    return result
}

fun main() {
    val matrix1 = arrayOf(intArrayOf(1, 2), intArrayOf(3, 4))
    val matrix2 = arrayOf(intArrayOf(5, 6), intArrayOf(7, 8))
    val result = multiplyMatrices(matrix1, matrix2)

    println("Matrix 1:")
    for (row in matrix1) {
        println(row.joinToString())
    }
    println("Matrix 2:")
    for (row in matrix2) {
        println(row.joinToString())
    }
    println("Resultant Matrix:")
    for (row in result) {
        println(row.joinToString())
    }
}



// Find Transpose of a Matrix:




fun transposeMatrix(matrix: Array<IntArray>): Array<IntArray> {
    val rows = matrix.size
    val columns = matrix[0].size

    val result = Array(columns) { IntArray(rows) }

    for (i in 0 until rows) {
        for (j in 0 until columns) {
            result[j][i] = matrix[i][j]
        }
    }
    return result
}

fun main() {
    val matrix = arrayOf(intArrayOf(1, 2), intArrayOf(3, 4), intArrayOf(5, 6))
    val transpose = transposeMatrix(matrix)

    println("Original Matrix:")
    for (row in matrix) {
        println(row.joinToString())
    }

    println("Transpose Matrix:")
    for (row in transpose) {
        println(row.joinToString())
    }
}



// Find the Frequency of Character in a String:




fun main() {
    val str = "hello world"
    val charFrequency = HashMap<Char, Int>()

    for (char in str) {
        charFrequency[char] = charFrequency.getOrDefault(char, 0) + 1
    }

    println("Character frequencies:")
    for ((char, frequency) in charFrequency) {
        println("$char: $frequency")
    }
}



// Count the Number of Vowels and Consonants in a Sentence:




fun countVowelsAndConsonants(sentence: String): Pair<Int, Int> {
    val vowels = "aeiouAEIOU"
    var vowelCount = 0
    var consonantCount = 0

    for (char in sentence) {
        if (char.isLetter()) {
            if (char in vowels) {
                vowelCount++
            } else {
                consonantCount++
            }
        }
    }

    return Pair(vowelCount, consonantCount)
}

fun main() {
    val sentence = "Hello, World!"
    val (vowels, consonants) = countVowelsAndConsonants(sentence)

    println("Number of vowels: $vowels")
    println("Number of consonants: $consonants")
}



// Sort Elements in Lexicographical Order (Dictionary Order):




fun main() {
    val words = arrayOf("banana", "apple", "orange", "grape")
    words.sort()
    println("Sorted words: ${words.joinToString()}")
}



// Add Two Complex Numbers by Passing Class to a Function:




class ComplexNumber(val real: Double, val imaginary: Double) {
    operator fun plus(other: ComplexNumber): ComplexNumber {
        return ComplexNumber(real + other.real, imaginary + other.imaginary)
    }

    override fun toString(): String {
        return "$real + ${imaginary}i"
    }
}

fun addComplexNumbers(a: ComplexNumber, b: ComplexNumber): ComplexNumber {
    return a + b
}

fun main() {
    val num1 = ComplexNumber(2.0, 3.0)
    val num2 = ComplexNumber(1.0, 4.0)
    val sum = addComplexNumbers(num1, num2)
    println("Sum of complex numbers: $sum")
}



// Calculate Difference Between Two Time Periods:




data class Time(val hours: Int, val minutes: Int)

fun timeDifference(start: Time, end: Time): Time {
    var minutes = end.minutes - start.minutes
    var hours = end.hours - start.hours
    if (minutes < 0) {
        minutes += 60
        hours--
    }
    if (hours < 0) {
        hours += 24
    }
    return Time(hours, minutes)
}

fun main() {
    val startTime = Time(9, 30)
    val endTime = Time(13, 45)
    val difference = timeDifference(startTime, endTime)
    println("Time difference: ${difference.hours} hours ${difference.minutes} minutes")
}



// Create Pyramid and Pattern:




fun main() {
    val rows = 5
    for (i in 1..rows) {
        for (j in 1..rows - i) {
            print(" ")
        }
        for (k in 1..2 * i - 1) {
            print("*")
        }
        println()
    }
}



// Remove All Whitespaces from a String:




fun main() {
    val sentence = "Hello, World! This is Kotlin."
    val stringWithoutSpaces = sentence.replace("\\s".toRegex(), "")
    println("Original string: $sentence")
    println("String without spaces: $stringWithoutSpaces")
}



// Print an Array:




fun main() {
    val numbers = arrayOf(1, 2, 3, 4, 5)
    println("Array elements: ${numbers.joinToString()}")
}



// Convert String to Date:




import java.text.SimpleDateFormat

fun main() {
    val dateString = "2022-01-01"
    val dateFormat = SimpleDateFormat("yyyy-MM-dd")
    val date = dateFormat.parse(dateString)
    println("Date: $date")
}



// Round a Number to n Decimal Places:




fun main() {
    val number = 3.14159
    val rounded = String.format("%.2f", number).toDouble()
    println("Rounded number: $rounded")
}



// Concatenate Two Arrays:




fun main() {
    val array1 = arrayOf(1, 2, 3)
    val array2 = arrayOf(4, 5, 6)
    val concatenatedArray = array1 + array2
    println("Concatenated array: ${concatenatedArray.joinToString()}")
}



// Convert Character to String and Vice-Versa:




fun main() {
    val char = 'A'
    val stringFromChar = char.toString()
    println("String from char: $stringFromChar")

    val string = "Hello"
    val charFromString = string[0]
    println("Char from string: $charFromString")
}



// Check if An Array Contains a Given Value:




fun main() {
    val numbers = arrayOf(1, 2, 3, 4, 5)
    val value = 3
    val containsValue = value in numbers
    println("Array contains $value: $containsValue")
}



// Get Current Date/Time:




// import java.time.LocalDateTime

fun main() {
    val currentDateTime = LocalDateTime.now()
    println("Current Date/Time: $currentDateTime")
}



// Convert Milliseconds to Minutes and Seconds:




fun main() {
    val milliseconds = 125000
    val minutes = milliseconds / 60000
    val seconds = (milliseconds % 60000) / 1000
    println("Minutes: $minutes, Seconds: $seconds")
}



// Add Two Dates:




// import java.time.LocalDate
fun main() {
    val date1 = LocalDate.of(2022, 1, 1)
    val date2 = LocalDate.of(2022, 2, 1)
    val sum = date1.plusDays(date2.toEpochDay() - date1.toEpochDay())
    println("Sum of dates: $sum")
}



// Join Two Lists:




fun main() {
    val list1 = listOf(1, 2, 3)
    val list2 = listOf(4, 5, 6)
    val joinedList = list1 + list2
    println("Joined list: $joinedList")
}



// Convert List (ArrayList) to Array and Vice-Versa:




fun main() {
    val list = listOf(1, 2, 3)
    val arrayFromList = list.toTypedArray()
    println("Array from list: ${arrayFromList.joinToString()}")

    val arrayListFromArray = arrayFromList.toList()
    println("ArrayList from array: $arrayListFromArray")
}



// Get Current Working Directory:




// import java.nio.file.Paths
fun main() {
    val currentDirectory = Paths.get("").toAbsolutePath()
    println("Current Working Directory: $currentDirectory")
}



// Convert Map (HashMap) to List:




fun main() {
    val map = hashMapOf("a" to 1, "b" to 2, "c" to 3)
    val listFromMap = map.toList()
    println("List from map: $listFromMap")
}



// Convert Array to Set (HashSet) and Vice-Versa:




fun main() {
    val array = arrayOf(1, 2, 3, 4, 5)
    val setFromArray = array.toSet()
    println("Set from array: $setFromArray")

    val hashSetFromSet = setFromArray.toHashSet()
    println("HashSet from set: $hashSetFromSet")
}



// Convert Byte Array to Hexadecimal:




fun main() {
    val byteArray = byteArrayOf(10, 20, 30, 40)
    val hexadecimalString = byteArray.joinToString("") { "%02X".format(it) }
    println("Hexadecimal representation: $hexadecimalString")
}



// Create String from Contents of a File:




import java.io.File

fun main() {
    val file = File("example.txt")
    val content = file.readText()
    println("Content of the file: $content")
}



// Append Text to an Existing File:




// import java.io.File
fun main() {
    val file = File("example.txt")
    file.appendText("\nAppended text")
    println("Text appended to the file.")
}



// Convert a Stack Trace to a String:




import java.io.StringWriter
import java.io.PrintWriter

fun main() {
    try {
        val result = 1 / 0
    } catch (e: Exception) {
        val stringWriter = StringWriter()
        val printWriter = PrintWriter(stringWriter)
        e.printStackTrace(printWriter)
        val stackTraceAsString = stringWriter.toString()
        println("Stack trace as string: $stackTraceAsString")
    }
}



// Convert File to byte array and Vice-Versa:




import java.io.File
import java.nio.file.Files

fun main() {
    val file = File("example.txt")
    val fileBytes = file.readBytes()
    println("File converted to byte array")

    val reconstructedFile = File("reconstructed.txt")
    Files.write(reconstructedFile.toPath(), fileBytes)
    println("Byte array converted to file")
}



// Convert InputStream to String:




import java.io.ByteArrayInputStream
import java.io.InputStream
import java.nio.charset.Charset

fun inputStreamToString(inputStream: InputStream, charset: Charset = Charsets.UTF_8): String {
    return inputStream.bufferedReader(charset).use { it.readText() }
}

fun main() {
    val inputStream = ByteArrayInputStream("Hello, World!".toByteArray())
    val stringFromInputStream = inputStreamToString(inputStream)
    println("String from input stream: $stringFromInputStream")
}



// Convert OutputStream to String:




import java.io.ByteArrayOutputStream
import java.io.OutputStream
import java.nio.charset.Charset

fun outputStreamToString(outputStream: OutputStream, charset: Charset = Charsets.UTF_8): String {
    return (outputStream as ByteArrayOutputStream).toString(charset.name())
}

fun main() {
    val outputStream = ByteArrayOutputStream()
    outputStream.write("Hello, World!".toByteArray())
    val stringFromOutputStream = outputStreamToString(outputStream)
    println("String from output stream: $stringFromOutputStream")
}



// Lookup enum by String value:




enum class Direction {
    NORTH, SOUTH, EAST, WEST
}

fun getDirection(value: String): Direction? {
    return enumValues<Direction>().find { it.name == value }
}

fun main() {
    val direction = getDirection("NORTH")
    println("Direction: $direction")
}



Compare Strings:




fun main() {
    val str1 = "Hello"
    val str2 = "hello"
    val result = str1.equals(str2, ignoreCase = true)
    println("Strings are equal: $result")
}



Sort a Map By Values:




fun main() {
    val map = mapOf("b" to 2, "a" to 1, "c" to 3)
    val sortedMap = map.entries.sortedBy { it.value }.toMap()
    println("Sorted Map: $sortedMap")
}
