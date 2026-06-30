import java.util.*;
public class SumUntilZero {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        boolean num = true;
        int sum = 0;
        while (num){
            System.out.println("Enter the number  ");
            int n = sc.nextInt();
            if (n==0){
                System.out.println(" You enterd 0 so loop terminated \n"+
                        "Summ of all number till now :"+ sum);
                num=false;
            }
            sum +=n;
        }

    }
}
