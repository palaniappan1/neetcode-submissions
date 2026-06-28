class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
    int length = s.length();
    for (int i = 0; i < length; i++) {
        char c = s.charAt(i);
        if (c == '[' || c == '{' || c == '(') {
            stack.push(c);
        } else {
            if (stack.isEmpty()) {
                return false;
            }
            char topOfStack = stack.pop();
            if ((c == ']' && topOfStack != '[') ||
                (c == '}' && topOfStack != '{') ||
                (c == ')' && topOfStack != '(')) {
                return false;
            }
        }
    }
    return stack.isEmpty();
    }
}
