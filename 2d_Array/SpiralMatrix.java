import java.util.ArrayList;

public class SpiralMatrix {

    public static ArrayList<Integer> spiralOrder(int[][] arr) {

        ArrayList<Integer> result = new ArrayList<>();

        int rows = arr.length;
        int colms = arr[0].length;

        int top = 0;
        int left = 0;
        int bottom = rows - 1;
        int right = colms - 1;

        while (top <= bottom && left <= right) {

            // 1️⃣ Left -> Right
            for (int i = left; i <= right; i++) {
                result.add(arr[top][i]);
            }
            top++;

            // 2️⃣ Top -> Bottom
            for (int i = top; i <= bottom; i++) {
                result.add(arr[i][right]);
            }
            right--;

            // 3️⃣ Right -> Left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(arr[bottom][i]);
                }
                bottom--;   // ✅ CORRECT
            }

            // 4️⃣ Bottom -> Top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(arr[i][left]);
                }
                left++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        ArrayList<Integer> spiral = spiralOrder(arr);

        System.out.println("Spiral Order:");
        for (int num : spiral) {
            System.out.print(num + " ");
        }
    }
}
