import java.util.Scanner;

public class AreaOfRhombus {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base of Rhombus in cm : ");
        double b = sc.nextDouble();
        System.out.println("Enter the Height of Rhombus in cm : ");
        double h = sc.nextDouble();
        double Area =  (h * b) / 2 ;
        System.out.printf("Area of Rhombus is : %.2f  cm\u00B2\n ", Area);
    }
}
