public class DiagonalSum {

    public static int diagonalSum(int[][] arr) {

        int n = arr.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {

            // Primary diagonal
            sum += arr[i][i];

            // Secondary diagonal
            sum += arr[i][n - 1 - i];
        }

        // If n is odd, subtract center element (double counted)
        if (n % 2 == 1) {
            sum -= arr[n / 2][n / 2];
        }

        return sum;
    }

    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int result = diagonalSum(arr);
        System.out.println("Diagonal Sum = " + result);
    }
}