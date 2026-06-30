import java.util.*;
public class  AreaOfIsoscelesTriangle {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base of Isosceles Triangle  : ");
        double b = sc.nextDouble();
        System.out.println("Enter the Height of Isosceles Triangle : ");
        double h = sc.nextDouble();
        double Area =  0.5* h * b ;
        System.out.printf("Area of Isosceles Triangle is : %.2f ", Area);
    }

}
