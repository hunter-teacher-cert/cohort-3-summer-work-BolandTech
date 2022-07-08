import java.io.*;
import java.util.*;


/**
 * Driver class for Time class  by Team LucidThinkeren
 * First Last
 * collaborators:  Will L., Latoya B., Nicole C.
 */

/**
   INSTRUCTIONS:
   This file contains the Driver starter code for our Time class.
   
   Add code in main to test all your methods
   
   Place this file in a folder named programming/5/Driver.java
*/


public class Driver {

  public static void main(String[] args) {

	  //declare a var of appropriate type to assign an instance of Time to
	  Time t;
    Time o;

	  //assign var the address of a newly-apportioned Time object
    t = new Time(0, 15, 15); // constructor test. DONE!
    o = new Time(1, 15, 15); // for add test.

    t.add(o); // time add - DONE!
    System.out.println(t.toString()); // time.add test DONE!
  }//end main()

}//end class