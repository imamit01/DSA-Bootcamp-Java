import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scan.nextInt();
        int temp = num;
        int mul =1;
        int sum = 0;
        while (temp > 0) {
            int last_digit = temp % 10;
            mul = last_digit * mul ;
            sum = last_digit + sum ;
            temp = temp /10 ;

        }
        int resul = mul - sum ;
        System.out.println("Result: "+ resul);

    }
}
