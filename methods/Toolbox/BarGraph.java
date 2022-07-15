//Bar Graph activity
// Programmers: Yenmin Young & Joel Bianchi
//Testing "Pair Programming Protocol"

public class BarGraph{
  public static void main (String[] avocado){

    //test run 1
    System.out.println("ARRAY 1");
    int[] x= {0,1,2,3};
    bargraphify(x);
    vBarGraphify(x);

    //test run 2
    System.out.println("ARRAY 2");
    int[] y= {1,0,3,2,9};
    bargraphify(y);
    vBarGraphify(y);
  } // end of main

  public static void bargraphify (int[] x){
    /*  barGraphify(int[] nums)` takes an array of non-negative integers and prints a horizontal bar for each index, commensurate with the value at said index.
_Exempli gratia,_
if x=[0,1,2,3] then barGraphify(x) will output
0:
1: =
2: ==
3: ===

if x=[1,0,3,2] then barGraphify(x) will output
0: =
1:
2: ===
3: ==
  */

    // loop through the array indices
    for (int i = 0; i<x.length; i++){

      //print the index, + colon + space
      System.out.print(i + ": ");

      //print the correct number of equal signs based on the array element's value
      for (int j = 0; j<x[i]; j++){
        System.out.print("=");
      } // end of for loop (build the fence)

      //go to a new line for each index
      System.out.println("");
      
    } // end of for loop (go through the whole array)

    //add a space after each run of bargraphify
    System.out.println("");
         
    } // end of graphify method

  /*
  vBarGraphify(int[] nums) takes an array of non-negative integers and prints a set of vertical bars visualizing the magnitude of the value at each index. Exempli gratia,
Exempli gratia,
if x=[0,1,2,3] then barGraphify(x) will output
      * 
    * * 
  * * * 
0 1 2 3 

if x=[1,0,3,2] then barGraphify(x) will output
    *   
    * * 
*   * * 
0 1 2 3
  */

  public static void vBarGraphify(int[] arr){

    // find the largest number for the tallest bar
    int graphHeight = 3;
    
    for(int i=0; i<arr.length; i++){
     if(arr[i] > graphHeight){
       graphHeight = arr[i];
     } 
    }
   
    // make the bar for the highest number
    for(int row=graphHeight; row>0; row--){

      //loop through each column
      for(int col=0; col<arr.length; col++){

        //determine whether to print a space or a star
        if(arr[col] < row ){
          System.out.print(" ");
        } else {
          System.out.print("*");
        }
        
        //1 space between each column
        System.out.print(" ");
      }

      //go to the next row
      System.out.println();
            
    }

    //
    for(int i=0; i<arr.length; i++){
      // Prints the numbers on the bottom (1 space between each column)
      System.out.print(i + " ");
    }

    // Makes a new line at the end of the vertical bar graph
    System.out.println("\n");
    
  }

 

  
} //end of class