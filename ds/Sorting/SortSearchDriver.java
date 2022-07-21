import java.io.*;
import java.util.*;

public class SortSearchDriver {
    public static void main(String[] args) {


    	// Uncomment these to test part 1
    	
    	SortSearch ss = new SortSearch(20);
    	System.out.println(ss);
    	
    		
    	// Uncomment these to test part 2
    
    	int i;
    	i = ss.findSmallestIndex(0);
    	System.out.println("ss["+ i +"] = "+ss.get(i)+" : " + ss);
    
    	i = ss.findSmallestIndex(17);
    	System.out.println("ss["+ i + "] = "+ss.get(i)+" : " + ss);
    	
    	// Uncomment these to test part 3
    
    	System.out.println(ss);
    	ss.sort();
    	System.out.println(ss);
	
      System.out.println(ss.linearSearch(1));



      	//Test CONSTRUCTORS
  System.out.println("\nA new ArrayList ss with 20 random integers:");
	SortSearch ss = new SortSearch(20);
	System.out.println(ss);

  // SortSearch ss2 = new SortSearch();
	// System.out.println(ss2);
			
	//Test FINDSMALLEST()
	int i;

  System.out.println("\nFinding index of smallest element in ss ArrayList starting from beginning:");
	i = ss.findSmallestIndex(0);
  System.out.println("ss["+ i +"] = "+ss.get(i));

  System.out.println("\nFinding index of smallest element in ss ArrayList starting from index 13:");
	i = ss.findSmallestIndex(13);
	System.out.println("ss["+ i + "] = "+ss.get(i));
	
	//Test SELECTION SORT
	System.out.println("\nUse selection sort on ss:");
	ss.sort();
	System.out.println(ss);

  //Test LINEAR SEARCH
  System.out.println("\nDoing a LINEAR SEARCH for a 7 in the ss ArrayList: ");
  int found = ss.linearSearch(7);
  if(found == -1){
    System.out.println("not found");
  } else {
    System.out.println("found at index " + found);
  }

  //Test BINARY SEARCH
  System.out.println("\nDoing a BINARY SEARCH for a 7 in the ss ArrayList: ");
  int found2 = ss.binarySearch(7);
  if(found2 == -1){
    System.out.println("not found");
  } else {
    System.out.println("found at index " + found2);
  }

  /*
    //Test BINARY SEARCH RECURSIVE
    System.out.println("\nDoing a RECURSIVE BINARY SEARCH for a 7 in the ss ArrayList: ");
  int found3 = ss.binarySearchRecursive(7, 0, ss.size());
  if(found3 == -1){
    System.out.println("not found");
  } else {
    System.out.println("found at index " + found3);
  }


      */

	      

    }
}