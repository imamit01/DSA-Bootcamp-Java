import java.util.*;
public class VolumeOfPyramid {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Pyramid :");
        double length = sc.nextDouble();
        System.out.println("Enter the height of Pyramid :");
        double height = sc.nextDouble();
        System.out.println("Enter the width of Pyramid :");
        double width = sc.nextDouble();
        double volume = (length * width * height) / 3.0;
        System.out.printf("Volume of Rectangular Pyramid is : %.2f  cm³\n ", volume);
    }

}
