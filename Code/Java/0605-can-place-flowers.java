class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int length = flowerbed.length;
        
        for (int i = 0; i < length; i++) {
            // Check if we can plant a flower here
            if (flowerbed[i] == 0 && 
                (i == 0 || flowerbed[i - 1] == 0) && 
                (i == length - 1 || flowerbed[i + 1] == 0)) {
                
                // Plant the flower
                flowerbed[i] = 1;
                n--;
                
                // If we've planted all required flowers, return true
                if (n == 0) return true;
            }
        }
        
        return n <= 0;
    }
}