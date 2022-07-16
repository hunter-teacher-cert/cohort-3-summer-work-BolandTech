/**
 * Driver - Node
 * collaborators: Rachel Kaufman, Joel Bianchi, Latoya B
 */

import java.io.*;
import java.util.*;

public class Driver{

    public static void main(String[] args) {

	// Fist:
	// Start here and trace through
	// the code by hand until the comment
	// that says stop tracing

  System.out.println("Starter prints: ");
	Node front;
	front = new Node("one");
	front.setNext(new Node("two"));
	front.getNext().setNext(new Node("three"));
	front.getNext().getNext().setNext(new Node("four"));

	System.out.println(front.getData());

	Node walker;

	walker = front;
	System.out.println(front.getData());
	walker = walker.getNext();
	System.out.println(walker.getData());
	System.out.println(front.getNext().getData());

	// stop tracing

	// Now, compile and run the program
	// using "javac Driver.java Node.java"
	// and then "java Driver"

	// Once you've run,
	// complete the program as per the following comments
	// and compile and run your program again.

  System.out.println("\nPrinting out all the Nodes starting at front: ");
	// 1. Add a line to set the walker variable defined above
	// so that it points to (refers to) the same node as
	// the variable front points to.
	walker = front;
      
	// 2. Uncomment the next line, javaccompile and run
	// to test what you just added
	System.out.println(walker.getData());

	// Add the code necessary
	// to set up a loop that
	// 3. prints out what is in walker.data()
	// 4. moves walker to point to the next node
	// 5. loops until walker gets to null
      
    while (walker.getNext()  != null) {
      walker = walker.getNext();
      System.out.println(walker.getData());
    }
  }
}