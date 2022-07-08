//Room #1 - Mr-Adams, BolandTech, cdesilva2, qvzou

import java.util.*;
import java.io.*;

public class ArrayPractice {

  /**
     Parameters:
     size - how many elements in the array
     maxValue - the largest possible random value to use
     Returns:
     a new array where each element is an integer between 0
     and up to but not including maxValue
  */
  public static int[] buildRandomArray( int size, int maxValue ) {
    
    Random r = new Random();//creating Random object
    int[ ] data = new int[size];
      for(int i = 0; i < data.length; i++) {
        data [i] = r.nextInt(maxValue);
        System.out.println(data[i]); 

    return data.length;
  }
  }
}

  /**
     Parameters:
     data - an array of ints
     Returns:
     nothing
     prints out the array
     Note: data.length stores the length of the array
     Another Note: yes, we know William live coded this a few minutes ago.
  */

  // precondition: Assumes array is filled   
  public static void printArray( int[] data )
  {
    for (int i=0; i<data.length; i++) {
      System.out.print(data[i] + " ") ;
  }
  System.out.println("");
  }
  //precondition: Assume array is partially filled
  public static void printPartialArray(int[ ] data, int currSize_p) {
    for (int i=0; i<currSize_p; i++) {
      System.out.print(data[i] + " ") ;
    }
    System.out.println("");
  }


  /**
     Parameters:
     data - an array of integers
     value - the value to search for
     Returns:
     the index (location) of the first occurence of value
     Example:
     given array data, containing 1,5,2,7,5,8,5,12,19,5
     firstOccurence(data,5) would return 1
     since the first occurence of the value 5 is at a[1]
  */
  public static int firstOccurence( int[] data, int value )
  {

    /* YOUR BRILLIANT CODE HERE */

    return 0; // change this (it is just a placeholder to "get past" the compiler)
  }


  /**
     Parameters: data - an array of ints
     Returns: an integer that is equal to the sum of all the elements in the array
     Ex: If the input array has the values 5,2,4,10 the return
     value will be 21 (5+2+4+10)
  */
  public static int arraySum( int[] data )
  {
    /* YOUR BRILLIANT CODE HERE */

    return 0; // replace this
  }


  
  /**
     Parameters:
     data - an array of integers
     Returns:
     value of the largest element in the array
  */
  public static int findMaxValue( int[] data ) {
    int m;  // will hold the maximum value;

    /* YOUR BRILLIANT CODE HERE */

    return m;
  }


  public static void main( String[] args )
  {

    // remove the comments as you complete each routine
    // and add more lines as you add additional routines.

    // int[] data = buildRandomArray(10, 20);
    // int[] data2 = buildIncreasingArray(10,5,3);
    // printArray(data);
    // printArray(data2);

    // add calls to show that the methods you write work.
  }
}