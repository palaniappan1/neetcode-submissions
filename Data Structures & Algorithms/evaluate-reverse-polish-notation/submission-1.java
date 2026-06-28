class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        int result  = Integer.parseInt(tokens[0]);
        for(int i = 0; i < tokens.length ; i++){
            if(!isOperand(tokens[i])){
                stack.push(tokens[i]);
            }
            else{
                int number1 = Integer.parseInt(stack.pop());
                int number2 = Integer.parseInt(stack.pop());
                result = applyOperand(number1, number2, tokens[i]);
                stack.push(String.valueOf(result));
            }
        }
        return result;
    }

    public static int applyOperand(int num1, int num2, String operand){
        return switch (operand) {
            case "*" -> num2 * num1;
            case "+" -> num2 + num1;
            case "-" -> num2 - num1;
            default -> num2 / num1;
        };
    }

    public static boolean isOperand(String c){
        return (c.equals("*") || c.equals("+") || c.equals("-") || c.equals("/"));
    }
}
