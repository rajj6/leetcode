class Solution {
    public boolean isPalindrome(String s) {
        char[] chars = s.toLowerCase().toCharArray();
        int i = 0;
        int j = chars.length-1;
        char a,b;
        while (i < j) {
            a = chars[i];
            b = chars[j];
            if(!isAlphbet(a)) {
                i++;
                continue;
            }
            if(!isAlphbet(b)) {
                j--;
                continue;
            }
            if (getLowerChar(a) != getLowerChar(b)) return false;
            i++;
            j--;

        }
        return true;
    }

    boolean isAlphbet(char a) {
        if ( ('a' <= a && a <='z') || 'A' <= a && a <='Z' || ('0' <= a && a <= '9')) {
            return true;
        }
        return false;
    }

    char getLowerChar(char a) {
        if ('A' <= a && a <='Z') {
            return (char) (a - 32);
        }
        return a;
    }
}