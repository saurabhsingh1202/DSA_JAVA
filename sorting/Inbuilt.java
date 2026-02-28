import java.util.Arrays;

public class Inbuilt {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 3};

        Arrays.sort(arr);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
