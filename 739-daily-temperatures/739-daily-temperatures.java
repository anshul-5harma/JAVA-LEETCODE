class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] to_return = new int[temperatures.length];
        for(int i = 0; i < temperatures.length; i++) {
            boolean flag = false;
            for(int j = i + 1; j < temperatures.length; j++) {
                if(temperatures[i] < temperatures[j]) {
                    to_return[i] = j - i;
                    break;
                }
            }
        }
        return to_return;
    }
}