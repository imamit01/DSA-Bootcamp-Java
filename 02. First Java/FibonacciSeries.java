public class FibonacciSeries {
    public static void main(String[] args){
        int n = 10;
        int zero = 0;
        int first = 1;
        int temp;
        for (int i=1;i<=n;i++){
            System.out.print(zero + " ");
            temp = zero + first ;
            zero = first;
            first = temp;
        }

    }
}
