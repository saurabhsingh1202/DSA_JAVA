/*
Given an array of integers, rearrange the elements such that all even numbers appear on the left side of the array and all odd numbers appear on the right side of the array.

The relative order of elements does not matter.

The operation must be done in-place (without using any extra array).

The solution should be efficient in terms of time and space.
 */


import java.util.*;

public class EvenOddSeparation{

    public static void seprateEvenOdd(int[] arr){
        int left = 0;
        int right = arr.length -1;
        
        while (left < right) {

            // move left if even
            while(left < right && arr[left] % 2 == 0){
                left++;
            }

            // move right if odd
            while (left < right && arr[right] % 2 != 0) {
                right--;
            }

            // swap if wrong positions
            if(left < right){
                int temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;

                // ⭐ IMPORTANT
                left++;
                right--;
            }
        }
    }

    public static void printArray(int [] arr){
        for (int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i] + " ");   // print not println
        }
        System.out.println();
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Before:");
        printArray(arr);

        seprateEvenOdd(arr);

        System.out.println("After:");
        printArray(arr);
    }
}
