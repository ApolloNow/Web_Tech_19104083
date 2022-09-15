public class Assignment1 {

    public static void main (String args[]){
        // 1) Write a Java program to print addition and subtraction of two integer numbers.
        int num1=30, num2=20;
        // Addition
        System.out.println(num1+num2);
        // Subtraction
        System.out.println(num1-num2);

        // 2) Write a Java program to print multiplication of two floating point numbers.
        float a = 0.6f;
        float b = 32.16f;
        System.out.println(a*b);

        // 3) Write a Java program to compute quotient and remainder and print it.
        int x=10, y=4;
        // Quotient
        System.out.println(x/y);
        // Remainder
        System.out.println(x%y);

        // 4) Write a Java program to swap the values of integer number with using temporary 
        //variable and without using temporary variable

        // Using temporary variable
        int n=10, m=20;
        int temp=m;
        System.out.println(n+" "+m);
        m=n;
        n=temp;
        System.out.println(n+" "+m);


        // Without using temporary variable - using xor operations
        System.out.println(n+" "+m);
        n=n^m;
        m=n^m;
        n=n^m;
        System.out.println(n+" "+m);



    }
    
}
