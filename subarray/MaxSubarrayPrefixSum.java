public class MaxSubarrayPrefixSum {
    public static void main(String[] args) {

        int[] arr = {1, -2, 3, 4, 5, -6};
        int n = arr.length;

        int[] prefix = new int[n];
        prefix[0] = arr[0];

        // Step 1: Build prefix sum array
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        int maxSum = prefix[0];
        int minPrefix = 0;

        // Step 2: Find maximum subarray sum
        for (int i = 0; i < n; i++) {
            maxSum = Math.max(maxSum, prefix[i] - minPrefix);
            minPrefix = Math.min(minPrefix, prefix[i]);
        }

        System.out.println("Maximum Subarray Sum: " + maxSum);
    }
}
