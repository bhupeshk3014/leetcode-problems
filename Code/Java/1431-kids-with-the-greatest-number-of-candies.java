class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        
        // Step 1: Find the max candies any kid has
        int maxCandies = 0;
        for (int candy : candies) {
            maxCandies = Math.max(maxCandies, candy);
        }
        
        // Step 2: Check each kid
        for (int candy : candies) {
            result.add(candy + extraCandies >= maxCandies);
        }
        
        return result;
    }
}