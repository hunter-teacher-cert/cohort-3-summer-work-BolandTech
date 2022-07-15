// Write a program that displays the entire lyrics of “99 Bottles of Beer”. Your program should include a recursive method that does the hard part, but you might want to write additional methods to separate other parts of the program. As you develop your code, test it with a small number of verses, like 3.


public class Beer {
    public static void main(String[] args) {

//Set start values
      int beerAmt = 10;
      String word = "bottles";

        while (beerAmt > 0) {

//modify word based on number beers
            if (beerAmt == 1) {
                word = "bottle"; 
            }

//Print statements
            System.out.println(beerAmt + " " + word + " of beer on the wall, " + beerAmt + " " + word + " of beer");
            beerAmt = beerAmt - 1;

            if (beerAmt > 0) {
                System.out.println("Take one down, pass it round " + beerAmt + " " + word + " of beer");
            }
        }

        if (beerAmt == 0) {

           //System.out.println("Take one down, pass it round " + beerAmt + " " + word + " of beer");
            System.out.println("No more bottles of beer on the wall");
        }

    }
}