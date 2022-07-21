~Scaffold Solution~

// Level 1 ALL
public int findSmallestIndex(int start){
  int smallIndex = start;

  for (int i = start; i < data.size(); i++){
    if (data.get(smallIndex) > data.get(i)){
      smallIndex = i;
    }
  }
  
  return smallIndex;
}

// Level 2 MOST

public void sort(){
  // One loop through:
  // Find smallest index
  // Swap to position i (starts at 0)
  for (int i = 0; i < data.size(); i++){
    int smallIndex = findSmallestIndex(i);
    int temp;
    
    temp = data.get(i);
    data.set(i,data.get(smallIndex));
    data.set(smallIndex,temp);
  }

}
    
public int linearSearch(int value){
  // Begin at -1 for the not found case
  int target = -1;

  for (int i = 0; i < data.size(); i++){
    if (data.get(i) == value){
      target = i;
    }
  }

  return target; // replace this return
}


// LEVEL 3 SOME  
public int binarySearch(int value){
// create assign variables  representing the high, low and middle indices 
  int lowIndex = 0;
  int highIndex = data.size()-1;
  int midIndex = data.size()/2;
  
// while we're not done:
//   if the item is at data.get(middle), return middle
//   otherwise, update high, low, and middle

  while ((lowIndex <= midIndex) && (midIndex <= highIndex)) {
    int midValue = data.get(midIndex);
    // Middle case
    if (midValue == value){
      return midIndex;
    // Upper case
    } else if (midValue < value){
      lowIndex = midIndex + 1;
      midIndex = (lowIndex + highIndex)/2;
    // Lower case
    } else {
      highIndex = midIndex - 1;
      midIndex = (highIndex + midIndex)/2;
    }
  }

  // Only gets here if value not found
  return -1;
  
}
    
// Level 4 EXTENSION
public int binarySearchRecursive(int value, int lowIndex, int highIndex){
  // Assume precon sorted, could continuously sort but that is a waste.
  int midIndex = (highIndex + lowIndex)/2;

  // Base case 1: midIndex < lowIndex || highIndex > midIndex
  if (midIndex < lowIndex || highIndex < midIndex){
    return -1;
  // Base case 2: midValue == value -> return midIndex
  } if (data.get(midIndex) == value){
    return midIndex;
  // Recursive case 1: value in upper bucket
  } else if (data.get(midIndex) < value){
    return binarySearchRecursive(value, midIndex + 1, highIndex);
  // Recursive case 2: value in lower bucket
  } else {
    return binarySearchRecursive(value, lowIndex, midIndex - 1);
  }

}