import java.util.*;

// interface A<T> {
//     T fun(T a);

// }

// public class charchil implements A<Integer> {
//     public Integer fun(Integer a) {
//         return a;
//     }

//     public static void main(String[] args) {
//     // fun<Integer> obj = new fun<Integer>();
//     // fun<Integer> obj1 = new fun<String>();
//         charchil obj = new charchil();
//         System.out.println(obj.fun(10.5));
//     }
// }

//========================================================
interface A<T> {
    T fun(T a);
}

public class charchil implements A {
    @Override
    public Object fun(Object a) {
        System.out.println(a.getClass().getName());
        return a;
    }

    public static void main(String[] args) {
        charchil obj = new interfaceek22wr();
        System.out.println(obj.fun(10));
        System.out.println(obj.fun("Hello"));
        System.out.println(obj.fun('A'));
        System.out.println(obj.fun(10.5));
        System.out.println(obj.fun(10.5F));
    }
}

// =========================================================
// public class charchil{
// public static void main(String[] args){
// List<Integer> obj=new ArrayList<>();
// obj.add(10);
// int a= obj.get(0);

// }

// }

/// ======================================================================================

// class Fun<T extends Number> {
// T number;
// 3
// void play(T num) {
// number = num;
// System.out.println(number);
// }
// }

// public class charchil {
// public static void main(String[] args) {
// Fun<Integer> obj = new Fun<>();
// obj.play(30);
// Fun<Double> obj2 = new Fun<>();
// obj2.play(42.0);
// }
// }

// ========================================================================================

// class fun{
// <T> void fun1(T a){
// System.out.println(a.getClass().getName());

// }
// class fun {
// <T extends Number> void fun1(T a) {
// for (int i = 1; i <= 10; i++) {
// System.out.println(a + "X" + i + "=" + a.doubleValue() * i);
// }
// }
// }

// public class charchil {
// public static void main(String[] args) {
// fun obj = new fun();
// obj.fun1(10);
// obj.fun1(10.5);
// obj.fun1(10.6F);

// }
// }

// ===========================================================================================

// /**
// * charchil
// */
// class fun<T> {
// T age;

// void play(T a) {
// age = a;
// System.out.println(age);
// }
// }

// public class charchil {
// public static void main(String[] args) {
// fun<Integer> obj = new fun<Integer>();
// fun<Integer> obj1 = new fun<String>();
// obj.play(30);
// obj1.play("hello");
// }

// }

//// ===============================================================================

// import java.io.File;
// import java.io.FileNotFoundException;
// import java.io.IOException;
// import java.util.Scanner;
// import java.io.FileWriter;
// import java.util.*;

// public class charchil {
// public static void main(String[] args) {
// try {
// int count = 1;
// for (;;) {
// String fileName = "file" + count + ".txt";
// File myObj = new File(fileName);

// // File myObj1 = new File("charchil.txt");

// if (myObj.createNewFile()) {

// System.out.println(" ");
// System.out.println("File created: " + myObj.getAbsolutePath());
// break;
// }
// count++;
// }

// // else {
// // System.out.println("File exists.");
// // }
// // }

// // if (myObj1.createNewFile()) {
// // System.out.println("File created: " + myObj1.getName());
// // } else {
// // System.out.println("File 2 exists.");
// // }

// } catch (IOException e) {
// System.out.println("error");
// e.printStackTrace();
// }

// // ============write=============
// try {
// FileWriter myWriter = new FileWriter("filename.txt");
// myWriter.write("Rahul is a good boy ");
// myWriter.close();
// System.out.println(" ");
// System.out.println("Successfully write to the file.");
// } catch (IOException e) {
// System.out.println("error");
// e.printStackTrace();
// }

// // =================Read file=========+++++++++++++++++++
// try {
// File myObj = new File("filename.txt");
// Scanner myReader = new Scanner(myObj);
// while (myReader.hasNextLine()) {
// String data = myReader.nextLine();
// System.out.println(data);
// }
// myReader.close();
// } catch (FileNotFoundException e) {
// System.out.println("error");
// e.printStackTrace();
// }
// }
// }

// =====================================================================================================================
// import java.io.Console;
// class ReadPasswordTest{
// public static void main(String args[]){
// Console c=System.console();
// System.out.println("Enter password: ");
// char[] ch = c.readPassword();
// String pass = String.valueOf(ch);
// System.out.println("Password is "+pass);
// }
// }

// import java.time.LocalDate;
// import java.time.LocalDateTime;
// import java.time.LocalTime;
// import java.time.ZoneId;

// public class charchil {
// // public static void main(String[] args) {

// // LocalTime time = LocalTime.now();
// // LocalTime zone = LocalTime.now(ZoneId.of("Europe/Paris"));
// // LocalTime time1 = LocalTime.of(15, 12, 30);

// // System.out.println(time.isBefore(time1));
// // if (time.isAfter(time1)) {
// // System.out.println("Boook your ticket");
// // } else {
// // System.out.println("ticket boook is closed");
// // }
// // System.out.println(zone);

// // LocalTime time2 = time1.with(time1);
// // System.out.println(time2);

// // // LocalTime Time4 = LocalTime.System.out.println(Time4);

// // LocalDateTime date = LocalDateTime.now();
// // System.out.println(date);

// // LocalTime parsedTime = LocalTime.parse("02:55:45");
// // System.out.println("Parsed time: " + parsedTime);

// // }

// public static void main(String[] args) {

// // LocalDate date = LocalDate.of(2007, 1, 3);
// // System.out.println(date);

// // // LocalDate updatedDate = date.withDayOfYear(90);
// // LocalDate updatedDate1 = date.withMonth(12);
// // System.out.println(updatedDate1);

// // LocalTime originalTime = LocalTime.of(14, 30);
// // System.out.println(originalTime);

// // LocalTime updatedTime =
// // originalTime.plusHours(2).plusMinutes(15).plusSeconds(30);
// // System.out.println(updatedTime);

// int year = Integer.parseInt(args[0]);
// int Month = Integer.parseInt(args[1]);
// int date = Integer.parseInt(args[2]);

// LocalDate date1 = LocalDate.of(year, Month, date);
// System.out.println(date1);

// }
// }

// import java.util.*;
// // Parent class (superclass)
// class Animal {
// String name;

// public Animal(String name) {
// this.name = name;
// }

// public void eat() {
// System.out.println(name + " is eating.");
// }

// public void sleep() {
// System.out.println(name + " is sleeping.");
// }
// }

// // Child class (subclass) inheriting from Animal
// class Dog extends Animal {
// public Dog(String name) {
// super(name); // Call the constructor of the superclass
// }

// // Additional method specific to Dog
// public void bark() {
// System.out.println(name + " is barking.");
// }
// }

// // Child class (subclass) inheriting from Animal
// class Cat extends Animal {
// public Cat(String name) {
// super(name); // Call the constructor of the superclass
// }

// // Additional method specific to Cat
// public void meow() {
// System.out.println(name + " is meowing.");
// }
// }

// public class charchil {
// public static void main(String[] args) {
// Dog dog = new Dog("Buddy");
// Cat cat = new Cat("Whiskers");

// // Using methods from Animal class
// dog.eat();
// cat.sleep();

// // Using methods specific to subclasses
// dog.bark();
// cat.meow();
// }
// }
