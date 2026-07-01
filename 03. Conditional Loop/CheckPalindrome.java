import java.util.*;

public class CheckPalindrome {

    public static int count(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number : ");
        int num = sc.nextInt();

        int temp = num;
        int palindrome = 0;

        while (num > 0) {

            int last_digit = num % 10;
            palindrome = (palindrome * 10) + last_digit;
            num = num / 10;

        }

        if (temp == palindrome) {
            System.out.println(temp + " is a Palindrome Number.");
        } else {
            System.out.println(temp + " is not a Palindrome Number.");
        }

    }
}