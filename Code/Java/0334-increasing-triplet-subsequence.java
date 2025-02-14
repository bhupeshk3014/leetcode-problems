class Solution {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= first) {
                first = num; // Update smallest number
            } else if (num <= second) {
                second = num; // Update second smallest number
            } else {
                return true; // Found a third number greater than both
            }
        }

        return false;
    }
}