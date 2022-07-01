class ArrayExamples{

  static int [] {45, 23, 5, 67, 23};
  // static int someDataSize = someData.length;
 // someDate[3] = 0;
 // someData[4] = 0;
  static int someDataSize = 5;
  
  public static void main( String args[]) {
    printArray(someData);
    printPartialArray(someData, someDataSize);
    int the Index = find(67, someData);
    System.out.println("67 is in position " +theIndex);
    theIndex = find(20, someData);
    if (theIndex == someData.length)
    {
      
    }
  }
  //precondition: Assumes array is filled
  public static void printArray(int[ ] data) {
    for (int i=0; i<data.length; i++) {
      System.out.print(data[i] +" ");
    }
    System.out.println("");
    }
  //precondition: Assume array is partially filled
  public static void printPartialArray(int[ ] data, int currSize_p){
    for (int i=0; i<currSize_p; i++) {
      System.out.print(data[i] + " ") ;
    }
  System.out.println("");
}
  //returns position of target item if found
  //If not found return the array size
public static int find (int tergetItem, int [ ] data){
  for (int i=0; i < data.length; i++)
  { 
    if (data[i] == tergetItem) return i;
  }
  //post condition: loop ends
  return data.length;
}
}