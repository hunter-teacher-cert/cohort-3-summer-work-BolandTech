import java.util.*;

class Divisible {

//Define Function...if n is divisible by m it will return true, otherwise return false

public static boolean isDivisible(int n,int m){ 

if(n%m==0) 

return true;

else 

return false;

}

public static void main(String[] args) {

//Set n and m values to test 
System.out.println("n=105 m=15 : Divisible= "+isDivisible(105,15)); 

System.out.println("n=360 m=12 : Divisible="+isDivisible(360,12));

System.out.println("n=250 m=6 : Divisible="+isDivisible(250,6));

}

}