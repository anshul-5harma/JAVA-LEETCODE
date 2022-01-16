class Solution {
    public String reverseWords(String s) {
        String str = s.replaceAll("\\s+", " ");
        String[] splits = str.split(" ");
        Stack<String> stack = new Stack();
        for(String split: splits) {
            stack.push(split);
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()) {
            sb.append(stack.pop());
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}