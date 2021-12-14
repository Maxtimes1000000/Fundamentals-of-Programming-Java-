/*  Read Me
  Start Date: 12/12/2021        IDE:repl.it also known as replit.com
  Howdy. My name is Max S. and this program is just me going through and studying the Intoduction to JAVA Programming and Data Structures Comprehensive Version by Y. Daniel Liang 12th Edition
  This is also going to be my practice with being consistent about commiting things to GitHub

  Chapter 1: lines 26-60      Chapter 11:                 Chapter 21:
  Chapter 2: lines 61-159     Chapter 12:                 Chapter 22:
  Chapter 3: lines 160-176    Chapter 13:                 Chapter 23:
  Chapter 4:                  Chapter 14:                 Chapter 24:
  Chapter 5:                  Chapter 15:
  Chapter 6:                  Chapter 16:
  Chapter 7:                  Chapter 17:
  Chapter 8:                  Chapter 18:
  Chapter 9:                  Chapter 19:
  Chapter 10:                 Chapter 20:
*/

import java.text.DecimalFormat;
import java.util.Scanner; // imports the Scanner class. This type of import is known as a specific import
//import java.util.*; //Imports all of the classes from the package java.util  This is known as a wildcard import (More detail in Ch:2 pg:38)



class Main {
  public static void main(String[] args) {
    
//1------------------------------------------Chapter 1------------------------------------------------//
    /*
    System.out.println("Hello world!"); //Outputs the words "Hello world" to the console with a new line
    System.out.print("3 * 5 = "); //Outputs "3 * 5 = " to the console without a new line after it
    System.out.println(3 * 5); //Outputs 15 to the console to the right of the previous output of "3 * 5 = "
    System.out.print("\n\n"); //Outputs two new lines to the console using the escape sequence "\" and the code for a new line
    System.out.println("    J     A     V     V     A   "); //Chapter 1 Question 1.3
    System.out.println("    J    A A     V   V     A A  ");
    System.out.println("J   J   AAAAA     V V     AAAAA ");
    System.out.println(" J J   A     A     V     A     A");

    System.out.println("\n");

    System.out.println("Current USA population: 312,032,486"); //Chapter 1 Question 1.11
    System.out.printf("Population 1 year later: "); //This line randomly has a printf instead of a print just for fun
    System.out.printf("%.2f\n" , (312032486 + (((1.0 / 7.0) + (1.0 / 45.0) - (1.0 / 13.0)) * 60 * 24 * 365))); //This printf is important because "System.out.print() and System.out.println() take a single argument, but printf() may take multiple arguments." According to https://www.geeksforgeeks.org/formatted-output-in-java/
    System.out.print("Population 2 years later:");
    DecimalFormat ft = new DecimalFormat("###,###,###.##"); //This is another way of formatting outputs, specifically decimals, but requires that you import java.text.DecimalFormat;
    System.out.println(" " + ft.format(312032486 + (((1.0 / 7.0) + (1.0 / 45.0) - (1.0 / 13.0)) * 60 * 24 * 365 * 2)));
    System.out.print("Population 3 years later: ");
    System.out.println(" " + ft.format(312032486 + (((1.0 / 7.0) + (1.0 / 45.0) - (1.0 / 13.0)) * 60 * 24 * 365 * 3)));
    System.out.print("Population 4 years later: ");
    System.out.println(" " + ft.format(312032486 + (((1.0 / 7.0) + (1.0 / 45.0) - (1.0 / 13.0)) * 60 * 24 * 365 * 4)));
    System.out.print("Population 5 years later: ");
    System.out.println(" " + ft.format(312032486 + (((1.0 / 7.0) + (1.0 / 45.0) - (1.0 / 13.0)) * 60 * 24 * 365 * 5)));

    System.out.println("\n\n\nYou have the following system of equations:\n3.4x + 50.2y = 44.5"); //Chapter 1 Question 1.3 (rule: use no content from later chapters)
    System.out.println("2.1x + .55y = 5.9\nWhat are the values of x and y");
    System.out.print("\nx = ");
    System.out.printf("%.5f" , (((44.5*.55)-(50.2*5.9))/((3.4*.55)-(50.2*2.1))));
    System.out.print("\ny = ");
    System.out.printf("%.5f" , (((3.4*5.9)-(44.5*2.1))/((3.4*.55)-(50.2*2.1))));
    System.out.println(""); //Just messing around with as many options for creating a new line as I can think of
    */
//2------------------------------------------Chapter 2------------------------------------------------//
  /*  
    double radius; //Declaration of a variable named radius of variable type double
    double area;

    radius = 20; // "=" is known as the assignment operator because it assigns value to a variable
    
    area = 3.14159 * radius * radius; //Assigns the product of pi * r^2 to the area

    System.out.print("\n\nThe are is ");
    System.out.println(area);

    Scanner input = new Scanner(System.in); //Creates a scanner object

    System.out.print("Enter a number for the radius: ");
    radius = input.nextDouble();

    area = 3.14159 * radius * radius; //Computes the area but with the new value 

    System.out.print("\nThe Area is: ");
    System.out.print(area);

    System.out.print("\n\nPlease enter 3 numbers with spaces between each number: ");
    double num1 = input.nextDouble(); //Creates a new variable "num1" of data type double and asigns the nextDouble that the user inputs to the variable "num1"
    double num2 = input.nextDouble();
    double num3 = input.nextDouble();

    double average = (num1+num2+num3)/3;

    System.out.print("\nThe average of the numbers you have given is ");
    System.out.printf("%.2f" , average); //Print the average to 2 decimals

    int i, j, k=1; //Declares integer variable i, j, & declares and asigns the value 1 to k

    i = j = k = 2; //This is known as a chained assignment. As long as the far right thing has a specified value (variable or not) and the data types are compatiblethen the rest of the variables in the set will be given that value

    System.out.printf("\n\ni = ");
    System.out.print(i);
    System.out.printf("\nj = ");
    System.out.print(j);
    System.out.printf("\nk = " , k);
    System.out.println(k);

    System.out.println(); //Just your friendly neighborhood new line here
  

    Scanner in = new Scanner(System.in); //creates the in scanner object

    System.out.print("Enter a number and I will tell you its cube: ");
    double num1 = in.nextDouble();

    System.out.println();
    System.out.print(num1);
    System.out.print(" cubed = ");
    System.out.println(Math.pow(num1,3));
  */
  /*
    //By default an integer literal is in decimal but theres a way to change that.
    System.out.println(0B10101010); //The leading 0B || 0b means to read the rest of whats written as binary and output it in decimal
    System.out.println(012345); //The leading 0 denotes octal after the 0 and outputs it in decimal
    System.out.println(0xFFFF); //The leading 0x || 0X denotes hexadecimal for the rest and outputs in decimal

    long totalMilliseconds = System.currentTimeMillis(); //gives variable "totalMilliseconds" value of number of milliseconds since UNIX epoch aka 01-01-1970 00:00:00 GMT
    long totalSeconds = totalMilliseconds / 1000;
    long currentSecond = totalSeconds % 60;
    long totalMinutes = totalSeconds / 60;
    long currentMinute = totalMinutes % 60;
    long totalHour = totalMinutes / 60;
    long currentHour = ((totalHour % 24) + 6) % 12; //+6 in order to adjust to Central Standard Time then 
    
    DecimalFormat ft = new DecimalFormat("00"); //This is the way to format the output so it doesn't do nonsense like this 13:8:2 when it should say 13:08:02
    System.out.println("\nThe Current Time is " + ft.format(currentHour) + ":" + ft.format(currentMinute) + ":" + ft.format(currentSecond) + " CST");

    Scanner input = new Scanner(System.in);
    System.out.print("\n\nEnter a number between 1 and 1000: "); //Chapter: 2  Question: 2.6
    int number = input.nextInt();

    int sumOfDigits = ((number/100)+((number%100)/10)+(number%10)); //NO SCRATCH PAPER SONNNNNNN!!!!! Also this sums the digits of the input

    System.out.println("The sum of the digits is " + sumOfDigits);

    System.out.print("\n\nEnter the monthly saving amount: "); //Chapter: 2 Question: 2.13
    double number2 = input.nextDouble();

    double month1, month2, month3, month4, month5, month6;
    
    month1 = (number2 * (1.0 + 0.00417));
    System.out.printf("\n%.3f After one month with 5%% annual interest" , month1);
    month2 = ((number2 + month1) * (1.0 + 0.00417));
    System.out.printf("\n%.3f After two months with 5%% annual interest" , month2);
    month3 = ((number2 + month2) * (1.0 + 0.00417));
    System.out.printf("\n%.3f After three months with 5%% annual interest" , month3);
    month4 = ((number2 + month3) * (1.0 + 0.00417));
    System.out.printf("\n%.3f After four months with 5%% annual interest" , month4);
    month5 = ((number2 + month4) * (1.0 + 0.00417));
    System.out.printf("\n%.3f After five months with 5%% annual interest" , month5);
    month6 = ((number2 + month5) * (1.0 + 0.00417));
    System.out.printf("\n%.3f After six months with 5%% annual interest" , month6);
  */
//-------------------------------------------Chapter 3------------------------------------------------//
    //ask Mark which flowchart software he recommends
    Scanner input = new Scanner(System.in);
    System.out.print("\nEnter a grade from 0-100: ");
    int grade = input.nextInt();

    if(grade >= 90)
      System.out.println("You got an A!");
    else if(grade >= 80)
      System.out.println("You got a B");
    else if(grade >= 70)
      System.out.println("You got a C");
    else if(grade >= 60)
      System.out.println("You got a D");
    else
      System.out.println("You got an F");

//---    
  }
}