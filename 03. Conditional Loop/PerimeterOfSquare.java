import java.util.Scanner;

public class PerimeterOfSquare {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base of Square  in cm : ");
        double base = sc.nextDouble();
        double Perimeter =  4 * base;
        System.out.printf("Perimeter of Square  is : %.2f  cm\n ", Perimeter);
    }
}
