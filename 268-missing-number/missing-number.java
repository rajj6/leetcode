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
        // try sorting in 1 loop then finding the next element
        // Arrays.sort(nums);
        // int i = 0;
        // if(nums[i] != 0) return 0;
        // while (i < nums.length-1) {
        //     if(nums[i]+1 != nums[i+1]) return nums[i] + 1;
        //     i++;
        // }
        // return nums[i]  + 1;

        // Maths sum of series 0 to n  = n * (n+1) / 2
        // int  sum = 0;
        // for (int i : nums) sum += i;
        // return (nums.length*(nums.length+1))/2 - sum;

        long sum = nums.length;
        // for (int i : nums) sum += i;
        // long nSum = 0;
        for (int i = 0; i < nums.length; i++) sum = sum + i - nums[i];
        return (int) (sum);
    }
}