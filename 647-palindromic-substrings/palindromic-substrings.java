class Solution {
    public int countSubstrings(String s) {
        int count = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            // Count palindrom of odd length
            count += countP(s, i, i);
            // Count palindrom of even length
            count += countP(s, i, i + 1);
            // left = i;
            // right = i+1;
            // while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
            //     count++;
            //     left--;
            //     right++;
            // }
        }
        return count;
    }

    int countP(String s, int left, int right) {
        int count = 0;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            count++;
            left--;
            right++;
        }
        return count;
    }
}