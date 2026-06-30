import java.util.Scanner;

public class PerimeterOfEquilateralTriangle {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base of Equilateral Triangle in cm : ");
        double base = sc.nextDouble();
        double Perimeter =  3*base ;
        System.out.printf("Perimeter of Equilateral Triangle is : %.2f  cm\n ", Perimeter);
    }
}
