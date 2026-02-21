/*
Given an array of size n and an integer k, rotate the array to the right by k steps.

🧪 Example:
Input:
n = 5
arr = [1, 2, 3, 4, 5]
k = 2

Output:
[4, 5, 1, 2, 3] */



import java.util.*;

public class RotateArray {

    public static void reverse(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotateRight(int[] arr, int k){
        int n = arr.length;
        k = k % n;  // handle k > n

        // Step 1: reverse whole array
        reverse(arr, 0, n-1);

        // Step 2: reverse first k elements
        reverse(arr, 0, k-1);

        // Step 3: reverse remaining n-k elements
        reverse(arr, k, n-1);
    }

    public static void printArray(int[] arr){
        for(int x : arr){
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        rotateRight(arr, k);
        printArray(arr);

        sc.close();
    }
}
