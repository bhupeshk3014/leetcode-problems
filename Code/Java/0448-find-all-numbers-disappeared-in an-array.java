class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> output = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int orgVal = Math.abs(nums[i]);
            int index = orgVal - 1;
            if (nums[index] > 0)
                nums[index] *= -1;
        }

        for (int i = 0; i < nums.length; i++)
            if (nums[i] > 0)
                output.add(i + 1);

        return output;
    }
}