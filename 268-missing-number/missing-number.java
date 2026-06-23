class Solution {
    public int missingNumber(int[] nums) {
        // Brute force:: For each number from 0 to 9 search the array if not found return
        /*
        for (int i = 0; i <= nums.length; i++) {
            boolean found = false;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == i) {
                    found = true;
                    break;
                }
            }
            if (!found) return i;
        }
        return 0;
        */
        // try sorting in 1 loop :: for index i if i != nums[i]
        Arrays.sort(nums);
        int i = 0;
        if(nums[i] != 0) return 0;
        while (i < nums.length-1) {
            if(nums[i]+1 != nums[i+1]) return nums[i] + 1;
            i++;
        }
        return nums[i]  + 1;
    }
}