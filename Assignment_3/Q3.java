import java.util.Arrays;

public class Q3 {
    public static void main(String args[]){
        String str = new String("mehul");
        //converting string to character array to use built in arrays sort function
        char charArray[] = str.toCharArray();
        Arrays.sort(charArray);
        String sortedStr = new String(charArray);
        System.out.println("Sorted string is: "+sortedStr);
    }
    
}
