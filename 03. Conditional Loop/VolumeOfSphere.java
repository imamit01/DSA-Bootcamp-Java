import java.util.Scanner;

public class VolumeOfSphere {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius of Sphere in cm : ");
        double Radius = sc.nextDouble();
        double Volume = (4.0/3) * Math.PI * Math.pow(Radius,3);
        System.out.printf("Volume of Sphere is : %.2f  cm³\n ", Volume);
    }
}
