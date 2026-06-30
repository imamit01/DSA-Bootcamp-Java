import java.util.Scanner;

public class VolumeOfCone {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius of cone in cm : ");
        double Radius = sc.nextDouble();
        System.out.println("Enter the Height of cone in cm : ");
        double Height = sc.nextDouble();
        double Volume =  (1.0/3)*Math.PI * Math.pow(Radius,2)*Height;
        System.out.printf("Perimeter of Volume of cone is : %.2f  cm³\n ", Volume);
    }
}
