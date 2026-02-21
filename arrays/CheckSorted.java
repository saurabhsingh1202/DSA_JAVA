/*
Given an integer array, check whether the array is sorted in ascending order.

🧪 Example:
Input:
[1, 2, 3, 4, 5]

Output:
Sorted
 */
public class CheckSorted {

    public static boolean isSorted(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){   // ⭐ FIX HERE
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){

        int[] arr = {1,2,3,4,5,6,7,9,8};

        if (isSorted(arr)){
            System.out.println("sorted");
        }
        else{
            System.out.println("not sorted");
        }
    }
}
