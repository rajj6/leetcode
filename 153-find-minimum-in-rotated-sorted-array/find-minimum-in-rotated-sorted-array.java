class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int left = 0, right = n - 1;
        int ans = nums[0];
        while (left <= right) {
            // if search space is already sorted nums[left] < nums[mid] < nums[right] the nums[lelf] will be smallest in that search space
            if (nums[left] <= nums[right]) {
                return Math.min(ans,nums[left]);
            }
            
            int mid = (left + right)/2;
            
            // Left side is sorted
            if (nums[left] <= nums[mid]) {
                ans = Math.min(ans, nums[left]);
                left = mid + 1;
            } else {
                // Right is sorted
                ans = Math.min(ans, nums[mid]);
                right = mid - 1;
            }
        }
        return ans;
    }
}