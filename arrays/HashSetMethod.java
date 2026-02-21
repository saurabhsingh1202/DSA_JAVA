import java.util.*;

public class HashSetMethod {

    public static void findDuplicates(int[] arr){

        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for(int i = 0; i < arr.length; i++){
            if(seen.contains(arr[i])){
                duplicates.add(arr[i]);
            } else {
                seen.add(arr[i]);
            }
        }

        System.out.print("Duplicates: ");

        if(duplicates.isEmpty()){
            System.out.print("None");
        } else {
            for(int x : duplicates){
                System.out.print(x + " ");
            }
        }
    }

    public static void main(String[] args){
        int[] arr = {1, 2, 3, 2, 4, 5, 1, 3};
        findDuplicates(arr);
    }
}
