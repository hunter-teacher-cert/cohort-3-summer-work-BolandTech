import java.io.*;
import java.util.*;

public class Conditionals{ 

// public static void main(String[] args){
//   int x; 
  
//   x = 8;

//   if (x > 0) {
//     if (x < 10) {
//         System.out.println("positive single digit number.");
//     }
// }

public static boolean isSingleDigit(int x) {
    return x > 0 && x < 10;
}


public static void main(String[] args){
  int x; 
  
  x = 8;

//   if (x > 0) {
//     if (x < 10) {
//         System.out.println("positive single digit number.");
//     }
// }
System.out.println(isSingleDigit(2));
boolean bigFlag = !isSingleDigit(17);
System.out.println("positive single digit number.");

// public static boolean isSingleDigit(int x) {
//     if (x > 0 && x < 10) {
//         return true;
//     } else {
//         return false;
//     }
// }
 

// if (x > 0 || x < 10) {
//         System.out.println("positive single digit number.");
//     }
// }

}
}
  