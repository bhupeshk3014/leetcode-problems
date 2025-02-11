class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String subset = "";
        // Step 1: Check if concatenation order is the same
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        // Step 2: Find the GCD of the lengths of str1 and str2
        int gcdLength = gcd(str1.length(), str2.length());

        // Step 3: The GCD string is the prefix of str1 with length gcdLength
        subset = str1.substring(0, gcdLength);
        return subset;
                
    }
     // Helper function to compute the greatest common divisor (GCD)
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b); // Recursive Euclidean Algorithm
    }
}