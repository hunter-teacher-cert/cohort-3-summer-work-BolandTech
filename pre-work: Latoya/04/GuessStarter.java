import java.util.Random;
import java.util.Scanner;
public class GuessStarter {

  public static void Lower(int number,int number2) {
    Scanner in = new Scanner(System.in);
    System.out.print("Too Low , try again  ");
    number2 = in.nextInt();
    if (number2==number) {
      System.out.println("You're right");}
    else if (number2>number) 
      Higher(number,number2);
    else 
      Lower(number,number2); }

  public static void Higher(int number,int number2) {
    Scanner in = new Scanner(System.in);
    System.out.print("Too high , try again  ");
     number2 = in.nextInt();
    if (number2==number) {
      System.out.println("You're right");}
    else if (number2>number) 
      Higher(number,number2);
    else 
      Lower(number,number2); }

  public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      Random random = new Random();
      int number = random.nextInt(100) + 1;
      int number2;
      System.out.print("Type a number:  ");
      number2 = in.nextInt();
    if (number2==number) {
      System.out.println("You're right");}
    else if (number2>number) 
      Higher(number,number2);
    else 
      Lower(number,number2);}
}