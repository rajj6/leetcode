class Solution {
    public int findPeakElement(int[] nums) {
        // Brute force
        // for (int i = 0; i < nums.length; i++) {
        //     if ( (i == 0 || nums[i - 1] < nums[i]) && (i == nums.length - 1 || nums[i] > nums[i+1])) {
        //         return i;
        //     }
        // }
        int n = nums.length;
        // if (n == 1 || nums[0] > nums[1]) return 0;
        // if (nums[n-1] > nums[n-2]) return n-1;
        int left = 0, right = n - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if ((mid == 0 || nums[mid - 1] < nums[mid]) && (mid == n - 1 || nums[mid] > nums[mid + 1])) {
                return mid;
            } else if (mid == 0 || nums[mid - 1] < nums[mid]) {
                left = mid+1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}