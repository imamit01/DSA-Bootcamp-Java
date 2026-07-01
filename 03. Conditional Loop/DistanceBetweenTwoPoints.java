import java.util.*;

public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the point A :");
        int point_a = sc.nextInt();


        System.out.print("Enter the point B : ");
        int point_b = sc.nextInt();

            int distance = Math.abs(point_a - point_b) ;  // Distance should be +ve

        System.out.print("Distance Bw a and b is : "+ distance);
    }
}
