class Solution {
    public int[] executeInstructions(int n, int[] startPos, String s) {
        int[] answer = new int[s.length()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = compute(startPos[0], startPos[1], n, s, i, 0);
        }
        return answer;
    }
    
    public static int compute(int row, int column, int max_length, String str, int index, int counter) {
        if(index >= str.length()) return counter;
        if(str.charAt(index) == 'U') {
            if(row - 1 < 0) {
                return counter;
            }
            counter = compute(row - 1, column, max_length, str, index + 1, counter + 1);
        } else if(str.charAt(index) == 'D') {
            if(row + 1 >= max_length) {
                return counter;
            }
            counter = compute(row + 1, column, max_length, str, index + 1, counter + 1);
        } else if(str.charAt(index) == 'L') {
            if(column - 1 < 0) {
                return counter;
            }
            counter = compute(row, column - 1, max_length, str, index + 1, counter + 1);
        } else {
            if(column + 1 >= max_length) {
                return counter;
            }
            counter = compute(row, column + 1, max_length, str, index + 1, counter + 1);
        }
        return counter;
    }
}