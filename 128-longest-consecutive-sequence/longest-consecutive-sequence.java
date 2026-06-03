class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        // System.out.println(set);

        int longest = 0;
        int curCount = 0;
        for (int cur :  set) {
            // check if it begniging of element
            if (!set.contains(cur - 1)) {
                curCount = 1;
                while (set.contains(++cur)) curCount++;
            }
            longest = Math.max(longest, curCount);
        }
        return longest;
    }
}