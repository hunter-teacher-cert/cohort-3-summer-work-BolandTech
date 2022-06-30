import java.util.Scanner;

class Celsius {
  
public static void main(String[] args) {

//Write a program that converts a temperature from Celsius to Fahrenheit. It should (1) prompt the user for input, (2) read a double value from the keyboard, (3) calculate the result, and (4) format the output to one decimal place. For example, it should display "24.0 C = 75.2 F".

double Celsius;
double Fahrenheit;
//final double CEL_TO_FAR = 1.8;
//final int FACTOR = 32;
        
Scanner in = new Scanner(System.in);

// prompt the user and get the value
System.out.print("What is the temperature in degress Celsius? (ex: 25.0)  ");
Celsius = in.nextDouble();

// convert and output the result
Fahrenheit = (Celsius * 1.8) + 32;

//System.out.printf(" "+Celsius+" Celsius = \%.1f Fahrenheit");

System.out.println("Value of "+Celsius+" Celsius in Fahrenheit: "+ Fahrenheit);   
   
  
//System.out.println("value of temperature in fahrenheit:"+ Fahrenheit);



  
  
}  
}
