import java.util.*;
public class CurvedSurfaceAreaOfCylinder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of Cylinder Curved Surface");
        double radius = sc.nextDouble();
        System.out.println("Enter the height of Cylinder Curved Surface");
        double height = sc.nextDouble();
        double Curved_Surface_Area_of_Cylinder = 2 * Math.PI * radius * height;
        System.out.printf("Curved Surface Area of Cylinder : %.2f cm\u00B2%n", Curved_Surface_Area_of_Cylinder);



    }
}
