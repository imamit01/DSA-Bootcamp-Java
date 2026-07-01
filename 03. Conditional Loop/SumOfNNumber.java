import java.util.*;
public class SumOfNNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("How much number you want to enter : ");
        int num = sc.nextInt();
        double sum = 0.0;
        while (num >0){
            System.out.print("Enter the number : ");
            int entered_num_by_user = sc.nextInt();
            sum+=entered_num_by_user;
            num--;

        }
        System.out.println("Sum of total number is  : " + sum);
    }

}
