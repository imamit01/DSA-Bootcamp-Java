import java.util.*;

public class CalculateCGPA {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Total grade point : ");
        double grade = sc.nextDouble();
        System.out.println("Enter the Total grade hour : ");
        double hour = sc.nextDouble();
        double  gpa = grade/hour;
        System.out.printf("Grade Point Average is  : %.2f  gpa\n ", gpa);
    }
}
