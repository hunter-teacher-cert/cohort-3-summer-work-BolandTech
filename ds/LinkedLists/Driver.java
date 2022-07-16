import java.io.*;
import java.util.*;

public class Driver{
  public static void main(String[] args) {
    
    LinkedList l = new LinkedList();

    System.out.println("\nAdding 4 names to the LinkedList:");
    l.add("Jess");
    l.add("Rach");
    l.add("Latoya");
    l.add("Joel");
    System.out.println(l);

    System.out.println("\nThe Node at index 1 is: " +  l.get(1) );
    System.out.println("The Node at index 10 is: " + l.get(10) );
    
    
  }
}