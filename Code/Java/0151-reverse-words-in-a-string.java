class Solution {
    public String reverseWords(String s) {
        // Step 1: Remove extra spaces and split words
        String[] words = s.trim().split("\\s+");

        // Step 2: Reverse the words
        List<String> wordList = Arrays.asList(words);
        Collections.reverse(wordList);

        // Step 3: Join words back into a single string
        return String.join(" ", wordList);
    }
}