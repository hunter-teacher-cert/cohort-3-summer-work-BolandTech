[Markdown CheatSheet](https://replit.com/talk/learn/A-Quick-Guide-to-Replit-Talk-Markdown/7448)

## Lesson objective: Writing Method with Returns to Create a Triangle

### Aim:SWBAT analyze the rules of triangles in order to create a method that determines if three sides make a triangle. 

### Prior Knowledge: Students have already learned :
* conditional logic (if/else)
* calling methods in main()
* using methods with returns
* writing void methods
* % operator

### Warm up
time:

---

### Mini-Lesson
* What is return?
* method syntax
* 


### Check for Understanding

Give students 4 methods.  
"Which ones work?"
"Explain why."

Code Prompt:
```
  /* Exercise 2  
Write a method named isDivisible that takes two integers, n and m, and that returns true if n is divisible by m, and false otherwise.
*/


    //METHOD 1
    public static boolean isDivisible(int n, int m){

      boolean b = false;
      
      if (n%m==0){
        b = true;
      } else {
        b = false;
      }

      return b;

    }

    //METHOD 2
    public static boolean isDivisible(int n, int m){
 
      if (n%m==0){
        return true;
      } else {
        return false;
      }

    }

    //METHOD 3
    public static boolean isDivisible(int n, int m){
      return n%m==0;
    }
    
```

Elicit discussion showing differences between 1-> 2-> 3 (and 4 is wrong) 


### Lesson Activity
time:

```
Code Prompt:
If you are given three sticks, you may or may not be able to arrange them in a triangle. For example, if one of the sticks is 12 inches long and the other two are one inch long, you will not be able to get the short sticks to meet in the middle. For any three lengths, there is a simple test to see if it is possible to form a triangle:

If any of the three lengths is greater than the sum of the other two, you cannot form a triangle.
Write a method named isTriangle that takes three integers as arguments and returns either true or false, depending on whether you can or cannot form a triangle from sticks with the given lengths. The point of this exercise is to use conditional statements to write a value method.

```


### Answer:return (x + y > z && y + z > x && x + z > y);


### Closing
time:

Can the following numbers make triangles?
(Required: Write code in your main() method to tell you the answer):
* 6, 2, 7
* 8, 1, 8
* 12, 9, 3

---

### Lesson Resources
https://replit.com/@Joel_AndrewAndr/cohort-3-summer-work-JABianchi#programming/pre/5/Methods.java