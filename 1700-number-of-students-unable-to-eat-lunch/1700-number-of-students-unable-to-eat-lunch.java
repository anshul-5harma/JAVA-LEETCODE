class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q = new LinkedList<>();
        for(int student : students) {
            q.add(student);
        }
        Stack<Integer> stack = new Stack();
        for(int j = sandwiches.length - 1; j >= 0; j--) {
            stack.push(sandwiches[j]);
        }
        int counter = q.size() * q.size();
        while(counter-- > 0) {
            if(q.peek() == stack.peek()) {
                q.remove();
                if(q.size() == 0) {
                    return 0;
                }
                stack.pop();
            } else {
                int x = q.remove();
                q.add(x);
            }
        }
        return q.size();
    }
}