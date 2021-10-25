class Solution {
    public int calPoints(String[] ops) {
        int running_total = 0;
        Stack<Integer> stack = new Stack<>();
        for (String op : ops) {
            if (op.equals("C")) {
                stack.pop();
            } else if (op.equals("D")) {
                int interim = stack.peek();
                interim *= 2;
                stack.push(interim);
            } else if (op.equals("+")) {
                int first = stack.pop();
                int second = stack.peek();
                int sum = first + second;
                stack.push(first);
                stack.push(sum);
            } else {
                stack.push(Integer.parseInt(op));
            }
        }
        for (Integer x : stack) {
            running_total += x;
        }
        return running_total;
    }
}