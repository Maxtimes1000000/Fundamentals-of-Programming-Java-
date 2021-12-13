/*
Start Date: 12/12/2021          Latest Change Date: 12/13/2021          IDE:repl.it also known as replit.com
Howdy. My name is Max S. and this program is just me going through and studying the Intoduction to JAVA Programming and Data Structures Comprehensive Version by Y. Daniel Liang 12th Edition
This is also going to be my practice with being consistent about commiting things to GitHub

Chapter 1: lines 26-59      Chapter 11:                 Chapter 21:
Chapter 2:                  Chapter 12:                 Chapter 22:
Chapter 3:                  Chapter 13:                 Chapter 23:
Chapter 4:                  Chapter 14:                 Chapter 24:
Chapter 5:                  Chapter 15:
Chapter 6:                  Chapter 16:
Chapter 7:                  Chapter 17:
Chapter 8:                  Chapter 18:
Chapter 9:                  Chapter 19:
Chapter 10:                 Chapter 20:
*/

import java.text.DecimalFormat;




class Main {
  public static void main(String[] args) {
    
//1------------------------------------------Chapter 1------------------------------------------------//

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

//2------------------------------------------Chapter 2------------------------------------------------//



  }
}