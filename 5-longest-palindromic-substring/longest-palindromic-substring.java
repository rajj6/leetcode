class Solution {
    // Brute Force
    public String longestPalindrome(String s) {
        String pal = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String sub = s.substring(i, j);
                // System.out.println(sub);
                if (pal.length() < sub.length() && isPalindrom(sub))  {
                    pal = sub;
                    // System.out.println("Is Pal: " + sub);
                } else {
                    // System.out.println("Is not Pal: " + sub);
                }
            }
        }
        return pal;
    }

    boolean isPalindrom(String s) {
        int i = 0; int j = s.length() - 1;
        while (i < j) {
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
