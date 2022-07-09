//Room#1 - Seth, Latoya, Chris, William, Yanique

import java.io.*;
import java.util.*;

public class Nim
  {
    public static void main( String[] args )
    {
      int stones = 12;
      int stonesTaken;
  //prompt user input (user turn)
      Scanner input = new Scanner(System.in);
        Random rand = new Random();
        while(stones > 0) {
        System.out.print("How many stones do you want to take first? (1-3): ");
        stonesTaken = input.nextInt();
        while(stonesTaken > 3) {
            System.out.print("Pick 1-3 stones please: ");
            stonesTaken = input.nextInt();
        }
            stones -= stonesTaken;
  //check for did you win
        if (stones <= 0) {
            System.out.println("Player wins");
            break;
        }
  //calculating number of stones remining and print it
            System.out.println(stones + " Remaining");
  //computer turn...machine takes turn
            stonesTaken = rand.nextInt(3)+1;
            System.out.println("The computer took " + stonesTaken + " stones");
  //check for did computer win
            if (stonesTaken>stones) {
                stonesTaken=stones;
            }
            stones -= stonesTaken;

            if (stones <= 0) {
            System.out.println("Computer wins");
                break;
        }

  //calculating number of stones remining and print it
            System.out.println(stones + " Remaining");

//*1 stone remaining to win or select the last 3?*//
        
      }
    }
  }