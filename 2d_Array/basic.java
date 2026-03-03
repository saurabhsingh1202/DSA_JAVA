import java.util.*;

public class basic{
    
    public static void print2DArray(int [][]arr){
        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int sumOf2DArray(int [][]arr){
        int sum = 0;
        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr[i].length; j++){
                sum+=arr[i][j];
            }
        }
        return sum;
    }
   public static void main(String[]args){
    int [][]arr1 = {{1,2,3},{4,5,6},{7,8,9}};
    int [][]arr2= new int[2][3];

    Scanner sc = new Scanner(System.in);

    for(int i=0; i<arr2.length;i++){
        for(int j=0; j<arr2[i].length; j++){
            arr2[i][j] = sc.nextInt();
        }
    }
    print2DArray(arr1);
    System.out.println();
    System.out.println(sumOf2DArray(arr1));
    System.out.println();
    print2DArray(arr2);
   System.out.println(sumOf2DArray(arr2));

   }

}