import java.util.*;
public class AreaOfCircle {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle : ");
        double radius = sc.nextDouble();
        double AreaOfCircle = Math.PI * Math.sqrt(radius);
        System.out.printf("Area of circle is : %.2f ", AreaOfCircle);
    }
}
