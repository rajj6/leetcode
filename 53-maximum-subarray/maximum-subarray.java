class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int curSum = nums[0];
        int cur;
        for (int i = 1; i < nums.length; i++) {
            // cur = nums[i];
            // curSum += cur;
            // if (cur > curSum) {
            //     // EVEN AFTER ADDING THE CURRENT NUMBER IF SUM IS REDUSING THEN STAR A NEW SEQ
            //     curSum = cur;
            // }
            curSum = Math.max(nums[i], curSum + nums[i]);
            max = Math.max(max, curSum);
        }
        return max;
    }
}