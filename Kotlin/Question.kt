Initialize an array with values:

val array = arrayOf(1, 2, 3, 4, 5)

// Create a singleton in Kotlin:

object Singleton {
    fun doSomething() {
        // Singleton logic here
    }
}
// Data class in Kotlin:
data class Person(val name: String, val age: Int)
Difference between fold and reduce:
val numbers = listOf(1, 2, 3, 4, 5)
val sum = numbers.fold(0) { acc, num -> acc + num }
val product = numbers.reduce { acc, num -> acc * num }
Difference between var and val:
val immutableValue = 10
var mutableValue = 5
mutableValue = 7
Nullable types and handling null pointer exceptions:
var nullableString: String? = null
nullableString?.length // Safe call operator
Elvis operator in Kotlin:
val result = nullableString?.length ?: -1 // If nullableString is null, result will be -1
Use of lateinit in Kotlin:
class MyClass {
    lateinit var name: String
}
Define extension functions:
fun String.addExclamation(): String {
    return "$this!"
}
Purpose of the when expression:
val x = 5
when (x) {
    1 -> println("One")
    2 -> println("Two")
    else -> println("Other")
}
These are some examples in Kotlin for the listed questions. If you need further clarification or more examples, feel free to ask!

all

Here's the Kotlin code covering all the questions you've listed:

fun main() {
    // Initialize an array with values
    val array = arrayOf(1, 2, 3, 4, 5)
    
    // Create a singleton in Kotlin
    Singleton.doSomething()
    
    // Data class in Kotlin
    val person = Person("Alice", 30)
    println(person) // Output: Person(name=Alice, age=30)
    
    // Difference between fold and reduce
    val numbers = listOf(1, 2, 3, 4, 5)
    val sum = numbers.fold(0) { acc, num -> acc + num }
    val product = numbers.reduce { acc, num -> acc * num }
    println("Sum: $sum, Product: $product") // Output: Sum: 15, Product: 120
    
    // Difference between var and val
    val immutableValue = 10
    var mutableValue = 5
    mutableValue = 7
    println("Immutable: $immutableValue, Mutable: $mutableValue") // Output: Immutable: 10, Mutable: 7
    
    // Nullable types and handling null pointer exceptions
    var nullableString: String? = null
    println(nullableString?.length) // Output: null
    
    // Elvis operator in Kotlin
    val result = nullableString?.length ?: -1
    println("Result: $result") // Output: Result: -1
    
    // Use of lateinit in Kotlin
    val myClass = MyClass()
    myClass.name = "John"
    println(myClass.name) // Output: John
    
    // Define extension functions
    val stringWithExclamation = "Hello".addExclamation()
    println(stringWithExclamation) // Output: Hello!
    
    // Purpose of the when expression
    val x = 5
    when (x) {
        1 -> println("One")
        2 -> println("Two")
        else -> println("Other")
    } // Output: Other
}

// Singleton in Kotlin
object Singleton {
    fun doSomething() {
        println("Singleton instance doing something")
    }
}

// Data class in Kotlin
data class Person(val name: String, val age: Int)

// Define extension function
fun String.addExclamation(): String {
    return "$this!"
}

// Class using lateinit
class MyClass {
    lateinit var name: String
}


//=============================================================
What is the difference between val and var?
val name = "John Doe" // immutable variable
var age = 25 // mutable variable

Learn more
What is a data class?
data class Person(val name: String, val age: Int)

Learn more
What is a primary constructor?
class Person(val name: String, val age: Int)

Learn more
What is a secondary constructor?
class Person(val name: String, val age: Int) {
    constructor(name: String) : this(name, 0)
}

Learn more
What is an init block?
class Person(val name: String, val age: Int) {
    init {
        println("Person created with name $name and age $age")
    }
}

Learn more
What is a companion object?
class Person(val name: String, val age: Int) {
    companion object {
        fun create(name: String, age: Int) = Person(name, age)
    }
}

Learn more
What is an extension function?
fun String.toUpperCase() = this.uppercase()

Learn more
What is a lambda expression?
val sum = { a: Int, b: Int -> a + b }

Learn more
What is a higher-order function?
fun map(list: List<Int>, transform: (Int) -> Int): List<Int> {
    val result = mutableListOf<Int>()
    for (item in list) {
        result.add(transform(item))
    }
    return result
}

Learn more
What is a nullable type?
var name: String? = null // nullable variable

Learn more
What is null safety?
val name: String = "John Doe" // non-nullable variable
println(name.length) // safe call

Learn more
What is a sealed class?
sealed class Person {
    class Student(val name: String, val age: Int) : Person()
    class Teacher(val name: String, val subject: String) : Person()
}

Learn more
What is a when expression?
val person = Person.Student("John Doe", 25)
when (person) {
    is Person.Student -> println("Student")
    is Person.Teacher -> println("Teacher")
}

Learn more
What is a for loop?
for (i in 0..10) {
    println(i)
}

Learn more
What is a while loop?
var i = 0
while (i < 10) {
    println(i)
    i++
}

Learn more
What is a do-while loop?
var i = 0
do {
    println(i)
    i++
} while (i < 10)

Learn more
What is a try-catch block?
try {
    // code that may throw an exception
} catch (e: Exception) {
    // code to handle the exception
}

Learn more
What is a finally block?
try {
    // code that may throw an exception
} catch (e: Exception) {
    // code to handle the exception
} finally {
    // code that will always be executed
}

Learn more
What is a coroutine?
fun main() = runBlocking {
    // code that will be executed concurrently
}

Learn more
What is a flow?
fun main() = runBlocking {
    val flow = flow {
        // code that will emit values
    }

    flow.collect { value ->
        // code to handle the emitted values
    }
}