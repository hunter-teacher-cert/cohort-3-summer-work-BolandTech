class Date{
public static void main(String[] args){

//Display (print out) the value of each variable on a line by itself. This is an intermediate step that is useful for checking that everything is working so far. Compile and run your program before moving on.
String day = "Wednesday";
int date = 18;
String month = "February";
int year = 2022;

//Display (print out) the value of each variable on a line by itself. This is an intermediate step that is useful for checking that everything is working so far. Compile and run your program before moving on.
System.out.println("The current date is ");
System.out.println(day);
System.out.println(month);
System.out.println(date);
System.out.println(year);
System.out.println(".");


//Modify the program so that it displays the date in standard American format, for example: Thursday, July 16, 2015.
System.out.println("The current date is " +day+ " , " +month+ " , " +date+ " , "+year);

//Modify the program so it also displays the date in European format: Thursday 16 July 2015
System.out.println("The current date is " +day+ " " +date+ " " +month+ " "+year);

}
  
}