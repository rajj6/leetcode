class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        
        while (i < j) {
            char head = s.charAt(i);
            char tail = s.charAt(j);
            
            // Skip non-alphanumeric characters from left
            if (!Character.isLetterOrDigit(head)) {
                i++;
            } 
            // Skip non-alphanumeric characters from right
            else if (!Character.isLetterOrDigit(tail)) {
                j--;
            } 
            // Characters are ready to be compared
            else {
                // Convert to lowercase on the fly during comparison
                if (Character.toLowerCase(head) != Character.toLowerCase(tail)) {
                    return false;
                }
                i++;
                j--;
            }
        }
        
        return true;
    }
}