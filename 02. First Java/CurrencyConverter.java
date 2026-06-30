import java.util.*;
public class CurrencyConverter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Inr :");
        int a = sc.nextInt();
        float usd = a / 98.6f;
        System.out.println("Conversion in usd is : "+usd);
    }
}
