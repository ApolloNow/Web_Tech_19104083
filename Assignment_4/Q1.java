import java.util.*;

public class Q1{
    public static void main(String[] args) {
        //Write a java code to create user define size vector and store some values till user
        // wants or vector is not full and display vector elements.

        //User inputs vector size
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        Vector v = new Vector(size);

        //User inputs values
        for (int i=0; i<size; i++){
            v.addElement(sc.next());
        }

        sc.close();
        System.out.println("Displaying vector values");
        for (int i = 0; i < size; i++) {
            System.out.println(v.elementAt(i));            
        }
    }
}