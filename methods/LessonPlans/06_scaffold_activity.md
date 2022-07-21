# Scaffold Activity

## By: Taylor Grant-Knight & Latoya Boland

### Level 1 (ALL Students)

### Vocabulary:
*Index, Array, return, target, value, variable

#### Questions:
- What are we looking for in the array? Index or value?
- How will we keep track of the smallest index?

### Lesson Outline:
* Have students draw a diagram first / Sample array
* At least give method header and dummy return

### EXAMPLE: 

data = {3,5,7,2,4}, start = 2, return 3

public int findSmallestIndex(int start){
  
  // Create any variables you need here

  // Create a for loop
  
  // Look for the new smallest (in loop)

  return 0; // Change this
}


### Level 2 (MOST Students)

### Questions: 
- How can we use findSmallestIndex to help solve this problem?
- Could temporary variables be helpful? Why?

### Outline:
* Have students draw a diagram first / Sample array
* At least give method header and dummy return
* 
### EX: data = {3,5,7,2,4}, end result: data = {2,3,4,5,7}

public void sort(){

  // Create variables 

  // Create for loop

  // Swap smallest value to front

  
}

// EX: data = {3,5,7,2,4}, value = 7, return 2
// EX: data = {3,5,7,2,4}, value = 6, return -1

public int linearSearch(int value){

// Create for loop

  return 0; // Change this
}


### LEVEL 3 (SOME Students) 

### Questions: 
-When should the loop end?
-How do you compare your low/middle/high values against (target) value?
-When would this final return be triggered??

### Outline:
* Have students draw a diagram first / Sample array
* At least give method header and dummy return

// Pre-Condition: Assume sorted list
// EX: data = {2,3,5,7,7}, value = 3, return 1
// EX: data = {2,3,5,7,7}, value = 4, return -1
public int binarySearch(int value){

  //Create variables for low/middle/high index

  // Use a WHILE loop -- When should it end?

  // What happens if middleValue = value (target)? 
  
  // If middleValue < value (target)? 
  
  // If middleValue > value (target)?

  // When would this final return be triggered?
  return 0; // Change this
  
}

    
### Level 4 (EXTENSION)

// Pre-Condition: Assume sorted list
// EX: data = {2,3,5,7,7}, value = 3, return 1
// EX: data = {2,3,5,7,7}, value = 4, return -1

public int binarySearchRecursive(int value, int lowIndex, int highIndex){

  return 0; // Change this
}