class Solution {
    public int[] searchRange(int[] nums, int target) {
        // int[] res = new int[]{-1, -1};
        int i = -1, j = -1;
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right)/2;
            if (target == nums[mid]) {
                i = mid;
                j = mid;
                while (i > 0 && nums[i - 1] == target) i--;
                while (j < nums.length-1 && nums[j + 1] == target) j++;
                return new int[]{i, j};
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return new int[]{i, j};
    }
}