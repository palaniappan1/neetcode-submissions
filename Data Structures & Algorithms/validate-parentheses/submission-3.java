class Solution {
    public boolean isValid(String s) {
        List<Character> openingParanthese = new ArrayList<>(Arrays.asList('(', '{', '['));
        List<Character> closingParantheses = new ArrayList<>(Arrays.asList(')', '}', ']'));
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()) {
            if(openingParanthese.contains(ch)){
                stack.push(ch);
            }
            else {
                if(stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if(openingParanthese.indexOf(top) != closingParantheses.indexOf(ch)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
