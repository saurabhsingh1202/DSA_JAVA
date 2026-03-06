import java.util.Scanner;

public class LargestString {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of strings:");
        int n = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        String largest = arr[0];

        for(int i = 1; i < n; i++) {
            if(arr[i].compareTo(largest) > 0) {
                largest = arr[i];
            }
        }

        System.out.println("Largest String: " + largest);
    }
}
    

