class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        char[] ss = s.toCharArray();
        char[] ts = t.toCharArray();
        int i = 0;
        int[] hashS = new int[26];
        int[] hashT = new int[26];
        while (i < ss.length) {
            hashS[(int) ss[i] - 'a']++;
            hashT[(int) ts[i] - 'a']++;
            i++;
        }
        
        for(int j =0; j < 26; j++) {
            if(hashS[j] != hashT[j]) {
                return false;
            }
        }
        return true;
    }
}