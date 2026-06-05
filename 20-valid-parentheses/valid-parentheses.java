class Solution {
    public boolean isValid(String s) {
        List<Character> stack = new LinkedList<>();

        for (char c : s.toCharArray()) {
            // System.out.println("for C: " + c);
            if (stack.isEmpty()) {
                stack.add(c);
                // System.out.println("stack: "  + stack);
                continue;
            }
            
            // if it is opening bracket then put in stack
            if (c == '(' || c == '{' || c == '[') {
                // System.out.println("Opening B: "  + c);
                stack.add(c);
                // System.out.println("stack: "  + stack);
                continue;
            }
            
            // if it is closing bracket 
            if (c == ')' || c == '}' || c == ']') {
                // System.out.println("Closing B: "  + c);
                // peek element of stack which is last open bracket
                char lob = stack.get(stack.size() - 1);
                // System.out.println("lob: "  + lob);
                char op = getOp(c);
                // System.out.println("op: "  + op);
                if (lob == op) {
                    // System.out.println("same hai");
                    stack.remove(stack.size() - 1);
                } else {
                    return false;
                }
                
                // System.out.println("stack: "  + stack);
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