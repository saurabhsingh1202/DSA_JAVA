import java.util.*;

public class SecondLargest {

    public static int findSecondLargest(int[] arr){
        if(arr.length < 2){
            return -1; // not possible
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            int val = arr[i];

            if(val > largest){
                secondLargest = largest;
                largest = val;
            }
            else if(val < largest && val > secondLargest){
                secondLargest = val;
            }
        }

        if(secondLargest == Integer.MIN_VALUE){
            return -1;
        }

        return secondLargest;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int result = findSecondLargest(arr);

        if(result == -1){
            System.out.println("No second largest element");
        } else {
            System.out.println("Second largest = " + result);
        }

        sc.close();
    }
}
