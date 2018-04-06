public class Myexp {
 public static void main(String[] args) {
 //System.out.println(table(5,2));
  //System.out.println(table_eff(5, 2));
//check (10, 1);
  check_more();
 }
 public static void check_more (){
     double x = -0.1;
     for(int i = 1; i<=4; i= i+1){
      check (100, x);
      x=x*10;
     }
 }
 
 
 public static void check (int n, double x){
 System.out.printf("%4.4f\t"+"%d\t"+"%.10f\t"+"%.10f\n", x, n, table_eff(n, x), Math.exp(x));    
 
 }
 
 
 public static double table(int i, double x) {
  double exp = 0;
  double add = 1.0;
  while (i>=0){
   add = Math.pow(x, i)/prod(i);
   exp+= add;
   //System.out.printf("%d "+"%.2f "+"%f ", i, add, exp );
  //System.out.println();
   i -= 1;
  }
  return exp;
 }
 
 public static double table_eff(int n, double x) {
  double exp = 0;
     int i = 0;
  double add = 1.0;
  while (i<=n){
   if (i==0){
    exp = 1.0;
  // System.out.printf("%d "+"%.2f "+"%f ", i, add, exp );
  // System.out.println();
    i=i+1;
    } else{
     //exp +=exp*x/i;
        //exp = exp + exp*x/i;
        add = add*x/i;
        exp+=add;
  // System.out.printf("%d "+"%.2f "+"%f ", i, add, exp );
  // System.out.println();
           i += 1;
    }
  
  }
  return exp;
 }
 
 public static int prod(int n) {
  if(n==0){
   return 1;
  }else {
   int recurse = prod(n-1);
   int result = n * recurse;
   return result;
  }
 }
}