// PROVIDE line 2
// STUDENT-PROMPT:
// Looking at the method header, what do you think are the:
// - Input
// - Output
public int linearSearch(int value, ArrayList<Integer> data) {

    // STUDENT-PROMPT: (for after the code is all typed) 
    // Why does this start at -1? Could foundIndex = 0 work?
    int foundIndex = -1;

    // DELIBERATE-ERROR:
    // Change to int i = 1 OR i < data.size()-1
    for (int i=0; i < data.size(); i++) {

      int element = data.get(i);

      // BIG IDEA/BEEG REVEAL:
      if (element == value) {
        foundIndex = i;
        break;
        }
      }

    // STUDENT-PROMPT:
    // What would the output be if the value was NOT found?
    return foundIndex;
  }