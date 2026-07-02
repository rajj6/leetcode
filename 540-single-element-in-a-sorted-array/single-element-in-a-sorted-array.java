class Solution {
    public int singleNonDuplicate(int[] nums) {

        // Brute force:
        if (nums.length == 1) return nums[0];
         for(int i = 0; i < nums.length; i++) {
            if (i == 0) {
                if (nums[i] != nums[i+1]) return nums[i];
            } else if (i == nums.length - 1) {
                if (nums[i] != nums[i-1]) return nums[i];
            } else {
                if (nums[i] != nums[i+1] && nums[i] != nums[i-1]) return nums[i];
            }
        }
        // int left = 0, right = nums.length - 1;
        // while (left <= right) {
        //     int mid = (left + right)/2;
        //     if (left == right) {
        //         return nums[mid];
        //     } else if (nums[mid] == nums[mid-1]) {
        //         right =  mid - 2;
        //     } else if (nums[mid] == nums[mid + 1]) {
        //         left = mid + 2;
        //     } else {
        //         return nums[mid];
        //     }
        // }
        return -1;
    }
}