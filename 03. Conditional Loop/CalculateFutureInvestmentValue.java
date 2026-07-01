import java.util.*;
public class CalculateFutureInvestmentValue {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principal Amount : ");
        double principal = sc.nextDouble();
        System.out.println("Enter the Annual Interest Rate : ");
        double rate = sc.nextDouble();
        System.out.println("Enter the Time : ");
        double time = sc.nextDouble();
        double FutureValue = principal * Math.pow((1+(rate/100)),time);
        System.out.printf("Future Value : INR %.2f", FutureValue);


    }

}
