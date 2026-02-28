public class Selection {

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minindex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minindex]) {
                    minindex = j;
                }
            }

            // swap minimum with first unsorted element
            int temp = arr[minindex];
            arr[minindex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 7, 3, 1, 5, 9};
        selectionSort(arr);
        printArray(arr);
    }
}
