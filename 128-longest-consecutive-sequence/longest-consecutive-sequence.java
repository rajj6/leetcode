class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        int longest = 0;
        int curCount = 0;
        int currentNum;
        for (int cur :  set) {
            // check if it begniging of element
            if (!set.contains(cur - 1)) {
                currentNum = cur;
                curCount = 1;
                while (set.contains(++currentNum)) curCount++;
            }
            longest = Math.max(longest, curCount);
        }
        return longest;
    }
}