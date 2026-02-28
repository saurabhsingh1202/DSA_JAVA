package subarray;

public class MaxSumSubarraySizeK {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6};
        int n = arr.length;
        int k = 3;

        int maxsum = Integer.MIN_VALUE;
        int minsum = Integer.MAX_VALUE;

        for (int i = 0; i <= n-k; i++) {   // ✅ fixed range
            int sum = 0;

            for (int j = i; j < i + k; j++) {
                sum += arr[j];
            }

            maxsum = Math.max(maxsum, sum);
            minsum = Math.min(minsum, sum); // ✅ fixed
        }

        System.out.println("Maximum sum of subarray of size " + k + " is: " + maxsum);
        System.out.println("Minimum sum of subarray of size " + k + " is: " + minsum);
    }
}
