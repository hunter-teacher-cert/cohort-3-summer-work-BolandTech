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

    System.out.print("\nThe size of the LinkedList is: ");
    System.out.println(l.size());

    System.out.println("\nAdding 'Holly' node to index 2: ");
    l.add(2, "Holly");
    System.out.println(l);

    System.out.println("\nAdding 'Juniper' node to index 0: ");
    l.add(0, "Juniper");
    System.out.println(l);

    System.out.println("\nAdding 'Windy' node to index -1: ");
    l.add(-1, "Windy");
    System.out.println(l);

    System.out.println("\nAdding 'Windy' node to index 9: ");
    l.add(9, "Windy");
    System.out.println(l);

    System.out.println("\nWhat index is 'Holly' at? ");
    System.out.println(l.indexOf("Holly"));

    System.out.println("\nWhat index is 'Windy' at? ");
    System.out.println(l.indexOf("Windy"));

    System.out.println("\nAdding 'Windy' node to index 9: ");
    l.add(9, "Windy");
    System.out.println(l);

    System.out.println("\nRemoving what's at index 3: ");
    l.remove(3);
    System.out.println(l);

    System.out.println("\nRemoving what's at index 0: ");
    l.remove(0);
    System.out.println(l);

    String[] arr = l.toArray();
    System.out.println("\nWhat does the LinkedList look like as a String array?");
    System.out.println(Arrays.toString(arr));
  }
}