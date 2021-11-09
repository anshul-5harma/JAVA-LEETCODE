class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s_stack = new Stack();
        Stack<Character> t_stack = new Stack();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '#') {
                if(!s_stack.isEmpty()) {
                    s_stack.pop();
                }
            } else {
                s_stack.push(s.charAt(i));
            }
        }
        for(int i = 0; i < t.length(); i++) {
            if(t.charAt(i) == '#') {
                if(!t_stack.isEmpty()) {
                    t_stack.pop();
                }
            } else {
                t_stack.push(t.charAt(i));
            }
        }
        if(t_stack.size() != s_stack.size()) {
            return false;
        }
        while(!t_stack.isEmpty() && !s_stack.isEmpty()) {
            if(t_stack.pop() != s_stack.pop()) {
                return false;
            }
        }
        return true;
    }
}