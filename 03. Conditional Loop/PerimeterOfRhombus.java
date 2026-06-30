import java.util.Scanner;

public class PerimeterOfRhombus {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base of Rhombus   in cm : ");
        double base = sc.nextDouble();
        double Perimeter =  4 * base;
        System.out.printf("Perimeter of Rhombus   is : %.2f  cm\n ", Perimeter);
    }
}
