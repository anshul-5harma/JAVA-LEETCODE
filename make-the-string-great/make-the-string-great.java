class Solution {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack();
        for(int i = 0; i < s.length(); i++) {
            if(stack.isEmpty()) {
                stack.push(s.charAt(i));
            } else {
                if(Math.abs(stack.peek() - s.charAt(i)) == 32) {
                    stack.pop();
                } else {
                    stack.push(s.charAt(i));
                }
            }
        }
        String str = "";
        while(!stack.isEmpty()) {
            str = stack.pop() + str;
        }
        return str;
    }
}