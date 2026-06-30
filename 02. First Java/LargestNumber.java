import java.util.*;
public class LargestNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :");
        int a = sc.nextInt();
        System.out.println("Enter second number :");
        int b = sc.nextInt();
        if (a>b){
            System.out.println(" First number is greater.");
        }
        else if (b>a) {
            System.out.println("Second number is greater.");
        }
        else {
            System.out.println("First and second are same.");
        }
    }
}
