class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (stack.isEmpty() || c == '(' || c == '{' || c == '[') {
                stack.push(c);
                continue;
            }
            
            if (c == ')' || c == '}' || c == ']') {
                char lob = stack.peek();
                char op = getOp(c);
                if (lob != op) return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    char getOp(char c) {
        if (c == ')') return '(';
        if (c == '}') return '{';
        if (c == ']') return '[';
        return 'a';
    }
}