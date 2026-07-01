import java.util.*;
public class CalculateDepreciationofValue {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Initial Value  : ");
        double initial_value = sc.nextDouble();
        System.out.println("Enter the  Rate of Depreciation per year : ");
        double rate = sc.nextDouble();
        System.out.println("Enter the Number of years : ");
        double year = sc.nextDouble();
        double  DepreciatedValueafter_n_years =  initial_value * Math.pow((1 - rate / 100.0), year);
        System.out.printf("Total depreciation amount is  : %.2f  Inr\n ", DepreciatedValueafter_n_years);
    }
}
