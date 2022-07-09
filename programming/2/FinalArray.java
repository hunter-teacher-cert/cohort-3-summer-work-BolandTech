/**
 * ArrayPractice by Team BossCoders
 * First Last
 * collaborators: Seth Adams, Qianhui Vanessa Zou, Latoya Boland, Christopher De Silva
 */


import java.util.*;
import java.io.*;

public class FinalArray{
  /**
     Parameters:
     size - how large the array should be
     startValue - the value of the first element
     step - the interval to the next value
     Returns:
     a new array of integers
     Examples:
     buildIncreasingArray(5,3,2) will return an array
     with the values 3,5,7,9,11 (five values, starting with 3 with a step size of 2)
  */
  public static int[] buildIncreasingArray( int size, int startValue, int step )
  {
    int[] data = new int[size];
    data[0] = startValue;
      for(int i=0;i<data.length-1; i++){
          data[i+1] = data[i] + step; 
      }
    
    return data;
  }
  /**
     Parameters:
     size - how many elements in the array
     maxValue - the largest possible random value to use
     Returns:
     a new array where each element is an integer between 0 and up to but not   
     including maxValue
  */
  public static int[] buildRandomArray( int size, int maxValue )
  {
    Random r = new Random();
    int[] data = new int[size];
    for(int i =0; i <data.length; i++){
        data [i]= r.nextInt(maxValue);
        
    }
    return data;
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
  public static void printArray( int[] data )
  {
    for (int i=0; i<data.length; i++) {
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
    for (int i=0; i < data.length; i++)
    {
        if (data[i] == value) return i;
    }  
    // post condition: loop ended
    return data.length; 
  }
  /**
     Parameters: data - an array of ints
     Returns: an integer that is equal to the sum of all the elements in the array
     Ex: If the input array has the values 5,2,4,10 the return
     value will be 21 (5+2+4+10)
  */
  public static int arraySum( int[] data )
  {
    /* Coded as a team */
    int sum = 0;
    for(int i = 0; i < data.length; i++){
        sum = sum + data[i];
    }
    return sum; // replace this
  }
  /**
     Parameters:
     data - an array of integers
     Returns:
     true if the array is sorted, false otherwise
     That is, if each element is < the element to its right
     then the array is sorted.
     An array with values 5,6,10,15 is sorted
     An array with values 5,6,10,18,15 is not
  */
  public static boolean isSorted( int[] data )
  {
      for(int i =0;i<data.length-1; i ++) {
          if (data[i] > data [i+1]){
              return false;//if not sorted this is triggered and returns false
          }
      }
    // this then runs and returns true if the false if test is not triggered
    return true;
  }
  /**
     Parameters:
     data - an array of integers
     Returns:
     value of the largest element in the array
  */
  public static int findMaxValue( int[] data ) {
    int max = data[0];
    for (int i = 1; i <data.length; i++){
        if (data[i]>max){
          max = data[i];
        }
    }
      return max;
  }
  
  public static void main( String[] args )
  {
    int value = 0;
   
    Scanner input = new Scanner(System.in);
      
      System.out.println("What value would you like to search for? (0-20)");
      value = input.nextInt();
      int[] data = buildRandomArray(10, 20);
    // int[] data2 = buildIncreasingArray(10,5,3);
    printArray(data);
    System.out.println(" ");
    System.out.print("The sum is ");
       
    System.out.println(arraySum(data));
    
    int test = firstOccurence(data,value);
      if(test == data.length){
          System.out.println("Value is not in the array or dataset");
      }
    int[] data2 = buildIncreasingArray(5,5,5);
    printArray(data2);

    // add calls to show that the methods you write work.
  }
}