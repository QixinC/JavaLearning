import java.util.Random;
import java.util.Scanner;

/**
 * Exercise 3-4
 */

public class Guess_My_Number {

    public static void main(String[] arg){
    int guess, think, diff;
    Random rand = new Random();
    Scanner in = new Scanner(System.in);
        
     //Generate a random number
    System.out.println("I'm thinking of a number between 1 and 100\n(including both). Can you guess what it is?");
    think = rand.nextInt(100)+1;
    
    //Prompt user type a number
    System.out.print("Type a number: ");
    guess = in.nextInt();
    System.out.printf("Your guess is : %d\n", guess);
    
    //Get Difference and output
     System.out.printf("The number I was thinking is : %d\n", think);
     diff = think - guess;
    System.out.printf("You were off by : %d\n", diff);
    
    }




}




