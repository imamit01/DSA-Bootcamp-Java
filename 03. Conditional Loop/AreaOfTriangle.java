import java.util.*;
public class AreaOfTriangle {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base of Triangle : ");
        double base = sc.nextDouble();
        System.out.println("Enter the Height of Triangle : ");
        double height = sc.nextDouble();
        double Area=.5 * base * height;
        System.out.printf("Area of Triangle is : %.2f ", Area);
    }
}
