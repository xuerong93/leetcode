public class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        //use array as a hashmap
        int maxLen = 0;
        int l = 0, r = 0, cnt = 0;                     // cnt is number of unique chars between l and r
        int[] chars = new int[128];                    // chars is hash map for each char's freq
        while (r < s.length()) {
            if (chars[s.charAt(r)] == 0) {             // adjust l position if next char is not in current char set
                cnt++;
                while (l <= r && cnt > k) {
                    chars[s.charAt(l)]--;
                    if (chars[s.charAt(l)] == 0) {     // break loop if left char is unique in hash map
                        cnt--;
                    }
                    l++;
                }
            }
            chars[s.charAt(r)]++;
            r++;
            maxLen = Math.max(maxLen, r - l);
        }
    
        return maxLen;
    }
}