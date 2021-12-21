class Solution {
    Set<String> set = new HashSet();
    public String makeFancyString(String s) {
        Stack<Character> stack = new Stack();
        char previous = ' ';
        for(int i = 0; i < s.length(); i++) {
            if(stack.isEmpty()) {
                stack.push(s.charAt(i));
            } else {
                if(stack.peek() == s.charAt(i) && previous == s.charAt(i)) {
                    stack.pop();
                    stack.push(s.charAt(i));
                } else {
                    previous = stack.peek();
                    stack.push(s.charAt(i));
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}