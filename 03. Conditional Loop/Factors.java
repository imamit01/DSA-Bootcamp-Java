import java.util.*;
public class Factors {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int fact = 1;
        int num = n;
        while (n>0){
            fact *= n ;
            n--;

        }
        System.out.println("Factorial of "+ num + " is "+fact +" .");


    }

}
