class Solution {
    public int missingNumber(int[] nums) {
        // Brute force
        // For each number from 0 to 9 search the array if not found return
        for (int i = 0; i <= nums.length; i++) {
            boolean found = false;
            for (int j = 0; j < nums.length; j++) {
                if(nums[j] == i) {
                    found = true;
                    break;
                }
            }
            if (!found) return i;
        }
        return 0;
    }
}