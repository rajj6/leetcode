class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int left = 0, right = n - 1;
        int res = nums[0];
        while (left <= right) {
            int mid = (left + right)/2;
            
            // Left side is sorted
            if (nums[left] <= nums[mid]) {
                res = Math.min(res, nums[left]);
                left = mid + 1;
            } else {
                // Right is sorted
                res = Math.min(res, nums[mid]);
                right = mid - 1;
            }
        }
        return res;
    }
}