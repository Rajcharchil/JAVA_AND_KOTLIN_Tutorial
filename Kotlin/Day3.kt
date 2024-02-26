


// Round a Number to n Decimal Places:
fun roundNumber(number: Double, places: Int): Double {
    val factor = Math.pow(10.0, places.toDouble())
    return Math.round(number * factor) / factor
}




fun main() {
    val number = 3.14159
    val roundedNumber = roundNumber(number, 2)
    println("Rounded number: $roundedNumber")
}



// Concatenate Two Arrays:
fun concatenateArrays(arr1: Array<Int>, arr2: Array<Int>): Array<Int> {
    return arr1 + arr2
}




fun main() {
    val arr1 = arrayOf(1, 2, 3)
    val arr2 = arrayOf(4, 5, 6)
    val concatenatedArray = concatenateArrays(arr1, arr2)
    println("Concatenated Array: ${concatenatedArray.joinToString()}")
}



// Convert Character to String and Vice-Versa:
fun main() {
    val char = 'a'
    val str = char.toString()
    println("Character to String: $str")
    
    val charFromString = str.single()
    println("String to Character: $charFromString")
}



// Check if An Array Contains a Given Value:
fun main() {
    val array = arrayOf(1, 2, 3, 4, 5)
    val value = 3
    val containsValue = value in array
    println("Array contains $value: $containsValue")
}
// Get Current Date/Time:
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter




fun main() {
    val currentDateTime = LocalDateTime.now()
    val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
    val formattedDateTime = currentDateTime.format(formatter)
    println("Current Date/Time: $formattedDateTime")
}



// Convert Milliseconds to Minutes and Seconds:
fun convertMillisToMinutesAndSeconds(millis: Long): Pair<Long, Long> {
    val minutes = millis / 60000
    val seconds = (millis % 60000) / 1000
    return Pair(minutes, seconds)
}




fun main() {
    val milliseconds = 125000
    val (minutes, seconds) = convertMillisToMinutesAndSeconds(milliseconds)
    println("Minutes: $minutes, Seconds: $seconds")
}
// Add Two Dates:
import java.time.LocalDate
import java.time.temporal.ChronoUnit




fun main() {
    val date1 = LocalDate.parse("2023-01-15")
    val date2 = LocalDate.parse("2023-02-20")
    val sumDate = date1.plusDays(ChronoUnit.DAYS.between(date1, date2))
    println("Sum of Dates: $sumDate")
}



// Join Two Lists:
fun main() {
    val list1 = listOf(1, 2, 3)
    val list2 = listOf(4, 5, 6)
    val joinedList = list1 + list2
    println("Joined List: $joinedList")
}



// Convert List (ArrayList) to Array and Vice-Versa:
fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val array = list.toTypedArray()
    println("List to Array: ${array.joinToString()}")
    
    val arrayList = array.toMutableList()
    println("Array to List: $arrayList")
}
// Get Current Working Directory:
import java.io.File




fun main() {
    val currentDirectory = File(System.getProperty("user.dir"))
    println("Current Working Directory: $currentDirectory")
}



// Convert Map (HashMap) to List:
fun main() {
    val map = hashMapOf("key1" to 1, "key2" to 2, "key3" to 3)
    val listFromMap = map.toList()
    println("List from Map: $listFromMap")
}



// Convert Array to Set (HashSet) and Vice-Versa:
fun main() {
    val array = arrayOf(1, 2, 3, 4, 5)
    val setFromArray = array.toHashSet()
    println("Set from Array: $setFromArray")
    
    val arrayFromSet = setFromArray.toTypedArray()
    println("Array from Set: ${arrayFromSet.joinToString()}")
}



// Convert Byte Array to Hexadecimal:
fun main() {
    val byteArray = byteArrayOf(10, 20, 30, 40, 50)
    val hexString = byteArray.joinToString("") { "%02X".format(it) }
    println("Hexadecimal representation: $hexString")
}
// Create String from Contents of a File:
import java.io.File




fun main() {
    val file = File("path/to/your/file.txt")
    val contents = file.readText()
    println("Contents of the file: $contents")
}
// Append Text to an Existing File:
import java.io.File




fun main() {
    val file = File("path/to/your/file.txt")
    file.appendText("\nAppended text")
    println("Text appended to the file.")
}
// Convert a Stack Trace to a String:
import java.io.PrintWriter
import java.io.StringWriter




fun main() {
    val exception = Exception("Sample exception")
    val stringWriter = StringWriter()
    exception.printStackTrace(PrintWriter(stringWriter))
    val stackTraceString = stringWriter.toString()
    println("Stack Trace: $stackTraceString")
}
// Convert File to byte array and Vice-Versa:
import java.io.File
import java.nio.file.Files
import java.nio.file.Paths




fun main() {
    val filePath = "path/to/your/file.txt"
    val fileBytes = File(filePath).readBytes()
    println("File to Byte Array: ${fileBytes.joinToString()}")
    
    Files.write(Paths.get("path/to/your/newfile.txt"), fileBytes)
    println("Byte Array to File: File created successfully.")
}
// Convert InputStream to String:
import java.io.ByteArrayInputStream




fun main() {
    val inputStream = ByteArrayInputStream("Hello, World!".toByteArray())
    val inputString = inputStream.bufferedReader().use { it.readText() }
    println("Input Stream to String: $inputString")
}
// Convert OutputStream to String:
import java.io.ByteArrayOutputStream




fun main() {
    val outputStream = ByteArrayOutputStream()
    outputStream.write("Hello, World!".toByteArray())
    val outputString = outputStream.toString()
    println("Output Stream to String: $outputString")
}
// Lookup enum by String value:
enum class Direction {
    NORTH, SOUTH, EAST, WEST
}




fun main() {
    val direction = enumValueOf<Direction>("NORTH")
    println("Enum value: $direction")
}



// Compare Strings:
fun main() {
    val str1 = "hello"
    val str2 = "world"
    val comparisonResult = str1.compareTo(str2)
    println("Comparison Result: $comparisonResult")
}



// Sort a Map By Values:
fun main() {
    val map = mapOf("b" to 2, "a" to 1, "c" to 3)
    val sortedMap = map.toList().sortedBy { (_, value) -> value }.toMap()
    println("Sorted Map: $sortedMap")
}
// Sort ArrayList of Custom Objects By Property:
data class Person(val name: String, val age: Int)




fun main() {
    val people = arrayListOf(Person("Alice", 30), Person("Bob", 25), Person("Charlie", 35))
    val sortedPeople = people.sortedBy { it.age }
    println("Sorted People: $sortedPeople")
}



// Check if a String is Numeric:
fun main() {
    val str = "12345"
    val isNumeric = str.all { it.isDigit() }
    println("Is Numeric: $isNumeric")
}
