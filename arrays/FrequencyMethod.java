public class FrequencyMethod {

    public static void findDuplicates(int[] arr){
        int n = arr.length;

        int[] freq = new int[n+1];   // frequency array

        // count
        for(int i = 0; i < n; i++){
            freq[arr[i]]++;
        }

        System.out.print("Duplicates: ");

        boolean found = false;

        for(int i = 0; i < freq.length; i++){
            if(freq[i] > 1){
                System.out.print(i + " ");
                found = true;
            }
        }

        if(!found){
            System.out.print("None");
        }
    }

    public static void main(String[] args){
        int[] arr = {1, 2, 3, 2, 4, 5, 1, 3};
        findDuplicates(arr);
    }
}
