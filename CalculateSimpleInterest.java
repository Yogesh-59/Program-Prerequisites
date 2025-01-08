import java.util.*; 
import java.util.Scanner;

public class CalculateSimpleInterest {
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);
         int price=sc.nextInt();
          int rate=sc.nextInt();
           int time=sc.nextInt();
         int SimpleIntrest=(price*rate*time)/100;
         // find the simple intrest of given price, rate and time
          System.out.println("simple intrest is"+SimpleIntrest);
         
    }
}