import java.util.*; 
import java.util.Scanner;

public class PowerCalculation {
     publis static int power(int base, int exponent){
         if (exponent ==0){
           return 1;
          }
         else{
           return base*power(base,exponent-1);
          }
 }

    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);
         int base=sc.nextInt();
          int exponent=sc.nextInt();
          
         int result = power(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);

         
    }
}
