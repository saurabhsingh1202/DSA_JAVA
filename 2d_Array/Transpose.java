public class Transpose {

    // Function for rectangular matrix (creates new matrix)
    public static int[][] MatrixTranspose(int[][] arr) {

        int rows = arr.length;
        int columns = arr[0].length;

        int[][] result = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[j][i] = arr[i][j];
            }
        }

        return result;
    }

    // Function for square matrix (in-place transpose)
    public static void transposeSquare(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {

                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    // Function to print matrix
    public static void printMatrix(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Rectangular matrix
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6}
        };

        // Square matrix
        int[][] arr2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Original Rectangular Matrix:");
        printMatrix(arr);

        System.out.println("\nOriginal Square Matrix:");
        printMatrix(arr2);

        // Transpose rectangular (new matrix)
        int[][] transposed = MatrixTranspose(arr);

        // Transpose square (in-place)
        transposeSquare(arr2);

        System.out.println("\nTranspose of Rectangular Matrix:");
        printMatrix(transposed);

        System.out.println("\nTranspose of Square Matrix:");
        printMatrix(arr2);
    }
}