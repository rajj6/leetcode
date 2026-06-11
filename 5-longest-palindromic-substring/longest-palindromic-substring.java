class Solution {
    // Brute Force
    public String longestPalindrome(String s) {
        String pal = "";
        int n = s.length();
        int l,r;
        for (int i = 0; i < n; i++) {
            // Odd number
            l = i;
            r = i;
            
            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                if (pal.length() < r-l+1) {
                    pal = s.substring(l, r+1);
                }
                l--;
                r++;
            }

            // even number
            l = i;
            r = i+1;
            
            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                if (pal.length() < r-l+1) {
                    pal = s.substring(l, r+1);
                }
                l--;
                r++;
            }

        }
        return pal;
    }
}
