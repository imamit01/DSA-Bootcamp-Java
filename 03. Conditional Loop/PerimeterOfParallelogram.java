import java.util.Scanner;

public class PerimeterOfParallelogram {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base of Parallelogram in cm : ");
        double base = sc.nextDouble();
        System.out.println("Enter the Side of Parallelogram in cm : ");
        double Side = sc.nextDouble();
        double Perimeter =  2 * ( base + Side);
        System.out.printf("Perimeter of Parallelogram is : %.2f  cm\n ", Perimeter);
    }
}
