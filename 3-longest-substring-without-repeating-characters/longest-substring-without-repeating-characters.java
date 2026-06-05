class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        Set<Character> seen = new HashSet<>();
        int i = 0;
        char[] chars = s.toCharArray();
        for (int j = 0; j < chars.length; j++) {
            char c = chars[j];
            if (j == 0) {
                seen.add(c);
            } else {
                if (seen.contains(c)) {
                    // part of i to j seq
                    while (chars[i] != c) {
                        seen.remove(chars[i]);
                        i++;
                    }
                    if (chars[i] == c) {
                        i++;
                        continue;
                    }
                    // seen.add(c);
                } else {
                    seen.add(c);
                }
            }
            max = Math.max(max, seen.size());
        }
        return max;
    }
}