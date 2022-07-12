/**
 * SuperArray by Team 1
 * Yenmin Young
 * collaborators: Yanique Sears, Latoya Boland, Stephen Sabaugh
 */

/**
   SKELETON
   SuperArray is a wrapper class for an array.
   Provides "pass-thru" accessibility to pre-existing array capabilities:
   - get/set by index
   - get length
   Adds functionality:
   - dynamic capacity
   - auto-grow capacity if necessary
*/

import java.io.*;
import java.util.*;

public class SuperArray
{
  /**
     SUBGOAL:
     declare instance vars
     ...and initialize?
  */


  //instance vars
  private int[] data;           // "interior"/"underlying" data container
  private int numberElements;   // number of "meaningful" elements


  // ~~~~~~~~~~~~~~~ CONSTRUCTORS ~~~~~~~~~~~~~~~
  //overloaded constructor -- allows specification of initial capacity
  public SuperArray( int size )
  {
    //init underlying/inner storage of specified capacity
    data = new int [size];
    //init instance vars
    numberElements = 0;
    
  }

  //default constructor -- initializes capacity to 10
  public SuperArray()
  {
    //init underlying/inner storage of capacity 10
    data = new int [10];
    //init instance vars
    numberElements = 0;
  }


  // ~~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~
  public void add( int value )
  {
    // test to see if we need to grow, then grow
    /**
       IMPORTANT:
       This is the first code that should run in this method
       but the last code you should write.
       Implement the rest of this method first,
       then only write this section once the rest is tested and working.
    */
    if (data.length<=numberElements){
      grow();
    }

    // add item
    data[numberElements] = value;


    // increment numberElements
    numberElements ++;

  }//end add()


  public boolean isEmpty()
  {
    //return whether this SuperArray instance is empty
    return numberElements == 0;
  }


  public int get(int index)
  {
    //return item at index
    return data[index];
  }


  public String toString()
  {
    //return stringified version of this Object
    String arrayString = "";
    for (int i = 0; i < data.length; i++){
      arrayString = arrayString + Integer.toString(data[i]) + " ";
    }
    return arrayString;
  }


  // return Stringified version of this Object,
  // with extra debugging info
  // (helper method for debugging/development phase)
  public String debug()
  {
    String s = "";
    s = "Size: " + this.data.length;
    s = s + " LastItem: " + numberElements + "  Data: ";
    for (int i = 0; i < numberElements; i++) {
      s = s + data[i] + ", ";
    }
    s = s + "\n";
    return s;
  }//end debug()


  public void remove(int index)
  {
    // shift items down to remove the item at index
    /* 3 7 10 4 0 0 0
      Index = 1
      NumberElements = 4
      Goal: Remove index 1
      3 7 10 4 0 0 0
      Index 1 = index 2
      3 10 10 4 0 0 0
      Index 2 = index 3
      3 10 4 4 0 0 0
      Index 3 = 0
      3 10 4 0 0 0 0
    */

    /* 3 7 10 4
      Index = 1
      NumberElements = 4
      data.length = 4
      Goal: Remove index 1
      3 7 10 4
      Index 1 = index 2
      3 10 10 4
      Index 2 = index 3
      3 10 4 4
      Index 3 = 0
      3 10 4 0
    */
    
    for (int i = index; i < numberElements-1; i++){
        data[i] = data[i+1];
      }
    data[numberElements-1] = 0;
    
    // subtract fom numElements;
    numberElements --;
  }


  public void add(int index, int value)
  {
    /* 3 7 10 4 0 0 0
      NumberElements = 4
      Goal: Add to index 1 value 5
      3 7 10 4 0 0 0

      Index 4 = Index 3
      3 7 10 4 4 0 0

      Index 3 = Index 2
      3 7 10 10 4 0 0

      Index 2 = Index 1
      3 7 7 10 4 0 0

      Index 1 = value
      3 5 7 10 4 0 0
    */
    
    // see if there's enough room
    if (data.length<=numberElements){
      grow();
    }

    // shift elements toward the end of the array
    for (int i = numberElements; i > index; i--){
      data[i] = data[i-1];
    }

    // insert new element
    data[index] = value;

    // increment numElements
    numberElements++;
  }


  private void grow()
  {
    // create a new array with extra space
    // Q: How did you decide how much to increase capacity by?
    /* YOUR SIMPLE+SMART CODE HERE */
    int newArray[] = new int [numberElements+1];

    // copy over all the elements from the old array to the new one
    /* YOUR SIMPLE+SMART CODE HERE */
    for (int i = 0; i<data.length; i++){
      newArray[i] = data[i];
    }

    // point data to the new array
    // Q: How does this look when illustrated using encapsulation diagram?
    data = newArray;
  }//end grow()

}//end class