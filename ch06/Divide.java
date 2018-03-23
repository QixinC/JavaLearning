public class Divide {
	
	public static boolean isDividable (int m, int n) {
		return m%n == 0;
		}
	public static boolean isTriangle (int a, int b, int c) {
		return !(a >= b+c || b >= a+c || c >= a+b);
		}
	public static void main (String[] args) {
		System.out.println ("isDividable");
		System.out.println (isDividable(3, 2));
		
			System.out.println ("isTriangle");
		System.out.println (isTriangle(3,4,5));
		
	}
	
}