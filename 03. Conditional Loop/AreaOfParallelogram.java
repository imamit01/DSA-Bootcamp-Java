import java.util.Scanner;

import java.util.*;
public class AreaOfParallelogram {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base of Parallelogram in cm : ");
        double b = sc.nextDouble();
        System.out.println("Enter the Height of Parallelogram in cm : ");
        double h = sc.nextDouble();
        double Area =  h * b ;
        System.out.printf("Area of Parallelogram is : %.2f  cm\u00B2\n ", Area);
    }
}
