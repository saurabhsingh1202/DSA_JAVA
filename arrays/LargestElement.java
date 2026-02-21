import java.util.*;

public class LargestElement {

    public static void minmax(int [] arr){
        int minimum = Integer.MAX_VALUE ;
        int maximum = Integer.MIN_VALUE ; 

        for(int i =0 ; i <arr.length ; i++){
            if(arr[i]<minimum){
                minimum = arr[i];
            }
            if(arr[i]>maximum){
                maximum = arr[i];
            }
        }
        System.out.println("Minimum element is: " + minimum);
        System.out.println("Maximum element is: " + maximum);
        
    }

    public static void main(String[] args) {
        int [] arr = {3,5,7,2,8,6,1};
        minmax(arr);
    }
    
}
