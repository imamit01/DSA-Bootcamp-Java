import java.util.*;
public class CalculateDiscountOfProduct {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Welcome to Toakamisha Hotel ");
        System.out.print("Enter the total bill : ");
        double total_bill = sc.nextDouble();
        System.out.print("How much discount you want to apply on total bill \n "+
                "1. 5 % \n"+
                "2. 10% \n"+
                "3. 15% \n"+
                "4. 20% \n"+
                "5. 25%  : ");
        int discount = sc.nextInt();
        double bill_after_discount =0;
        switch (discount){

            case 1 :
                bill_after_discount = total_bill - (total_bill * (1/20));
                System.out.print("Bill after Discount is : "+ bill_after_discount);
                break;
            case 2 :
                bill_after_discount = total_bill - (total_bill * (1/10));
                System.out.print("Bill after Discount is : "+ bill_after_discount);
                break;
            case 3 :
                bill_after_discount = total_bill - (total_bill * (3.0/20));
                System.out.print("Bill after Discount is : "+ bill_after_discount);
                break;
            case 4 :
                bill_after_discount = total_bill - (total_bill * (1.0/5));
                System.out.print("Bill after Discount is : "+ bill_after_discount);
                break;
            case 5 :
                bill_after_discount = total_bill - (total_bill * (1.0/4));
                System.out.print("Bill after Discount is : "+ bill_after_discount);
                break;

        }

    }
}
