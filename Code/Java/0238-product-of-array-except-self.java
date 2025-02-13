class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        // Step 1: Compute prefix product and store in result[]
        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        // Step 2: Compute suffix product and update result[]
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= suffix; // Multiply with suffix product
            suffix *= nums[i];   // Update suffix product
        }

        return result;
    }
}