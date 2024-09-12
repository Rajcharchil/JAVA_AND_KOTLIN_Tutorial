import java.util.*

fun main(args: Array<String>) {

    val list = ArrayList<CustomObject>()
    list.add(CustomObject("Z"))
    list.add(CustomObject("A"))
    list.add(CustomObject("B"))
    list.add(CustomObject("X"))
    list.add(CustomObject("Aa"))

    var sortedList = list.sortedWith(compareBy({ it.customProperty }))

    for (obj in sortedList) {
        println(obj.customProperty)
    }
}

public class CustomObject(val customProperty: String) {
}


//======================================================================================================
import java.lang.Double.parseDouble

fun main(args: Array<String>) {

    val string = "12345s15"
    var numeric = true

    try {
        val num = parseDouble(string)
    } catch (e: NumberFormatException) {
        numeric = false
    }

    if (numeric)
        println("$string is a number")
    else
        println("$string is not a number")
}

//============================================================================================================

enum class TextStyle {
    BOLD, ITALICS, UNDERLINE, STRIKETHROUGH
}

fun main(args: Array<String>) {

    val style = "Bold"

    val textStyle = TextStyle.valueOf(style.toUpperCase())

    println(textStyle)

}


//=================================================================================================================

import java.io.*

fun main(args: Array<String>) {

    val stream = ByteArrayInputStream("Hello there!".toByteArray())
    val sb = StringBuilder()
    var line: String?

    val br = BufferedReader(InputStreamReader(stream))
    line = br.readLine()

    while (line != null) {
        sb.append(line)
        line = br.readLine()
    }
    br.close()

    println(sb)

}
//==================================================================================================================================
fun main(args: Array<String>) {

    // an arraylist of vowels
    val vowels_list: List<String> = listOf("a", "e", "i", "o", "u")
    
    // converting arraylist to array
    val vowels_array: Array<String> = vowels_list.toTypedArray()
    
    // printing elements of the array 
    vowels_array.forEach { System.out.print(it) }
}

//=============================================================================================================================
import java.util.ArrayList

fun main(args: Array<String>) {

    val list1 = ArrayList<String>()
    list1.add("a")

    val list2 = ArrayList<String>()
    list2.add("b")

    val joined = ArrayList<String>()

    joined.addAll(list1)
    joined.addAll(list2)

    println("list1: $list1")
    println("list2: $list2")
    println("joined: $joined")

}
