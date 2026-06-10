class Solution {

    // Using prefix and sufix approch
    // public int maxProduct(int[] nums) {
    //     int pref = 1, suf = 1, n = nums.length;
    //     int max = nums[0];
    //     for (int i = 0; i < n; i++) {
    //         if (pref == 0)  pref = 1;
    //         if (suf == 0)   suf = 1;

    //         pref    *= nums[i];
    //         suf     *= nums[n-i-1];
    //         max = Math.max(max, Math.max(pref, suf));

    //     }
    //     return max;
    // }


    // Using kadens approch
    public int maxProduct(int[] nums) {
        int globalMax = nums[0];
        int curMax = nums[0];
        int curMin = nums[0];
        int num,temp;
        for (int i = 1; i < nums.length; i++) {
            num = nums[i];
            if (num < 0) {
                temp = curMax;
                curMax = curMin;
                curMin = temp;
            }
            curMax = Math.max(curMax*num,num);
            curMin = Math.min(curMin*num, num);
            globalMax = Math.max(globalMax, curMax);
        }
        return globalMax;
    }

}