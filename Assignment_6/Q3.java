import java.util.*;
class Calculator {
    private int num1;
    private int num2;
    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public int addition() {
        int ans = num1+num2;
        System.out.println("Addition: " + ans);
        return ans;
    }
    public int subtraction() {
        int ans = num1-num2;
        System.out.println("Subtraction: " + ans);
        return ans;
    }
    public double division() {
        double ans = (double) num1/num2;
        System.out.println("Division: " +ans);
        return ans;
    }

    public int multiply() {
        int ans = num1*num2;
        System.out.println("Multiplication: " + ans);
        return ans;
    }
}

public class Q3{
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        try {
            System.out.print("Input the first number : ");
            num1 = Integer.parseInt(sc.nextLine());
            System.out.print("Input the second number : ");
            num2 = Integer.parseInt(sc.nextLine());
            Calculator obj1 = new Calculator(num1, num2);
            Calculator obj2 = new Calculator(num1, num2);
            Calculator obj3 = new Calculator(num1, num2);
            Calculator obj4 = new Calculator(num1, num2);
            obj1.addition();
            obj2.subtraction();
            obj3.multiply();
            obj4.division();
        }
        catch(NumberFormatException e) {
            System.out.println("Incorrect input format " + e);
        }
        sc.close();
    }
}
