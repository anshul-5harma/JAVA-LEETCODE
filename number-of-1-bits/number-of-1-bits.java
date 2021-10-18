public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        return oneBits(n);   
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