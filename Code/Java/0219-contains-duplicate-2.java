class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        Map<Integer, Integer> numToIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (numToIndex.containsKey(nums[i])) {
                int prevIndex = numToIndex.get(nums[i]);
                if (i - prevIndex <= k) {
                    return true;
                }
            }
            numToIndex.put(nums[i], i);
        }

        return false;

    }
}