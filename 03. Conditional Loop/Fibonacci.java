public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        int zero = 0;
        int first = 1;
        int temp ;
        while (n>0){
            System.out.print(zero + " ");
            temp = first +  zero;
            zero = first;
            first = temp;
            n--;
        }
    }
}
