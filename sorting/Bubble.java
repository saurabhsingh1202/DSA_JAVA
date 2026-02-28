public class Bubble {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int turn = 0; turn < n - 1; turn++) {
            boolean isSwap = false;

            for (int j = 0; j < n - turn - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwap = true;
                }
            }

            if (!isSwap) {
                break;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {7, 5, 1, 6, 2, 3};
        bubbleSort(arr);
        printArray(arr);
    }
}
