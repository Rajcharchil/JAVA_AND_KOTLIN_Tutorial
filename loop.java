import java.util.*;
import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class loop {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i = i + 1) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// ////===============================================================
// // /**
// // * array
// // */
// public class loop {

// public static void main(String args[]) {
// int n=5;

// for(int i=1; i<=n; i++){

// //upper part
// for(int j=1; j<=i; j++){
// System.out.print("*");

// }
// //space part
// int spaces = 2*(n-i);
// for(int j=1; j<=spaces; j++){
// System.out.print(" ");
// }

// //other side
// for(int j=1; j<=i; j++){
// System.out.print("*");

// }
// System.out.println();
// }
// for(int i=n; i>=1; i--){

// //upper part
// for(int j=1; j<=i; j++){
// System.out.print("*");

// }
// //space part
// int spaces = 2*(n-i);
// for(int j=1; j<=spaces; j++){
// System.out.print(" ");
// }

// //other side
// for(int j=1; j<=i; j++){
// System.out.print("*");

// }
// System.out.println();
// }

// }
// }

// ////==============================================================================

// // import java.util.Scanner;

// // /**
// // * array
// // */
// public class loop {

// public static void main(String args[]) {
// int rowcount=5;

// for(int row=1; row<=rowcount; row++){

// for(int j=1; j<=row; j++){
// System.out.print("*");
// }

// //space
// for(int j=1;j<=rowcount-row+2;j++){
// System.out.print(" ");
// }

// for(int j=1; j<=row; j++){
// System.out.print("*");
// }
// System.out.println();
// }
// for(int row=5; row>=1; row--){

// for(int j=1; j<=row; j++){
// System.out.print("*"+" ");
// }
// System.out.println();
// }
// }
// }

// // Scanner sc = Scanner(System.in);
// // int size = sc.nextInt();
// // int numbers = new int[size];

// // for(int i=0; i>size; i++){
// // System.out.println(numbers[i]);
// // }

// // int[] marks = new int[3];
// // marks[0]=67;
// // marks[1]=89;
// // marks[2]=90;

// // System.out.println(marks[0]);
// // System.out.println(marks[1]);
// // System.out.println(marks[2]);
// // System.out.println("hello world");

// ////===================================================

// /**
// *
// */
// public class loop {

// public static void main(String args[]) {
// int r=5;
// // int a=1;

// for(int row=1; row<=r; row++){

// for(int j=1; j<=row; j++){

// // System.out.print(a+" ");
// // a++;
// int sum = row+j;

// if(sum%2==0){
// System.out.print("1 ");

// }
// else{
// System.out.print("0 ");
// }

// }
// System.out.println();
// }
// }
// }

// ////===========================================================

// public class loop{
// public static void main(String[] args){
// int R=5;

// for( int i=1; i<=5; i++){
// for(int j=1; j<=i; j++){
// System.out.print("*");
// }
// //space
// int space=2*(R-i);

// for(int j=1; j<=space; j++){
// System.out.print("_");
// }
// for(int j=1; j<=i; j++){
// System.out.print("*");
// }

// System.out.println();
// }

// for( int i=R; i>=1; i--){
// for(int j=1; j<=i; j++){
// System.out.print("*");
// }
// //space
// int space=2*(R-i);

// for(int j=1; j<=space; j++){
// System.out.print("_");
// }
// for(int j=1; j<=i; j++){
// System.out.print("*");
// }

// System.out.println();
// }

// }
// }

// ////========================================================

// /**
// * array
// */
// public class loop {

// public static void main (String[] args){
// int a=5;

// for (int i=1; i<=a; i++){
// //space
// int s=a-i;
// for(int j=1; j<=s; j++){
// System.out.print("_");
// }

// for(int j=1; j<=4; j++){
// System.out.print("*");
// }

// System.out.println();
// }
// }
// }

// public class loop {

// public static void main (String[] args){
// int a=6;
// int b=7;

// for (int i=1; i<=a; i++){

// for(int j=1; j<=i; j++){

// if(j==1||j==2||i==a){
// System.out.print("*");
// }else{
// System.out.print("-");
// }
// }

// System.out.println();
// }
// }
// }

// ////=================================================================

// //Question:- print gap in this triangle shape

// // 1
// // 22
// // 3 3
// // 4 4
// // 55555

// public class loop {

// public static void main (String[] args){
// int a=5;

// for (int i=1; i<=a; i++){
// // space

// for(int j=1; j<=a-i; j++){
// System.out.print(" ");
// }

// for(int j=1; j<=i; j++){
// if(i==3 || i==4){
// if(j==1 || j==i){
// System.out.print(i);
// }else{
// System.out.print(" ");
// }
// }else{
// System.out.print(i);
// }
// }

// System.out.println();
// }
// }
// }

// ////===================================================================

// // 1
// // 22
// // 3 3
// // 4 4
// // 55555
// /**
// * array
// */
// public class loop {

// public static void main(String[] args){
// int a=4;

// for (int i=1; i<=a; i++){

// for(int j=1; j<=a-i; j++){
// System.out.print(" ");

// }

// for(int j=1; j<=2*i-1; j++){
// System.out.print("*");
// }
// System.out.println();
// }

// for (int i=a; i>=1; i--){

// for(int j=1; j<=a-i; j++){
// System.out.print(" ");

// }

// for(int j=1; j<=2*i-1; j++){
// System.out.print("*");
// }
// System.out.println();
// }
// }
// }

// ////=======================================================================

// // import java.util.Scanner;

// /**
// * array
// */
// public class loop {

// public static void main(Strings[] args){
// // int R=4;
// // int C=5;

// for(int i=1; i<=5; i++){
// for(int j=1; j<=i; j++){
// System.out.print("*");
// }
// System.out.println();
// }
// }
// }

// ////==================================================================================

// public class loop{
// public static void main(String[] args) {
// Scanner sc =new Scanner(System.in);
// System.out.print("enter the number: ");
// int rows = sc.nextInt();

// for (int i = 5; i >= 1; i--) {
// for (int j = 1; j < i; j++) {
// System.out.print(" ");
// }
// for (int k = i; k <= rows * 2 - i; k++) {
// if (k == i || k == rows * 2 - i || i == rows) {
// System.out.print("*");
// } else {
// System.out.print(" ");
// }
// }
// System.out.println();
// }
// }
// }

// //================================================================================

// public class loop{
// public static int calculateSum(int a, int b,int c){
// int sum = a+b+c;
// avg=sum/3;
// return avg;

// }
// public static void main(String args[]){
// System.out.print("enter first numer: ");
// Scanner sc=new Scanner(System.in);
// int a = sc.nextInt();
// System.out.print("enter second numer: ");
// int b = sc.nextInt();
// System.out.print("enter third numer: ");
// int c = sc.nextInt();

// int avg=calculateSum(a, b,c);
// System.out.println("multiple of two number is="+avg);
// }

// public static void calculatefactorial(int n){
// int factorial=1;

// for(int i=n; i>=1; i--){
// factorial = factorial*i;

// }
// System.out.println(factorial);

// }
// public static void main(String args[]){
// Scanner sc=new Scanner(System.in);
// int n =sc.nextInt();

// calculatefactorial(n);

// }
// }

// ////=========================================================================

// // import java.util.Scanner;
// public class loop
// {
// /*function to find table of number*/
// public static void table(int num)
// {
// for (int i = 1; i<=10; i++)
// {
// System.out.print(i * num +" ");
// }
// }
// public static void main(String[] args)
// {
// Scanner sc=new Scanner(System.in);
// int num =sc.nextInt();

// System.out.println("Table of 6=");
// table(num);//calling function

// System.out.println("\nTable of 5=");
// table(num);//calling function
// }
// }

// ////======================================================================================

// //table code

// public class loop{
// public static void table(int n){
// for(int i=1; i<=10; i++){
// System.out.println(i*n+" ");
// }
// }
// public static void main(String args[]){
// System.out.println();
// table(5);
// }
// }

// ////====================================================================================

// //Average of three number

// public class loop {
// public static void main(String[] args){
// int a,b,c, sum;
// Scanner sc= new Scanner(System.in);
// int a=sc.nextLine();
// int b=sc.nextLine();
// int c=sc.nextLine();
// sum=a+b+c;
// double Average=sum/3;
// System.out.println(Average);
// }

// }

// ////=========================================================================

// // calculate average of three number

// public class loop
// {
// public static void main(String[] args)
// {
// int a,b,c,sum;
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the first number:");
// a = sc.nextInt();
// System.out.println("Enter the second number:");
// b = sc.nextInt();
// System.out.println("Enter the third number:");
// c = sc.nextInt();
// sum=a+b+c;
// double avg=sum/3;
// System.out.println("Average of the numbers is "+avg);

// }
// }

// ////======================================================================

// public class loop {

// public static float calculateAverage(float a, float b,float c){

// float sum=a+b+c;
// return sum;
// }

// public static void main(String[] args){
// Scanner sc=new Scanner(System.in);
// System.out.print("enter number: ");
// float a=sc.nextInt();
// float b=sc.nextInt();
// float c=sc.nextInt();
// float sum = calculateAverage(a, b,c);
// System.out.println(sum/3);

// }
// }

// /////============================================================================

// /**
// * array
// */
// public class loop {

// public static void main(String[] args){
// int[] marks = new int[3];
// marks[0] = 94;
// marks[1] = 90;
// marks[2] = 89;

// // System.out.println(marks[0]);
// // System.out.println(marks[1]);
// // System.out.println(marks[2]);

// for(int i=0; i<3; i++){
// System.out.println(marks[i]);
// }
// }
// }

// ////=============================================================================================

// /**
// * array
// */
// public class loop {
// public static int oddnumber(int n){
// int sum=0;
// for(int i=0; i<=n; i++){

// if(i%2==1){
// sum+=i;
// }
// }
// return sum;
// }

// public static void main(String[] args){
// Scanner sc = new Scanner(System.in);
// int n=sc.nextInt();
// System.out.println(oddnumber(n));

// }
// }

// //=================================================================

// /**
// * array
// */
// public class loop{

// public static void main(String[] args){
// // int i=0;
// while(true){
// System.out.println("infinet loop");
// // i++;

// }
// }
// }

// //======================================================

// // import java.util.Scanner;

// public class loop{
// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);

// int positiveCount = 0;
// int negativeCount = 0;
// int zeroCount = 0;

// char choice;

// do {
// System.out.print("Enter a number (press 'q' to quit): ");
// String input = scanner.next();

// if (input.equalsIgnoreCase("q")) {
// break;
// }

// double number = Double.parseDouble(input);

// if (number > 0) {
// positiveCount++;
// } else if (number < 0) {
// negativeCount++;
// } else {
// zeroCount++;
// }

// } while (true);

// System.out.println("Count of positive numbers: " + positiveCount);
// System.out.println("Count of negative numbers: " + negativeCount);
// System.out.println("Count of zero numbers: " + zeroCount);

// scanner.close();
// }
// }

// //=======================================================

// // import java.util.Scanner;

// public class loop{
// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);

// System.out.print("Enter the base (x): ");
// double x = scanner.nextDouble();

// System.out.print("Enter the exponent (n): ");
// int n = scanner.nextInt();

// double result = Math.pow(x, n);

// System.out.println(x + " raised to the power of " + n + " is: " + result);

// scanner.close();
// }
// }

// //======================================================================

// // Common division of 2 numbers
// // import java.util.Scanner;

// public class loop{

// static int calculateGCD(int a, int b) {
// while (b != 0) {
// int temp = b;
// b = a % b;
// a = temp;
// }
// return a;
// }
// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);

// System.out.print("first number: ");
// int num1 = scanner.nextInt();

// System.out.print("second number: ");
// int num2 = scanner.nextInt();

// int gcd = calculateGCD(num1, num2);

// System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);

// scanner.close();
// }

// }

// //=========================================================================================

// /**
// * array
// */
// public class loop {

// public static void main(String[] args){
// Scanner sc = new Scanner(System.in);
// System.out.print("enter number: ");
// int size = sc.nextInt();
// int numbers[] = new int [size];

// for(int i=0; i<size; i++){
// numbers[i]=sc.nextInt();

// }
// for(int i=0; i<size; i++){
// System.out.print(numbers[i]);
// }
// }
// }

// //==============================================================================================
// public class loop{

// public static void main(String[] args){
// Scanner sc = new Scanner(System.in);
// System.out.print("enter number: ");
// int row = sc.nextInt();
// int colm = sc.nextInt();
// int numbers[][] = new int [row][colm];

// for(int i=0; i<row; i++){
// for(int j=0; j<colm; j++){
// numbers[i][j]=sc.nextInt();

// }
// }

// for(int i=0; i<row; i++){
// for(int j=0; j<colm; j++){
// System.out.print(numbers[i][j]);
// }
// System.out.println();
// }
// }
// }

// //==================================================================================

// public class loop {

// public static void main(String[] args){
// Scanner sc = new Scanner(System.in);
// System.out.print("enter number: ");
// int row = sc.nextInt();
// int colm = sc.nextInt();
// int numbers[][] = new int [row][colm];

// for(int i=0; i<row; i++){
// for(int j=0; j<colm; j++){
// numbers[i][j]=sc.nextInt();

// }
// }
// int x = sc.nextInt();

// for(int i=0; i<row; i++){
// for(int j=0; j<colm; j++){
// if(numbers[i][j]==x){
// System.out.print("x found at location of "+ i +","+ j);

// }

// }

// }
// }
// }

// //=======================================================================================
// // // * * * * *
// // // * *
// // // * *
// // // * *
// // // * * * * *

// public class loop{
// public static void main(String[] args){
// Scanner sc=new Scanner(System.in);
// System.out.print("Enter the rowcount: ");
// int rowcount=sc.nextInt();

// for(int row=0; row<rowcount; row++){
// // space
// int space=rowcount-row-1;
// for(int col=0; col<space;col++){
// System.out.print(" ");
// }
// // stars
// for(int col=0; col<rowcount; col++){
// if(row==0 || row==rowcount-1){
// System.out.print("*");
// }else{
// System.out.print("*");
// for(int col2=0; col2<rowcount-1; col2++){
// System.out.print(" ");
// }
// System.out.print("*");
// }
// System.out.println();
// }

// // Star
// if(row==0 || row==rowcount-1){
// for(int col=0; col<rowcount; col++){
// System.out.print("* ");
// }
// }else{
// for(int col=0; col<rowcount-1; col++){
// if(col==0 || col==rowcount-2){
// System.out.print("* ");
// }else{
// System.out.print(" ");
// }
// }
// }
// System.out.println();

// }

// }
// }
