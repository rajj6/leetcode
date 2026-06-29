class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        return new int[]{findFirst(nums, target), findLast(nums, target)};
        
    }

    int findFirst(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int res = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (target == nums[mid]) {
                res = mid;
                right = mid - 1;
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return res;
    }

    int findLast(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int res = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (target == nums[mid]) {
                res = mid;
                left = mid + 1;
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return res;
    }
}