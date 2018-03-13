import java.util.Scanner;


/**

*Exercise 3-2

*/
 
public class Temp_C_to_F {
 
 public static void main(String[] arg) {
  double C, F;
  Scanner in = new Scanner(System.in);
  
  //promt the user to enter value
  System.out.print("Please enter the Celsius:");
  C = in.nextDouble();    
  F = C*(9.0/5) + 32;
 
  System.out.printf("%.1f C = %.1f F\n", C, F);
