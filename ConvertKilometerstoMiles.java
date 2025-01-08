import java.util.*; 
import java.util.Scanner;

public class ConvertKilometerstoMiles{
     
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        double kilometers = sc.nextDouble();

        // Converting kilometers to miles using the formula
        double miles = kilometers * 0.621371;

        // Printing the result
        System.out.println(kilometers + " kilometers is equal to " + miles + " miles.");



         
    }
}