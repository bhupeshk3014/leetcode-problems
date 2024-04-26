class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] output = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 1; i <= nums.length; i++) {
            map.put(i, 1);
        }

        for (int a : nums) {
            map.put(a, map.get(a) - 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == -1) {
                output[0] = entry.getKey();
            }
            if (entry.getValue() == 1) {
                output[1] = entry.getKey();
            }
        }

        return output;
    }
}