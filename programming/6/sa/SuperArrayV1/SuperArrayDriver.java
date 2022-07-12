import java.io.*;
import java.util.*;

public class SuperArray2Driver
{
  public static void main( String[] args )
  {
    
    System.out.println("Testing default constructor.");
    SuperArray sa = new SuperArray();

    System.out.println("Testing empty print:");
    System.out.println(sa);
    System.out.println("Testing isEmpty (should be true)");
    System.out.println(sa.isEmpty());

    // -----------------------------------------------------------
    // YOUR HOMEGROWN/HOUSEMADE/ROLL-YOUR-OWN TEST METHODS HERE...
    // -----------------------------------------------------------

    //other constructor
    SuperArray sa2 = new SuperArray(5);

    System.out.println("Testing empty print:");
    System.out.println(sa2);
    System.out.println("Testing isEmpty (should be true)");
    System.out.println(sa2.isEmpty());

    sa2.add(0,1);
    sa2.add(1,2);
    sa2.add(2,3);
    sa2.add(3,4);
    sa2.add(4,5);
    System.out.println(sa2);
    sa2.remove(3);
    System.out.println(sa2);
    //testing get()
    System.out.print("What value is the index of 3 now?");
    System.out.println(" The value of " + sa2.get(3) + ".");
    
    

    //precondition: newly-instantiated SuperArray of default capacity
    System.out.println("Testing overfill (calling grow() in add)");
    for (int i=0; i<15; i++) {
      sa.add(i);
    }//for i
    System.out.println(sa);
    System.out.println(sa.isEmpty());

    System.out.println("\nTesting add at index 5, 0 and 17(end)");
    sa.add(5, 100);
    //System.out.println(sa.debug());
    System.out.println(sa);
    sa.add(0, 100);
    System.out.println(sa);
    //sa.add(17, 100);
    System.out.println(sa);

    System.out.println("\nTesting remove at 0, 5, and 15 (end)");
    sa.remove(0);
    System.out.println(sa);

    sa.remove(5);
    System.out.println(sa);

    sa.remove(15);
    System.out.println(sa);
    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

  }//main

}//class SuperArrayDriver