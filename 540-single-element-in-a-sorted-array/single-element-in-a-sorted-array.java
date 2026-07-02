class Solution {
    public int singleNonDuplicate(int[] nums) {

        // Brute force:
        // if (nums.length == 1) return nums[0];
        //  for(int i = 0; i < nums.length; i++) {
        //     if (i == 0) {
        //         if (nums[i] != nums[i+1]) return nums[i];
        //     } else if (i == nums.length - 1) {
        //         if (nums[i] != nums[i-1]) return nums[i];
        //     } else {
        //         if (nums[i] != nums[i+1] && nums[i] != nums[i-1]) return nums[i];
        //     }
        // }
        if (nums.length == 1) return nums[0];
        if (nums[0] != nums[1]) return nums[0];
        int n = nums.length;
        if (nums[n - 1] != nums[n - 2]) return nums[n - 1];
        int left = 0, right = n - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if ( nums[mid + 1] != nums[mid] && nums[mid] != nums[mid - 1]) return nums[mid];
            if (mid % 2 == 1) {
                if (nums[mid] == nums[mid - 1]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            if (mid % 2 == 0) {
                if (nums[mid] == nums[mid + 1]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}