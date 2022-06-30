//The goal of this exercise is to program a “Guess My Number” game. 

import java.util.Scanner;
import java.util.Random;

public class GuessStarter {

    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println(number);
    }
}
   
//    public static void number(int number){
//       System.out.println("I am thinking of a number between 1 and 100 (including both).");
  
//      System.out.print("Can you guess the number? ");

//      System.out.println("You Guessed: " + guess);


// // Take input for guessing
//       int input = console.nextInt();
      
//       if (input == number){
//          System.out.println(input + " is correct!");
//       }
// //System.out.println("You were off by: " );
//       else {
//          System.out.println(input + " is too " + (input > answer ? "high" : "low"));
//          System.out.println("Try again\n");
//          guess(number);
//       }
//    }
// }

