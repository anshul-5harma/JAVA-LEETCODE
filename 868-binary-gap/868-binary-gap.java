class Solution {
    public int binaryGap(int n) {
        String binary = Integer.toBinaryString(n);
        int MAX = 0;
        for(int i = 0; i < binary.length(); i++) {
            for(int j = i + 1; j < binary.length(); j++) {
                if(binary.charAt(i) == '1' && binary.charAt(j) == '1') {
                    MAX = Math.max(MAX, j - i);
                    break;
                }
            }
        }
        return MAX;
    }
}