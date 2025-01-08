import java.util.*; 
import java.util.Scanner;

public class CylinderVolume {
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);

        double radius = scanner.nextDouble();

        double height = scanner.nextDouble();

        double volume = Math.PI * Math.pow(radius, 2) * height;

        System.out.println("The volume of the cylinder is: " + volume);

        scanner.close();
    }
}