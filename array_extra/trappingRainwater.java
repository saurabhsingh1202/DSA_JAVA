package array_extra;

public class trappingRainwater {

    public static int trap(int[] height) {

        int n = height.length;
        if (n <= 2) {
            return 0;
        }

        int[] leftmost = new int[n];
        int[] rightmost = new int[n];

        // Left max array
        leftmost[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftmost[i] = Math.max(height[i], leftmost[i - 1]);
        }

        // Right max array
        rightmost[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightmost[i] = Math.max(height[i], rightmost[i + 1]);
        }

        // Calculate trapped water
        int watertrap = 0;
        for (int i = 0; i < n; i++) {
            watertrap += Math.min(leftmost[i], rightmost[i]) - height[i];
        }

        return watertrap;
    }

    public static void main(String[] args) {
        int[] height = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trap(height)); 
    }
}
