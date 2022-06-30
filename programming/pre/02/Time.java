class Time{
public static void main(String[] args){

//create variables named hour, minute, and second. Assign values that are roughly the current time. Use a 24-hour clock so that at 2pm the value of hour is 14.
//int hour = 2;
//int minute = 29;
//int second = 45; 
double minute = 59.0;
double hour = 2.0;
double sec = 25.0;

  
//Make the program calculate and display the number of seconds since midnight.
System.out.print("The number of minutes since midnight: ");
System.out.println(hour * 60 + minute);

  
//Calculate and display the number of seconds remaining in the day.
System.out.print("The number of seconds remaining in the day: ");
System.out.println(24 - hour * 60 +  60 - minute * 60);

  
//Calculate and display the percentage of the day that has passed. You might run into problems when computing percentages with integers, so consider using floating-point.
System.out.print("Fraction of the day that has passed: ");
System.out.println(hour / 60);

System.out.print("Percent of the hour that has passed: ");
System.out.println(hour/ 60 * 100);

  
//Change the values of hour, minute, and second to reflect the current time. Then write code to compute the elapsed time since you started working on this exercise.
System.out.print("The total number of elapsed minutes since starting is: ");
System.out.println(3 - hour * 60 + 60 - minute);


}
}

