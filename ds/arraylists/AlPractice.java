/**
 * AlPractice
 * collaborators: Rachel Kaufman, Joel Bianchi, Latoya B
 */


/** TO DO AFTER COMPLETING BASE REQUIREMENTS
- add in "catch" for swap indexes out of bounds
- add in check for same length in sumArrays
*/

import java.io.*;
import java.util.*;

/** 
________________
METHODS INCLUDED
________________
[031] buildRandomList(int size, int maxval)
[051] sumOfList(ArrayList<Integer> dataList)
[068] swapElements(ArrayList<Integer> dataList, int indexA,int indexB)
[085] removeValue(ArrayList<Integer> dataList, int valueToRemove)
[101] sumLists(ArrayList<Integer>ListA,ArrayList<Integer>ListB)
[121] zipLists(ArrayList<Integer>ListA,ArrayList<Integer>ListB)
*/


public class AlPractice{

// buildRandomList generates an ArrayList of length size where each value is a random number up to maxval
  public static ArrayList<Integer> buildRandomList(int size, int maxval){

    //constructing a new ArrayList
    ArrayList<Integer> randomList = new ArrayList<Integer>();

    //traverse list
    for (int i = 0; i < size; i++) {

      //creating a random object
      Random rand = new Random();
      
      //add a random integer to all indices
      randomList.add(rand.nextInt(maxval)); 
    }

    //return the new arraylist created
    return randomList;
  }

// sumOfList returns the sum of all of the elements of the ArrayList dataList.
  public static int sumOfList(ArrayList<Integer> dataList){

    //initialize a variable for the sum 
    int listSum = 0;

    //traverse the array
    for (int i = 0; i < dataList.size(); i++) {

      //add each elements value to the sum
      listSum += dataList.get(i);
    }
    
    //return the sum
    return listSum;
  }

// swapElements places the value at index1 into index2 slot, and the value at index2 into the index1 slot.
  public static void swapElements(ArrayList<Integer> dataList, int index1,int index2){

    //create a temp int to hold onto one of the values
    int placeholder;

    //store the first value
    placeholder = dataList.get(index1);

    //move the value from the second index to the first slot
    dataList.set(index1, dataList.get(index2));

    //move the temp value to the second slot
    dataList.set(index2, placeholder);
    
  }

// removeValue traverses dataList; if any item in the list matches valueToRemove, that item is removed
  public static void removeValue(ArrayList<Integer> dataList, int valueToRemove){

    //for each index in dataList
    for (int i = 0; i < dataList.size(); i++) {

      //repeatedly check if you're seeing the value we want to remove at the current index
      while (dataList.get(i) == valueToRemove) {

        //remove it!
        dataList.remove(i);
      }
    }
  }


// sumLists sums the values at index i from ListA and ListB and adds them to sumArrayList at the same index.
  public static ArrayList<Integer> sumLists(ArrayList<Integer>ListA, ArrayList<Integer>ListB){

    //determine the size of the new ArrayList
    //the ArrayList should be the same size as either ListA or ListB
    int newSize = ListA.size();
    
    //create a new ArrayList to hold the sums
    ArrayList<Integer> sumArrayList = new ArrayList<Integer>();

    //traverse the indices of the array -- based on the size of the ListA
    for (int i = 0; i < newSize; i++) {
      
      //add the Integer which is the sum from 2 given ArrayLists 
      sumArrayList.add(ListA.get(i)+ListB.get(i));
    }

    return sumArrayList;
  }

// zipLists "zippers" together 2 lists such that the new list looks like [A0, B0, A1, B1 ... An, Bn]
  public static ArrayList<Integer> zipLists(ArrayList<Integer>ListA,ArrayList<Integer>ListB){
    
    ArrayList<Integer> zippedArray = new ArrayList<Integer>();

    for (int i = 0; i < ListA.size(); i++) {
      zippedArray.add(ListA.get(i));
    }

    for (int i = 0; i < ListB.size(); i++) {
      zippedArray.add(2*i+1, ListB.get(i));
    }
    
    return zippedArray;
  }


  public static void main(String[] args) {

    //test buildRandomList
    ArrayList<Integer> al = buildRandomList(10,15);
    System.out.println("\nArrayList al:\n" + al);

    //test the sumOfList
    System.out.println("\nThe sum of ArrayList al is: "
 + sumOfList(al));

    // test swapElements
    swapElements(al,2,6);
    System.out.println("\nArrayList al after swapping the elements at 2 and 6:\n" + al);

    // test removeValue
    al.add(5);
    al.add(10);
    al.add(5);
    al.add(13);
    al.set(2,5);
    al.set(3,5);
    System.out.println("\nArrayList al after adding 4 more elements & setting indices 2 and 3 to the value 5:\n" + al);
    removeValue(al,5);
    System.out.println("\nRemove all 5 values from ArrayList al:\n" + al);

    //test out sumLists
    ArrayList<Integer> al2 = buildRandomList(5,10);
    System.out.println("\nArrayList al2:\n" + al2);
    ArrayList<Integer> al3 = buildRandomList(5,10);
    System.out.println("\nArrayList al3:\n" + al3);
    ArrayList<Integer> al4 = sumLists(al2, al3);
    System.out.println("\nThe sum of the elements of al2 and al3 is ArrayList al4:\n" + al4);

    //test out zipLists
    ArrayList<Integer> al5 = zipLists(al2,al3);
    System.out.println("\nal2 zipped into al3 is ArrayList al5:\n" + al5);

  }

}