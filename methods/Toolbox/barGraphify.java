//Bar Graph activity
// Programmers: Latoya Boland & Seth Adams

/*if x=[0,1,2,3] then barGraphify(x) will output
0:
1: =
2: ==
3: ===

if x=[1,0,3,2] then barGraphify(x) will output
0: =
1:
2: ===
3: ==*/

/*for (each item in array recurse the function the value that is in the index) 
string n = "="
for(int i = 0; i < x.length;i++){
if(x[i]==0){
return " ";
} elseif(x[i]==1) {
return n;
} else {
return barGraphify(n-1)
}
}*/


import java.io.*;
import java.util.*;

public class barGraphify {

  public static void main(String[] args) {
    int [] x = new int[]{0,1,2,3};
    for(int i = 0; i < x.length;i++) {
      System.out.print(i +": ");
      System.out.println(barGraphify(x[i]));
    }
    System.out.println("");
    x = new int[]{1,0,3,2};
    for(int i = 0; i < x.length;i++) {
      System.out.print(i +": ");
      System.out.println( barGraphify(x[i]) );
    }
      

  }
  public static String barGraphify(int n) {
        if(n==0){
            return " ";
          } else if(n==1) {
            return "=";
            } else {
              return (barGraphify(n-1) + "=");
          }
      }
  }

  
      
      
  


