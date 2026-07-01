import java.util.*;

public class CalculateAverageMarks {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subject : ");
        int num_subject = sc.nextInt();
        int temp=num_subject;
        float sum = 0.0f;
        while (num_subject>0){
            System.out.println("Enter the mark of each subject one after one  : ");
            float mark = sc.nextFloat();
            sum+=mark;
            num_subject--;
        }
        float avg = (sum /temp);
        System.out.println("Average of Marks  : "+avg );
    }
}
