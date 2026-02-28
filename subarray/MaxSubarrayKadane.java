public class MaxSubarrayKadane {
    public static void main(String[] args) {

        int[] arr = {1, -2, 3, 4, 5, -6};

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int num : arr) {
            currSum += num;
            maxSum = Math.max(maxSum, currSum);

            if (currSum < 0) {
                currSum = 0;
            }
        }

        System.out.println("Maximum Subarray Sum: " + maxSum);
    }
}
