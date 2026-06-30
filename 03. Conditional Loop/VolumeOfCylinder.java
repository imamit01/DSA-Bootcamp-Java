import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius of Cylinder in cm : ");
        double Radius = sc.nextDouble();
        System.out.println("Enter the Height of Cylinder in cm : ");
        double Height = sc.nextDouble();
        double Volume =  Math.PI * Math.pow(Radius,2)*Height;
        System.out.printf("Volume of Cylinder is : %.2f  cm³\n ", Volume);
    }
}
