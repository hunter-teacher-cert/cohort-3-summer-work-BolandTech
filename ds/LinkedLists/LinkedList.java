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
- get(int index);
- toString()

Intermediate 
------------
- size()
- add(int index,String value)
- indexOf(String value);
- toArray()

Challenge
--------
- remove(int index);
*/

public class LinkedList{

  private Node head;

  public LinkedList(){
    head = null;
  }

  // add() adds a new node that points to the head, and makes the new node the new head
  public void add(String value){

    //create a new node that points to the old head
    Node front = new Node(value, head);

    //make the new node the new head
    head = front;
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

  

  /**
  returns the number of elements in the list
  */
  public int size(){
    return 0;
  }



  /**
  Parameters:
  index - an int with the location to add
  value - the new value

  Adds a new node with the String value to the list.
  The new node should be added at the location specified by the index.

  For example, given the list:
  "a" -> "b" -> "c" -> "d"

  add(1,"z") results in:
  "a"-> "z" -> "b" -> "c" -> "d"

  */
  public void add(int index, String value){

  }


  /**
  Returns the index (location) of the first node in the list
  that contains value.

  Example:
  Given the list:
  "a"->"b"->"c"->"d"->"e"
  indexOf("d") would return 3 since "d" is at location 3.

  */
  public int indexOf(String value){
    return 0;
  }


  /**
  This routine should create a new array that is the same
  size as the number of Nodes in the list.

  It should then copy all of the values to the array and return
  the array.

  */
  public String[] toArray(){
    return null;
  }



  /**
  Remove the Node at location index from the list.

  Ex:
  
  Given the list:
  "a"->"b"->"c"->"d"->"e"

  remove(2) results in:
  "a"->"b"->"d"->"e"
  */
  public void remove(int index){
  }
  
}