import java.lang.classfile.instruction.SwitchCase;
import  java.util.*;
public class SimpleCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number :");
        int a = sc.nextInt();
        System.out.println("Enter your second number :");
        int b = sc.nextInt();
        System.out.println("Which operation you want to perform (+ , - , / , * :");
        String c = sc.next();
        switch (c){
            case "+":
                System.out.println("Addion :" +  (a+b));
                break;
            case "-":
                System.out.println("Substraction : " +(a-b));
                break;
            case "*":
                System.out.println("Substraction : "  + (a/b));
                break;
            case "/":
                System.out.println("Substraction : " +(a*b));
                break;

        }
    }
}
