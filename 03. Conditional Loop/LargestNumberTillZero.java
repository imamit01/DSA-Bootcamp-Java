import java.util.*;
public class LargestNumberTillZero {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        boolean num = true;
        int  Largest = 0;
        while (num){
            System.out.println("Enter the number  ");
            int n = sc.nextInt();
            if (n==0){
                System.out.println(" You enterd 0 so loop terminated \n"+
                        "Largest of all number till now :"+ Largest);
                num=false;
            }
            if (Largest<=n){
                Largest = n;
            }
        }

    }
}
