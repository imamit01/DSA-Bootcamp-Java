import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base of Rectangle in cm : ");
        double base = sc.nextDouble();
        System.out.println("Enter the Side of Rectangle in cm : ");
        double Side = sc.nextDouble();
        double Perimeter =  2 * ( base + Side);
        System.out.printf("Perimeter of Rectangle is : %.2f  cm\n ", Perimeter);
    }
}
