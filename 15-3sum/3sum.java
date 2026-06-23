class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
           // Optimization: If the lowest number is greater than 0, 
            // no three positive numbers can sum up to 0.
            if (nums[i] > 0) break;
            
            // Skip duplicate values for the first element to avoid duplicate triplets
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            // Step 2: Two-pointer scan for the remaining two elements
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    result.add(List.of(nums[i], nums[left], nums[right]));
                    
                    // Skip duplicates for the left pointer
                    while(left < right && nums[left] == nums[left + 1]) left++;

                    // Skip duplicates for the right pointer
                    while(left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                } else if (sum < 0) {
                    left++; // Sum is too low, move to a larger number
                } else {
                    right--; // Sum is too high, move to a smaller number
                }
            }
        }
        return result;
    }
}