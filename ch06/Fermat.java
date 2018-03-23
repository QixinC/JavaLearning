public class Fermat {
	
	public static void main(String[] arg){
		
		checkFermat(4,4,5,2);

	}
	
	public static void checkFermat(int a, int b, int c, int n) {
		
      
      double p = (double) n;
      double x = Math.pow((double) a, (double) n);
      double y = Math.pow((double) b, (double) n);
      double z = Math.pow((double) c, (double) n);
    
      if(n > 2 && x+y == z){
    
			System.out.println ("Holy Smoke!");
      }else{
            System.out.println ("Not Working");
           }
	
}
  
}