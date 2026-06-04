class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        String subS;
        for(int i = 0; i < s.length() ; i++) {
            for (int j = i + 1; j <=  s.length(); j++) {
                // System.out.println("For Sub i: " + i + " j: " + j);
                // Get Each Sub String
                // System.out.println(s.substring(i, j));
                subS = s.substring(i, j);
                if (j - i > 100) { i++ ; continue;}
                // For each sub string check if contains duplicate
                if (!containsDuplicate(s.substring(i, j))) {
                    max = Math.max(max, subS.length());
                }
            }
        }
        return max;
    }

    private boolean containsDuplicate(String s) {
        Set<Character> seen = new HashSet<>();
        for (char c : s.toCharArray()) {
            if(!seen.add(c)) {
                return true;
            }
        }
        return false;
    }
}