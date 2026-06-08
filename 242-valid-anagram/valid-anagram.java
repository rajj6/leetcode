class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        // Convert both to primitive arrays upfront (One-time allocation)
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        
        int[] charCounts = new int[26];
        
        // Pure primitive array tracking—blazing fast loop execution
        for (int i = 0; i < sChars.length; i++) {
            charCounts[sChars[i] - 'a']++;
            charCounts[tChars[i] - 'a']--;
        }
        
        for (int count : charCounts) {
            if (count != 0) {
                return false;
            }
        }
        
        return true;
    }
}