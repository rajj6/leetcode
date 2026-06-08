class Solution {
    public boolean isPalindrome(String s) {
        // Step 1: Lowercase the entire string to normalize case variations
        char[] chars = s.toLowerCase().toCharArray();
        
        int i = 0;
        int j = chars.length - 1;
        
        // Step 2: Use two pointers meeting in the middle
        while (i < j) {
            // Skip non-alphanumeric characters from the left
            if (!Character.isLetterOrDigit(chars[i])) {
                i++;
                continue;
            }
            // Skip non-alphanumeric characters from the right
            if (!Character.isLetterOrDigit(chars[j])) {
                j--;
                continue;
            }
            
            // Compare the characters at both bounds
            if (chars[i] != chars[j]) {
                return false;
            }
            
            // Move both pointers inward
            i++;
            j--;
        }
        
        return true;
    }
}