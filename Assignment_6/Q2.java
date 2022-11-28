import java.util.*;

public class Q2 {
    public static void addition(int num1, int num2) {
        if(num1< 0|| num2 < 0) {
            throw new ArithmeticException("Negative numbers Exception. Please enter positive numbers only");
        }
        else {
            System.out.println(num1+num2);
        }
    }
    public static void subtraction(int num1, int num2) {
        if(num1 < 0 || num2< 0) {
            throw new ArithmeticException("Negative numbers Exception. Please enter positive numbers only");
        }
        else {
            System.out.println(num1-num2);
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int num1 = sc.nextInt();

        System.out.print("Input the second number : ");
        int num2 = sc.nextInt();
        sc.close();

        try {
            addition(num1, num2);
        }
        catch(ArithmeticException e) { 
            System.out.println(e);
        }


        try {
            subtraction(num1, num2);
        }
        catch(ArithmeticException e) {
            System.out.println(e);
        }
    }
}
