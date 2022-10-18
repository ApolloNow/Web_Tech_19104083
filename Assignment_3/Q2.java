public class Q2 {
    public static void main(String args[]){
        //count sort algorithm
        // Following is the input array that will be sorted through count sort algorithm
        //Range of array is 0 to 20
        int[] arr = {1,3,19,2,5,20,6,13,13,2,13,4,1};

        //Initializing count array from 0 to 20 having size 21. This will store frequency of each number in input array
        int[] count = new int[21];

        //Store the count of each element
        for (int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        //Find cummulative frequency
        for(int i = 1; i<=count.length-1; i++){
            count[i] += count[i-1];
        }
        
        //Output is sorted array
        int [] output = new int[arr.length];

        //This loop will find the index of each element of the original array in count array, and place the elements in output array
        for (int i = arr.length - 1; i >= 0; i--) {  
            output[count[arr[i]] - 1] = arr[i]; 
            // decrease count for same numbers 
            count[arr[i]]--;  
        }       
        
        //This is the unsorted array
        System.out.println("This is the unsorted array: ");
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        //Empty line
        System.out.println();

        //This is the unsorted array
        System.out.println("This is the sorted array: ");
        for (int i=0; i<output.length; i++){
            System.out.print(output[i]+" ");
        }



    }
    
}
