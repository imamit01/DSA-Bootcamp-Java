import java.util.*;
public class CalculateElectricityBill {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the electricity in Unit :");
        double unit = sc.nextDouble();
        double bill = 0 ;
        if (unit<=100){
            bill = unit * 1.5 ;
            System.out.println("Electricity bill is :"+ bill + " Inr.");
        } else if (100 <= unit && unit<=200) {
            bill = unit * 5.5 ;
            System.out.println("Electricity bill is :"+ bill + " Inr.");
        }else {

            bill = unit * 7.5 ;
            System.out.println("Electricity bill is :"+ bill + " Inr.");
        }


    }
}
