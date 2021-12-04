class Solution {
    public int[] sumZero(int n) {
        if(n % 2 == 0) {
            int[] to_return = new int[n];
            int start = 0;
            int end = n - 1;
            while(start < end) {
                to_return[start] = n;
                to_return[end] = -n;
                start++;
                end--;
                n--;
            }
            return to_return;
        }
        int[] to_return = new int[n];
        to_return[0] = 0;
        int start = 1;
        int end = n -1;
        while(start < end) {
            to_return[start] = n;
                to_return[end] = -n;
                start++;
                end--;
                n--;
        }
        return to_return;
    }
}