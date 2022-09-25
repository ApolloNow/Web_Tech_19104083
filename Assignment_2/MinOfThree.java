public class MinOfThree {
    public static void main (String args[]){
        // Three random numbers
        int num1=5, num2=10, num3=15;

        
        if (num1<num2){
            if (num1<num3){
                //If num1<num2 and num1<num3 then num1 is smallest
                System.out.println("Smallest number is "+num1);
            }
            else{
                //if num1<num2 and num3<num1 then num3 is smallest
                System.out.println("Smallest number is "+num3);
            }
        }
        else{
            if (num2<num3){
                //if num2<num1 and num2<num3 then num2 is smallest
                System.out.println("Smallest number is "+num2);
            }
            else{
                //if num2<num1 and num3<num2 then num3 is smallest
                System.out.println("Smallest number is "+num3);
            }

        }
    }
    
}
