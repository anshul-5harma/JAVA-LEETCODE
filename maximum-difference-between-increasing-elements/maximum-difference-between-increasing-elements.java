class Solution {
    public int maximumDifference(int[] colors) {
        int max = -1;
        for(int i = 0; i < colors.length; i++) {
            for(int j = i + 1; j < colors.length; j++) {
                if(colors[i] != colors[j]) {
                    max = Math.max(max, colors[j] - colors[i]);
                }
            }
        }
        return max;
    }
}