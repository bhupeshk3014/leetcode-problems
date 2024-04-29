class Solution {
    public int searchInsert(int[] nums, int target) {
		if(nums == null || nums.length == 0) return 0;
		
		int n = nums.length;
		int s = 0;
		int e = n - 1;
		while(s < e){
			int m = s + (e - s)/2;
			
			if(nums[m] == target) return m;
			else if(nums[m] > target) e = m; 
			else s = m + 1; 
		}
		
		return nums[s] < target ? s + 1: s;
    }
}