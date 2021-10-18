class Solution {
    public int[] countBits(int n) {
        return compute(n);
    }
    public static int[] compute(int n) {
        int[] to_return = new int[n+1];
        for(int i = 0; i <= n; i++) {
            to_return[i] = oneBits(i);
        }
        return to_return;
    }
    public static int oneBits(int i) {
        int counter = 0;
        String str = Integer.toBinaryString(i);
        for(char ch : str.toCharArray()) {
            if(ch == '1') counter++;
        }
        return counter;
    }
}