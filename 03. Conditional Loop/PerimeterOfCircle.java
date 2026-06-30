import java.util.*;

public class PerimeterOfCircle {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle in cm : ");
        double radius = sc.nextDouble();
        double Perimeter =  2 * Math.PI * radius ;
        System.out.printf("Perimeter of Circle is: %.2f cm%n", Perimeter);
    }
}
