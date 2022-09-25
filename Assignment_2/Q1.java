import java.util.*;
public class Q1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //Taking input score from user
        double score = sc.nextDouble();
        sc.close();
        if (score>=80 && score<=90){
            score += 5;
        }
        System.out.println("New Value of score is "+score);
    }
    
}
