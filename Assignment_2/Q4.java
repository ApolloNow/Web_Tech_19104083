public class Q4 {
    public static void main(String args[]){
        // Year variable represents the answer to the question - i.e after how many years population will first exceed 150000
        int year=0;
        int currentPopulation = 80000;
        while (currentPopulation<=150000){
            currentPopulation += (int)(currentPopulation*5/100);
            year++;
        }
        System.out.println("Population will first exceed 150,000 after "+year+" years");
    }
    
}
