import java.util.*;

public class Triangle {

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;

//User input a,b,c values for triangle sides
        System.out.println("Enter the lengths of sides a,b,c:");
        a=sc.nextInt();                                        
        b=sc.nextInt();
        c=sc.nextInt();

//Checking values and print statements
        if(a<=0 || b<=0 ||c<=0)  

        {
            System.out.println("ERROR: The side lengths cannot be less than or equal to zero");
        }

//Conditions for creating triangle
        else if(a<=b+c && b<=a+c && c<=a+b)       
        {
            System.out.println("These side lengths create a triangle!!!");
        }
        else
        {
            System.out.println("These side lengths cannot create a triangle!!!");
        }
    }
}