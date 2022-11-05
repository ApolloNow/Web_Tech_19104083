import java.util.*;

class Number{
    private double num;

    Number(int num){
        this.num=num;
    }

    boolean isZero(){
        return (num==0);
    }

    boolean isPositive(){
        return (num>0);
    }

    boolean isNegative(){
        return (num<0);
    }

    boolean isOdd(){
        return ((num%2)!=0);
    }

    boolean isEven(){
        return ((num%2)==0);
    }

    boolean isPrime(){
        for (int i=2; i<num; i++){
            if ((num%i)==0){
                return false;
            }
        }
        return true;
    }

    boolean isArmstrong(){
        // temp variable will be used to store num without changing num's value
        // sum will be used to calculate total sum of all digits raised to the power of noOfDigits
        // noOfDigits will store how many digits are in the number
        //Converting num to integer as Armstrong number is only calculated for integer
        int number = (int)num;
        int sum=0, temp;
        int noOfDigits=0;
        temp=number;
        while (temp>0){
            temp/=10;
            noOfDigits++;
        }

        temp=number;

        while (temp>0){
            sum+=Math.pow(temp%10, noOfDigits);
            temp/=10;
        }

        if (number==sum){
            return true;
        }
        else{
            return false;
        }
    }

    double getFactorial(){

    }

    double getSqrt(){

    }

    double getSqr(){

    }

    double sumDigits(){

    }

    double getReverse(){
        
    }

    void listFactor(){
        for (int i = 0; i < num; i++) {
            if ((num%i)==0){
                System.out.print(i+" ");
            }
            
        }

    }

    void listBinary(){

    }

}

public class Q3 {
    public static void main(String[] args) {
        Number n1 = new Number(370);
        System.out.println(n1.isZero());
        System.out.println(n1.isPrime());
        System.out.println(n1.isArmstrong());
        n1.listFactor();   
        n1.listBinary();
    }
    
}
