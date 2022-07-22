/**
 * Driver - Node - LinkedList
 * collaborators: Rachel Kaufman, Joel Bianchi, Latoya B, Jessica N
 */

import java.io.*;
import java.util.*;

/**
Basic
-----
+ add(string value)
+ get(int index)
+ toString()

Intermediate 
------------
+ size()
+ add(int index,String value)
+ indexOf(String value);
+ toArray()

Challenge
--------
+ remove(int index);

Helper
------
+ getNode(int index)
*/

public class LinkedList{

  private Node head;
  private int numElements = 0;

  public LinkedList(){
    head = null;
  }

  
  // add() adds a new node that points to the head, and makes the new node the new head
  public void add(String value){

    //create a new node that points to the old head
    Node front = new Node(value, head);

    //make the new node the new head
    head = front;

    //update the variable tracking the size
    numElements++;
  }

  
// get() returns the string at the node in the specified index
  public String get(int targetIndex){

    //create reference to help loop through list
    Node walker = head;
    
    //go in a loop through each node until we reach the target index
    for(int i=0; i<=targetIndex && walker != null; i++ ){
      
      //if we have reached the target index
      if (i == targetIndex){
        //return the data from the target
        return walker.getData();
      }
      
      //if (walker.getNext() != null) 
      walker = walker.getNext();
      
    }
    //return if we didn't find the target index
    return "Value at index not found.";
  }

   
 // toString() returns a string version of the list
  public String toString(){
    
    //create a walker
    Node walker = head;

    //create a variable to store our String representation
    String nodeStr = "";

    //loop through the linkedlist until there are no nodes left
    while (walker != null) {

      //add the data from each node to the nodeString
      nodeStr += walker.toString();

      //move walker on to the next node
      walker = walker.getNext();
      
      //System.out.println(walker.getData());
    } 
    
    return nodeStr;
  }

  
  //sizeOriginal() returns the number of elements in the list by counting
  public int sizeOriginal(){
    //initialize a counter variable for the number of elements
    int numElements = 0;

    //create a walker
    Node walker = head;
    
    //keep going through the linkedlist until reaching a null
    while (walker != null) {

      //counter++
      numElements++;
      
      //move walker on to the next node
      walker = walker.getNext();
    } 

    //return counter
    return numElements;
  }

  
  //size() returns the number of elements in the list
  public int size(){
    return numElements;
  }


//add(int, String) adds the string value at given index
  public void add(int index, String value){

    //EDGE CASE 1: The user wants to add at index 0
    if (index == 0) {
      add(value);
    } 

    //EDGE CASE 2: The user tries an index that's too big or negative
    else if (index >= numElements || index < 0) {
      System.out.println("Error!  Cannot add: index is out of range!");
    }

    //VALID CASE: User provides a valid non-zero index
    else {
      //create the new node
      //& point the new node to the node at the current index
      Node newNode = new Node(value, getNode(index));  //Holly point to Rach

      //get the previous node (index-1)
      //& set the new node as its next node
      getNode(index-1).setNext(newNode);    //Latoya to point to Holly
      
      //update the variable tracking size of list  
      numElements++;
    }
  }

  
  //LinkedList class helper method
  // getNode() returns the node in the specified index
  public Node getNode(int targetIndex){

    //create reference to help loop through list
    Node walker = head;
    
    //go in a loop through each node until we reach the target index
    for(int i=0; i<=targetIndex && walker != null; i++ ){
      
      //if we have reached the target index
      if (i == targetIndex){
        //return the NODE from the target
        return walker;
      }
      
      //if (walker.getNext() != null) 
      walker = walker.getNext();
      
    }
    //return if we didn't find the target index
    return null;
  }


// indexOf() returns the location of the first instance of value
  public int indexOf(String value){
    
    //for loop i=0 i<size of the list
    for (int i=0; i<numElements; i++){

      //if item at that location == value
      if ( get(i) == value ){

        // return i
        return i;
      }        
    }

    //return if the value isn't in the list anywhere
    return -1;
  }

  
  /**
  This method should create a new array that is the same
  size as the number of Nodes in the list.
  It should then copy all of the values to the array and return
  the array.
  */
  public String[] toArray(){
    
    //Create a new String array with the same size as the LinkedList
    String[] arr = new String[numElements];

    //create a walker
    Node walker = head;

    //loop through all the indices up to numElements
    //& the next element isn't null
    for(int i=0; i<numElements && walker != null; i++){

      //Assign each walker's value to the array
      arr[i] = walker.getData();
            
      //move walker on to the next node
      walker = walker.getNext();
    }

    //return the String[]
    return arr;
  }

  
  /**
  Remove the Node at location index from the list.

  Ex: Given the list:
  "a"->"b"->"c"->"d"->"e"

  remove(2) results in:
  "a"->"b"->"d"->"e"
  */
  public void remove(int index){

    //EDGE CASE: removing 0
    if(index == 0){
      head = getNode(1);
    }

    //PRIMARY CASE: removing an index 1-numElements
    else{
     //access the node BEFORE the index
      Node b = getNode(index-1);

      //change Node b to point to d
      b.setNext( getNode(index+1) );
    }

    //update the variable tracking size of list
    numElements--;
  }
  
}