// public class Methods { 
//     public static void main(String[] args) { 

//         // read in the command-line argument
//         double c = Double.parseDouble(args[0]);
//         double epsilon = 1.0e-15;  // relative error tolerance
//         double t = c;              // estimate of the square root of c

//         // repeatedly apply Newton update step until desired precision is achieved
//         while (Math.abs(t - c/t) > epsilon*t) {
//             t = (c/t + t) / 2.0;
//         }

//         // print out the estimate of the square root of c
//         System.out.println(t);
//     }

// }


//Exercise 6-2
public class Methods {
public static void main (String[] args) {
squareRoot (10.0);
// invokes squareRoot
}

public static void squareRoot (double n) {
double x0 = n / 2;
double xn = (x0 + n / x0) / 2;
// square root approximation of n
while ( Math.abs (x0 - xn) > (.0001) ) {
// while the absolute values of approximations have
// a difference greater than .0001, run the method
x0 = xn;
}
System.out.println ("The square root of " + n + " is " + xn);
// else, print the square root of n
    }



// Exercise 6-3
	public static double gauss(double x, int n) {
		double result = 1.0;
		double term = 1.0; 
		
		int i = 1;
		while (i <= n) {
			term = -1*term*x*x/i;
			result = result + term; 
			i = i + 1; 
		}
		
		return result;

  }
  }



//TEST CODE
// public class Methods { 
//     public static void main(String[] args) { 

//         // read in the command-line argument
//         double c = Double.parseDouble(args[0]);
//         double epsilon = 1.0e-15;  // relative error tolerance
//         double t = c;              // estimate of the square root of c

//         // repeatedly apply Newton update step until desired precision is achieved
//         while (Math.abs(t - c/t) > epsilon*t) {
//             t = (c/t + t) / 2.0;
//         }

//         // print out the estimate of the square root of c
//         System.out.println(t);
//     }

// }
