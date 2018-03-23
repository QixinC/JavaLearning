public class Value_Method {
	
	public static boolean isDividable (int m, int n) {
		return m%n == 0;}
		
	public static boolean isTriangle (int a, int b, int c) {
		return !(a >= b+c || b >= a+c || c >= a+b);}
  
   	public static double Multadd (double x, double y, double z) {
		return x*y+z;}
	
	    public static double expSum (double x) {
		return Multadd(x, Math.exp(-x), Math.sqrt(1-Math.exp(-x)));}
		
		
    public static int oddSum(int n) {
      
  if (n%2 ==1){
      if ( n == 1){ 
         System.out.println(n);
         return n;
        } else {int sum = n + oddSum(n-2);
                System.out.println(n);
                return sum;}  
               }        
     else {return oddSum(n-1);}
      
    } 
	
	public static int ack(int m, int n) {
      
  if (m ==0){ 
  return n + 1;}
      else if ( m > 0 && n == 0){
        return ack(m-1, 1);
        } else if ( m > 0 && n > 0){
                 System.out.println(m +", "+n);
                return ack(m-1, ack(m, n-1));}  
                      
     else {return 233;}
      
    } 
      
		
	public static void main (String[] args) {
		System.out.println ("isDividable");
		System.out.println (isDividable(3, 2));
		
		System.out.println ("isTriangle");
		System.out.println (isTriangle(3,4,5));
      
      
  	     System.out.println ("Multadd");
		System.out.println (Multadd(Math.cos(Math.PI/4), (1.0/2.0), Math.sin(Math.PI/4)));
      System.out.println (Multadd(Math.log(10.0), 1, Math.log(20)));
	  System.out.println (expSum(2));
	     System.out.println(oddSum(8));
	
    }


}