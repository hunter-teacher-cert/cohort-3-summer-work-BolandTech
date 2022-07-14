import java.util.*;

public class Triangle {

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;

//user input a,b,c values for triangle sides
        System.out.println("Enter the lengths of sides a,b,c:");
        a=sc.nextInt();                                        
        b=sc.nextInt();
        c=sc.nextInt();

//checking values and print error message
        if(a<=0 || b<=0 ||c<=0)  

        {
            System.out.println("ERROR:lengths should not be less than or equal to zero");
        }

//conditions for creating triangle
        else if(a<=b+c && b<=a+c && c<=a+b)       
        {
            System.out.println("You can form a triangle");
        }
        else
        {
            System.out.println("You cannot form a triangle");
        }
    }
}