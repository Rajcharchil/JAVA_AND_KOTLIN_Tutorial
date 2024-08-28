  fun main(args: Array<String>) {
      println("Hello, world!!!");

      val birthday: Int = 1234
      var point = 56.4
      var s = false
      var c = 'a'

      println(birthday)

      print(point)
      print(s)
      print(c)
  }

 // ////=======================================================================

  fun main(){
      val a=10
      val b=15

      if(a>b){
          println("its not correct")
      }
      else if(a<b){
          println("noo noo noo")
      }
      else{
          println("correct")
      }
  }

 // ////=======================================================================

  fun main(){
      val x= 10
      val y= 50
      val result = if(x>y){
          println("wow")
      }
      else if(x<y){
          println("good")
      }else{
          print(" nooo")
      }
  }


  ////=====================================================

  fun main(){
      val num = 8
      val result = num in 1..20
      val check = num in 1 until 8
      println(result)
      println(check)
  }


 // //================================
  fun main(){
      val animal = "dog"
      if (animal == "horse"){
          println("yes horse is animal")
      }
      else if(animal == "cat"){
          println("animal is cat")
      }
      else if (animal == "dog"){
          println("animal is dog")
      }
      else{
          print("animal is not found")
      }
  }


  ////=======================================

  fun main(){
      val animal = "dog"
      when(animal){
          "horse"-> println("horse is animal")
          "cat" -> println("cat is animal")
          "dog" -> println("dog is animal")
          else -> println("animal is not found")


      }
  }


 // ////===================================================

  fun main(){
      var num =2

      while(num<=20){
          println(num)
          num = num +2
      }
  }


  ////======================================

  fun main(){
     var num = 2
     var index = 1
      while(index<=10){
          println( num * index)
          index++
      }
      println("out of the loop " + index)
  }

 // ===========================================

  fun main(){
      var index = 0
      do{
          print(index)
          index++
      }while(index<1000)

  }




  //=========================================

  fun main(){
      var number =2
      for(i in 1..10){
  //         println(number.toString() + "X" + i + "="+(number*i))
          println("$number x $i = ${number*i}")
      }
  }

  //========================

  fun main(){
      val result = add(5,4)
      println(result)
      evenOrodd(12)
      evenOrodd(13)
  }

  fun add(num1:Int,num2:Int):Int{
      var sum = num1+num2
      return sum

  }

  fun evenOrodd(n:Int){
      val result = if(n %2 == 0)"even" else "odd"
      println(result)
  }


  fun main(){
      var number = 2
      for(i in 1..10){
          println(number
                 )
      }
  }



  fun main(){
      var number = 2
      for(i in 1..10){
          println(number + " * "+i+" = "+(number*i))
  //         println("$number x $i = ${number*i}")
      }
  }

 // // //=====================================================================


  fun main(){
      val result = add(3,5)
      println(result)

      val result1 = add (34,79)
      println(result1)

      val result2 = divide(45,5)
      println(result2)

      evenORodd(4)
      evenORodd(53)

      printMessage()
      printMessage(4)

  }

  fun add(num1:Int, num2:Int):Int
  {
      val sum = num1+num2
      return sum
  }

  fun divide(num1:Int, num2:Int):Int{
      val div = num1/num2
      return div

  }
  fun evenORodd(num1 : Int)
  {
      val result = if(num1 %2==0)"even" else "odd"
      println(result)

  }

  fun printMessage(count: Int = 2){
      for(i in 1..count)
      println("charchil $i")
  }

  //===========================================================================




  fun main(){
      var arr = arrayOf("two","three","four")
      var arr1= arrayOf(1,2,3)

      for((i,e) in arr1.withIndex()){

      println("$i - $e")
      }
  }



  //==============================================================================
                      //  class

  fun main(){
      var car = AutoMobile("bmw",4,5)


  }

  class AutoMobile(val name:String, val Tyers:Int, val setting:Int){
      init{
          println("$name is modified $setting seater")
      }
      fun speed(){}
      fun drive(){}
  }


 //=============================================================================

  fun main() {
      val options = arrayOf("rock", "paper", "scissors")
      print("Enter rock, paper, or scissors: ")
      val userChoice = readLine()?.toLowerCase()
      val computerChoice = options.random()

      if (userChoice in options) {
          println("Computer chose: $computerChoice")

          when {
              userChoice == computerChoice -> println("It's a tie!")
              userChoice == "rock" && computerChoice == "scissors" ||
              userChoice == "paper" && computerChoice == "rock" ||
              userChoice == "scissors" && computerChoice == "paper" -> println("You win!")
              else -> println("You lose!")
          }
      } else {
          println("Invalid choice.")
      }
  }







 fun main(){
     val objchild = child()
     objchild.method2()

 }

 open class parent {
     val name:String=""


     fun method(){
         println("i am in parent class")
         println("i am in parent class")
         println("i am in parent class")

     }

     class child: parent(){
         val name2:String=""

         fun method2(){
             println("i am in child class")
             println("i am in child class")
             println("i am in child class")
         }
     }
 }


 fun main(){
     print("Users choice : ")
     var uc = readLine()!!.toString()
     uc = uc.Lowercase()
     var choices:Array<String> = {"rock","paper","scissor"}
     var num = (0..2).random()
     var cc = choices[num]
     println("Computers choice : " + cc)
     var result = when{
         // if they both got the same then draw
         cc == uc -> "Draw"
         // cases for computer to win the game
         (cc == "rock" && uc == "scissor")||
         (cc == "paper" && uc == "rock")||
         (cc == "scissor" && uc == "paper") -> "Computer Wins"
         // cases for user to win the game
         (uc == "rock" && cc == "scissor")||
         (uc == "paper" && cc == "rock")||
         (uc == "scissor" && cc == "paper") -> "User Wins"
         else -> "wrong choice"
     }
     println(result)
 }


//============================================================================

 fun main(){
     var c ={a:Int,b:Int -> a+b}
     println(c(20,40))
 }



//================================================================

fun main(){
    val result =max(30,40)
    println(result)
}
fun max(a:Int,b:Int):Int{
    return if(a > b)a else b
}



//=================================================================================================

fun factorial(n: Int): Long {
      return if(n==0) 1 else n*factorial(n-1)
//      if (n == 0) {
//            return 1
//      } else {
//            return n * factorial(n - 1)
//      }
}
fun main() {
      val number = 5
      val result = factorial(number)
      println("The factorial of $number is $result")
}

//===============================
fun main() {
      print("Enter an integer: ")
      val number = readLine()!!.toInt()
      println("You entered: $number")
}

//=============================================
    fun main() {
    // Lambda function to convert Celsius to Fahrenheit
    val toFahrenheit = { cel: Double -> (cel * 9 / 5) + 32 }

    // Lambda function to convert Fahrenheit to Celsius
    val toCelsius = { fah: Double -> (fah - 32) * 5 / 9 }

    // Testing the conversions
    println("30.0°C to Fahrenheit: ${toFahrenheit(30.0)}°F")
    println("86.0°F to Celsius: ${toCelsius(86.0)}°C")
}



//===================================================================
fun main() {
      var num1 = 10
      var num2 = 20
      println("Before swapping: num1 = $num1, num2 = $num2")
      val temp = num1
      num1 = num2
      num2 = temp
      println("After swapping: num1 = $num1, num2 = $num2")
}

//=========================================================================
fun main(){
    var ob = Calculator()
    println(ob.add(4,5))
}

class Calculator{
    fun add(a:Int,b:Int):Int{
        return a+b
    }
    fun multiply(a:Int,b:Int):Int{
        return a*b
    }


}

//=====================================================================
//1. Variables and Data Types
//Question: Write a Kotlin program that declares a val and a var, assigns them different values, and prints them.
// Then, try changing their values and observe what happens.
//
fun main(){
    val immutable= 10

    var mutabeValue= 20

    println(immutable) //val can't be change
    println(mutabeValue)

    mutabeValue = 15
    println(mutabeValue)

}
////===============================================================================
//2. Control Flow (If/Else)
//Question: Write a Kotlin program that takes an integer as input and checks whether it is positive, negative, or zero.
//Print the result accordingly.

fun main(){
    print("take an integer input:")
    var a = readLine()!!.toInt()
    println(a)

    if(a>0){
        println("$a is Positive")
    }else if(a<0){
        println("$a is negative")
    }else{
        println("Zero")
    }
}

////======================================================================================================================

//3. Loops (For Loop)
//Question: Write a Kotlin program that prints the first 10 natural numbers using a for loop.

fun main(){
    for(i in 1..10){
        print(i)
    }
}

////=====================================================================================
// Functions
//Question: Write a Kotlin function isEven that takes an integer as a parameter and
// returns true if the number is even, and false otherwise. Test it with different values.


fun main() {
    // Function to check if a number is even
    fun isEven(number: Int): Boolean {
        return number % 2 == 0
    }

    // Test the function with different values
    println("take number:")
    val testNumbers = readLine()!!.toInt()
    print(isEven(testNumbers))

    val testNumber1 = listOf<Int>(23,34,53,56)

    for (num in testNumber1) {
        println("Is $num even? ${isEven(num)}")
    }
}

////================================================================

//Collections (Lists)
//Question: Write a Kotlin program that creates a list of 5 numbers. Calculate and print the sum of all numbers in the list.

fun main(){
    val findSum = listOf<Int>(20,40,30)
    var sum = findSum.sum()
    print(sum)

}



////=============================================================================

//. String Manipulation
//Question: Write a Kotlin program that takes a string as input and returns the string reversed.

fun main(){
    print("write a string:")
    var string = readLine()!!.toString()

    var reverse = string!!.reversed()
    print(reverse)


}


////==================================================================================================
////Classes and Objects
//Question: Create a Kotlin class called Person with properties name and age. Write a method isAdult
// that returns true if the person’s age is 18 or above. Create an instance of Person and test the method.
// Define the Person class


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
