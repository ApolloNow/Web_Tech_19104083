public class Q1 {
    public static void main(String args[]){
        //Q1 - Write a java program to compare two strings lexicographically (without using library function).
        String str1 = "Hello World";
        String str2 = "Hello World";
        if (str1.length()!=str2.length()){
            System.out.println("Strings are not equal");
        }
        else{
            for (int i=0; i<str1.length();i++){
                if (str1.charAt(i) != str2.charAt(i)){
                    System.out.println("Strings are not equal");
                }
            }
            System.out.println("Strings are equal");
        }
        
    }
    
}
