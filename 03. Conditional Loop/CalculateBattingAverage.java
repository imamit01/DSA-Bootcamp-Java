import java.util.*;

public class CalculateBattingAverage {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Total run score  : ");
        double score = sc.nextDouble();
        System.out.println("Enter the Total time Dismissed : ");
        double dismissed = sc.nextDouble();
        double  Batting_average = score/dismissed;
        System.out.printf("Batting average  : %.2f  Inr\n ", Batting_average);
    }
}
