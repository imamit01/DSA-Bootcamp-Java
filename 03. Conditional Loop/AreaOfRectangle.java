import java.util.Scanner;

import java.util.*;
public class AreaOfRectangle {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of Rectangle : ");
        double l = sc.nextDouble();
        System.out.println("Enter the Breadth of Rectangle : ");
        double b = sc.nextDouble();
        double Area =  l * b;
        System.out.printf("Area of Rectangle is : %.2f ", Area);
    }
}

