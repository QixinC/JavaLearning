/**
*Exercise 3-3
*/

public class Convert_Seconds {
	
	public static void main(String[] arg) {
		int t = 5000;
		
		int s = t%3600%60;
		int m = t%3600/60;
		int h = 5000/3600;
		
	
		System.out.printf("%d seconds = %d hours, %d minuts, and %d seconds", t, h, m, s);
		
		
		
	}
	
	
}