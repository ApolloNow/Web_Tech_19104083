public class Q5 {
    public static void main (String args[]){
        int n=5;
        //Space variable indicates spacing between numbers while printing
        String space="   ";
        System.out.println("n^1"+" "+"n^2"+" "+"n^3"+" "+"n^4");
        for (int i=1; i<n+1; i++){
            System.out.println((int)Math.pow(i,1)+space+(int)Math.pow(i,2)+space+(int)Math.pow(i,3)+space+(int)Math.pow(i,4));
        }
    }
    
}
