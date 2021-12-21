class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> stack = new Stack();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != ')') {
                stack.push(s.charAt(i));
            } else {
                StringBuilder sb = new StringBuilder();
                while(stack.peek() != '(') {
                    sb.append(stack.pop());
                }
                stack.pop();
                for(char ch : sb.toString().toCharArray()) {
                    stack.push(ch);
                }
            }
        }
        String to_return = "";
        while(!stack.isEmpty()) {
            to_return = stack.pop() + to_return;
        }
        return to_return;
    }
}