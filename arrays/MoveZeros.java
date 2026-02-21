/*
Move all 0s to the end of the array
while keeping the order of non-zero elements same.
 */



import java.util.*;

public class MoveZeros {

    public static void moveZeros(int[] arr){
        int j = 0;  // position for non-zero elements

        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
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

        moveZeros(arr);

        printArray(arr);
        sc.close();
    }
}
