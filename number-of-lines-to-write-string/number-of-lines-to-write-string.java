class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int sum = 0;
        int counter = 1;
        for(int i = 0; i < s.length(); i++) {
            int width = widths[s.charAt(i) - 'a'];
            sum += width;
            if(sum > 100) {
                counter++;
                sum = width;
            }
        }
        return new int[] {counter, sum};
    }
}