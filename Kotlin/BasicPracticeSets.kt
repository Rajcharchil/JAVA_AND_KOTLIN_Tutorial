//Classes and Objects
////Question: Create a Kotlin class called Person with properties name and age. Write a method isAdult
//// that returns true if the person’s age is 18 or above. Create an instance of Person and test the method.
//// Define the Person class
//

class Person(val name: String, val age: Int) {

    // Method to check if the person is an adult
    fun isAdult(): Boolean {
        return age >= 18
    }
}
fun main() {
    // Create an instance of the Person class
    val person1 = Person("Alice", 20)
    val person2 = Person("Bob", 16)

    // Test the isAdult method
    println("${person1.name} is an adult: ${person1.isAdult()}")
    println("${person2.name} is an adult: ${person2.isAdult()}")
}


////=======================================================================================q
//question:
class Person{
    var salary : Double? = null
    lateinit var name:String
    var rollnum : Int


    constructor(name: String, rollnum:Int){
        this.name= name
        this.rollnum = rollnum
//        this.salary = salary
    }
    constructor(name:String,rollnum:Int, salary:Double){
        this.name = name
        this.rollnum = rollnum
        this.salary = salary
    }

}
fun main(){
    var obj1 = Person("Charchil",12)

    println(obj1.name)
    println(obj1.rollnum)

    var obj2 = Person("Bharat",10,1200.0)
    println(obj2.name)
    println(obj2.salary)
    println(obj2.rollnum)

}


////=================================================================================================
//
//Question: Write a Kotlin program where a class Animal has a method sound() that prints "Animal makes a sound".
//Create a subclass Dog that overrides the sound() method to print "Dog barks".
//Instantiate Dog and call the sound() method.




open class Animal{
    open fun sound(){
        println("Animal makes a sound")
    }
}
class Dog : Animal(){
    override fun sound(){
        println("dog barks")
    }
}
fun main(){
//    var obj = Animal()
//    println(obj.sound())
    var dog = Dog()
    dog.sound()
}


////=================================================================================================

//Lambda Functions
//Question: Write a Kotlin program that uses a lambda function to check if a number is odd or even.
//The lambda should take an integer as input and return
//true if the number is odd and false otherwise. Test it with different numbers.

fun main() {
    // Define a lambda function that checks if a number is odd
    val isOdd = { number: Int -> number % 2 != 0 }

    // Take input from the user
    println("Enter a number:")
    val input = readLine()?.toDouble()

    // Check if the input is valid
    if (input != null) {
        // Call the lambda function and print the result
        val result = if (isOdd(input.toInt())) "odd" else "even"
        println("The number $input is $result.")
    } else {
        println("Invalid input. Please enter a valid integer.")
    }
}











