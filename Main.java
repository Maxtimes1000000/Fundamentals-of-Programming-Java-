/*
Start Date: 12/12/2021          Latest Change Date: 12/13/2021
Howdy. My name is Max S. and this program is just me going through and studying the Intoduction to JAVA Programming and Data Structures Comprehensive Version by Y. Daniel Liang 12th Edition
This is also going to be my practice with being consistent about commiting things to GitHub
Chapter 1
*/
class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!"); //Outputs the words "Hello world" to the console with a new line
    System.out.print("3 * 5 = "); //Outputs "3 * 5 = " to the console without a new line after it
    System.out.println(3 * 5); //Outputs 15 to the console to the right of the previous output of "3 * 5 = "
    System.out.print("\n\n"); //Outputs two new lines to the console using the escape sequence "\" and the code for a new line
    System.out.println("    J     A     V     V     A   ");
    System.out.println("    J    A A     V   V     A A  ");
    System.out.println("J   J   AAAAA     V V     AAAAA ");
    System.out.println(" J J   A     A     V     A     A");

    System.out.println("\n");

    System.out.println("Current USA population: 312,032,486");
    System.out.print("Population 1 year later: ");
    System.out.println((312032486 + (((1.0 / 7.0) + (1.0 / 45.0) - (1.0 / 13.0)) * 60 * 24 * 365)));
    System.out.print("Population 2 years later: ");
    System.out.println((312032486 + (((1.0 / 7.0) + (1.0 / 45.0) - (1.0 / 13.0)) * 60 * 24 * 365 * 2)));
    System.out.print("Population 3 years later: ");
    System.out.println((312032486 + (((1.0 / 7.0) + (1.0 / 45.0) - (1.0 / 13.0)) * 60 * 24 * 365 * 3)));
    System.out.print("Population 4 years later: ");
    System.out.println((312032486 + (((1.0 / 7.0) + (1.0 / 45.0) - (1.0 / 13.0)) * 60 * 24 * 365 * 4)));
    System.out.print("Population 5 years later: ");
    System.out.print((312032486 + (((1.0 / 7.0) + (1.0 / 45.0) - (1.0 / 13.0)) * 60 * 24 * 365 * 5)));
  }
}