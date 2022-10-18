import java.util.*;

public class Q4 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        
        //taking input from user a number
        int number = sc.nextInt();

        sc.close();

        while (number!=1){
            if ((number%2) == 0){
                number=number/2;
            }
            else{
                number = (number*3) + 1;
            }
            System.out.println("Currently the number is: "+number);
        }

    }
    
}
