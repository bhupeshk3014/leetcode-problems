class Solution {
    public String reverseVowels(String s) {
        // Convert string to character array
        char[] arr = s.toCharArray();
        int left = 0, right = arr.length - 1;
        
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 
                                                             'A', 'E', 'I', 'O', 'U'));

        while (left < right) {
            while (left < right && !vowels.contains(arr[left])) {
                left++;
            }
            
            while (left < right && !vowels.contains(arr[right])) {
                right--;
            }
            
            // Swap vowels
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            
            left++;
            right--;
        }
        
        // Convert array back to string
        return new String(arr);
    }
}