import java.util.Scanner;

public class CalculateCompoundIntrest {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principal Value  : ");
        double initial_value = sc.nextDouble();
        System.out.println("Enter the  annual rate per interest : ");
        double rate = sc.nextDouble();
        System.out.println("Enter the Number of years : ");
        double year = sc.nextDouble();
        double  total_amount =  initial_value * Math.pow((1 + rate / 100.0), year);
        System.out.printf("Total amount is  : %.2f  Inr\n ", total_amount);
    }
}
