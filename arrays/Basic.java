import java.util.*;

public class Basic{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();          // size
        int [] arr = new int[n];      // array creation

        // taking input
        for(int i = 0; i < n; i++){
            System.out.print("Enter element " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }
        // displaying output
        System.out.println("Elements of arrays is :");
        for(int i =0; i<n; i++){
            System.out.print(arr[i]+ " ");
        }

        //update the array 

        arr[0]=100;

        System.out.println("\nElements of arrays after update is :");
        for(int i =0; i<n; i++){
            System.out.println(arr[i]+ " ");
        }

        //sum of array elements

        int sum=0;
         for(int i=0; i<n; i++){
            sum += arr[i];
         }
        System.out.println("sum of elemnet of array is  :" + sum );

    sc.close();
    }
}
