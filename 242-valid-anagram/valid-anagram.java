class Solution {
    public boolean isAnagram(String s, String t) {
        // Step 1: If lengths don't match, they cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }
        
        // Step 2: Use a single bucket array to track relative character counts
        int[] charCounts = new int[26];
        
        // Step 3: Increment for string s, decrement for string t
        for (int i = 0; i < s.length(); i++) {
            charCounts[s.charAt(i) - 'a']++;
            charCounts[t.charAt(i) - 'a']--;
        }
        
        // Step 4: If any bucket is not zero, the frequencies did not balance out
        for (int count : charCounts) {
            if (count != 0) {
                return false;
            }
        }
        
        return true;
    }
}