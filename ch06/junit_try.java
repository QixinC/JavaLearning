import junit.framework.TestCase;


public class Simple {
	
	public static int simpleCalc (int a) {
		
		return a+a;
	}
	
	public static void main(String[] args) {
		
		System.out.println(simpleCalc(1));
	}
	
	
	
	
}

public class SimpleTest extends TestCase {
	
	public void testsimplCalc{
		
		assertEquals(2, Simple.simpleCalc(1));
		
	}
	
	
	
	
	
	
}



	public class Recursive {

    public static void main(String[] args) {
        System.out.println(power(2, 4));
    }

    public static double power(double x, int n) {
       // if (n == 0) {
      //      return 1;
      //  } else {
      //      double recurse = power(x, n - 1);
     //       double result = recurse * Math.pow(x,  (double)n);
     //       return result;
     //   }
      
          if (n == 0) {
            return 1;
        } else {
            double recurse = power(x, n - 1);
            double result = Math.pow(Math.pow(x,  (double)(n/2)), 2.0);
            return result;
        }
      
      
      
      
    }

}