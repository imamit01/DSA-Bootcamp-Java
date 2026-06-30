import  java.util.*;
public class PalindromeString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter pelindrome number to check :");
        int n = sc.nextInt();
        int rev = 0; ;
        int temp = n ;
        while(n>0){
            int last_digit = n%10;
            rev = (rev*10)+ last_digit;
            n = n/10;
        }
        if (temp==rev){
            System.out.println(rev+" is palindrome number");
        }
        else{
            System.out.println(rev+ " is not a palindrome number.");
        }

    }

}
