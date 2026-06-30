import java.util.Scanner;
public class AreaOfEquilateralTriangle {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base of Equilateral Triangle in cm : ");
        double base = sc.nextDouble();
        double Area =  (Math.sqrt(3) / 4 ) * Math.pow(base, 2) ;
        System.out.printf("Area of Equilateral Triangle is : %.2f  cm\u00B2\n ", Area);
    }
}
