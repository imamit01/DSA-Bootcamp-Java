import java.util.*;
public class ArmstrongNumbers {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Armstrong Number : ");
       int n = sc.nextInt();
       int temp = n ;
       int arm =0;
       while(n>0){
           int last_digit = (n%10);
           arm = arm + (last_digit*last_digit*last_digit);
           n=n/10;

       }
       if(temp==arm){
           System.out.println(arm+" is Armstrong NUmber.");
       }
       else {
           System.out.println(temp +" is not a Armstrong NUmber.");
       }
    }
}
