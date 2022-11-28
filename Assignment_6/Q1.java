import java.util.*;
public class Q1 {
    public static void multiply(int num1, int num2){
        if(num1==0||num2==0)
            throw new ArithmeticException("Multiplication with Zero exception");
        else {
            System.out.println(num1*num2);
        }
    }
    public static void divide(int num1, int num2){
        if(num1==0||num2==0)
            throw new ArithmeticException("Division by Zero Exception");
        else {
            System.out.println(num1/num2);
        }
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int x = sc.nextInt();
        System.out.print("Input the second number : ");
        int y = sc.nextInt();
        sc.close();

        try{
            multiply(x,y);
        }
        catch(ArithmeticException e) {
            System.out.println(e);
        }


        try {
            divide(x,y);
        }
        catch(ArithmeticException e) {
            System.out.println(e);
        }
        
        
    }
}
