import java.util.*;

class Calculator{
    int number=0;
    Calculator(String str){
        try{
            number=Integer.parseInt(str);
        } catch(NumberFormatException nfe){
            System.out.println("Number format exception has occured. Please input number in correct format.");
        }     
    }

    int addition(Calculator obj){
        try{
            return this.number+obj.number;
        } catch(NumberFormatException nfe){
            System.out.println("Number format exception has occured. Please input number in correct format.");
            return 0;
        }        
    }

    int subtraction(Calculator obj){
        try{
            return this.number-obj.number;
        } catch(NumberFormatException nfe){
            System.out.println("Number format exception has occured. Please input number in correct format.");
            return 0;
        }        
    }

    int multiplication(Calculator obj){
        try{
            return this.number*obj.number;
        } catch(NumberFormatException nfe){
            System.out.println("Number format exception has occured. Please input number in correct format.");
            return 0;
        }        
    }

    int division(Calculator obj){
        try{
            return this.number/obj.number;
        } catch(NumberFormatException nfe){
            System.out.println("Number format exception has occured. Please input number in correct format.");
            return 0;
        } catch(ArithmeticException ae){
            System.out.println("Divide by zero error");
            return 0;
        }        
    }


}


public class Q3 {
    public static void main(String[] args) {
        Calculator c1 = new Calculator("123");
        Calculator c2 = new Calculator(" 431");
        Calculator c3 = new Calculator("0");
        Calculator c4 = new Calculator(" ");

        System.out.println(c1.addition(c3));
        System.out.println(c1.subtraction(c2));
        System.out.println(c1.division(c4));
        
    }
    
}
