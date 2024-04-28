class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        
       int count=0;

       for(char c : stones.toCharArray()){
           if(jewels.indexOf(c) != -1){
               count++;
           }
       }

       return count;
    }
}

// Using Hashset

// class Solution {
//     public int numJewelsInStones(String jewels, String stones) {

//         int count = 0;
//         HashSet<Character> hashset = new HashSet<Character>();

//         for(int i=0;i<jewels.length();i++){
//             hashset.add(jewels.charAt(i));
//         }

//         for(int i=0;i<stones.length();i++){
//             if(hashset.contains(stones.charAt(i))){
//                 count++;
//             }
//         }

//         return count;

//     }
// }