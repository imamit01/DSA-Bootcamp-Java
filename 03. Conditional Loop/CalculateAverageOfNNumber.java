import java.util.*;
public class CalculateAverageOfNNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how much number you want to put here :");
        int num_enter_by_user = sc.nextInt();
        int temp = num_enter_by_user;
        int sum = 0 ;
        while (num_enter_by_user > 0 ){
            System.out.print("Enter the number : ");
            int n = sc.nextInt();
            sum += n ;
            num_enter_by_user --;
        }
        System.out.println("Average of all the numbers are : "+ (sum/temp));



    }
}
