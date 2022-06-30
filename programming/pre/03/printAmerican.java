import java.io.*;
import java.util.*;

public class printAmerican {

//Step 1
 public static void printAmerican (String day, int date, String month, int year){
  System.out.println(day+", "+month+" "+date+", "+year);
 }
 //Step 2
 public static void main (String []args){
  printAmerican("Sat", 2, "Jan", 2016);
 //Step 4
  printEuropean("Sat", 2, "Jan", 2016);
 }
 //Step 3
 public static void printEuropean (String day, int date, String month, int year){
  System.out.println(day+" "+date+" "+month+", "+year);
 }

}