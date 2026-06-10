class Solution {
    // Ugly code but works
    // public int lengthOfLongestSubstring(String s) {
    //     int max = 0;
    //     Set<Character> seen = new HashSet<>();
    //     int i = 0;
    //     char[] chars = s.toCharArray();
    //     for (int j = 0; j < chars.length; j++) {
    //         char c = chars[j];
    //         if (j == 0) {
    //             seen.add(c);
    //         } else {
    //             if (seen.contains(c)) {
    //                 while (chars[i] != c) {
    //                     seen.remove(chars[i]);
    //                     i++;
    //                 }
    //                 i++;
    //             } else {
    //                 seen.add(c);
    //             }
    //         }
    //         max = Math.max(max, seen.size());
    //     }
    //     return max;
    // }

    public int lengthOfLongestSubstring(String s) {
        Set<Character> seen = new HashSet<>();
        int max = 0;
        char[] chars = s.toCharArray();
        int j = 0;
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            while (seen.contains(c)) {
                seen.remove(chars[j]);
                j++;
            }
            seen.add(c);
            max = Math.max(max, seen.size());
        }
        return max;
    }
}