import java.util.*;
public class ComputeNcrNpr {
    public static long factorial(long n){
        long fact=1;
        for(int i =1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total number of items 'n' : ");
        long input_num = scanner.nextInt();
        System.out.print("Enter the number of items to select/arrange 'r' ");
        long input_r = scanner.nextInt();
        if(input_r>=input_num || input_num == 0 || input_r==0){
            return;
        }
        else {
            long npr = factorial(input_num) / factorial(input_num-input_r);
            long ncr = factorial(input_num) / (factorial(input_r) * (factorial(input_num-input_r)));
            System.out.println("Npr"+npr);
            System.out.println("Npr"+ncr);

        }



    }

}
