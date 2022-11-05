import java.util.*;

class Number{
    private double num;

    Number(double num){
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
        //To get factorial, number should non negative integer
        int number = (int)num;
        double fact=1;
        for (int i=2; i<=number; i++){
            fact*=i;
        }
        return fact;
    }

    double getSqrt(){
        return Math.sqrt(num);
    }

    double getSqr(){
        return Math.pow(num, 2);

    }

    double sumDigits(){
        int number = (int)num;
        double sum=0;
        while (number>0){
            sum+=(number%10);
            number=number/10;
        }
        return sum;

    }

    double getReverse(){
        int number = (int)num;
        double reverse = 0;
        while (number>0){
            reverse = (reverse*10)+(number%10);
            number/=10;
        }
        return reverse;        
    }

    void listFactor(){
        for (int i = 0; i < num; i++) {
            if ((num%i)==0){
                System.out.print(i+" ");
            }
            
        }
        System.out.println();

    }

    void listBinary(){
        int number = (int)num;
        if (num==0){
            System.out.println("0");
            return;
        }
        StringBuilder binaryOutput = new StringBuilder();
        while (number>0){
            binaryOutput.insert(0, (number&1));
            number>>=1;
        }
        System.out.println(binaryOutput);

    }

}

public class Q3 {
    public static void main(String[] args) {
        Number n1 = new Number(152);
        System.out.println(n1.isZero());
        System.out.println(n1.isPrime());
        System.out.println(n1.isArmstrong());
        System.out.println(n1.getFactorial());
        System.out.println(n1.getSqrt());
        System.out.println(n1.getSqr());
        System.out.println(n1.sumDigits());
        System.out.println(n1.getReverse());
        n1.listFactor();   
        n1.listBinary();
    }
    
}
