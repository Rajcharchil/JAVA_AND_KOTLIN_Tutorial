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

////=======================================================================

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

////=======================================================================

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


//================================
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


////===================================================

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

===========================================

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

// //=====================================================================


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