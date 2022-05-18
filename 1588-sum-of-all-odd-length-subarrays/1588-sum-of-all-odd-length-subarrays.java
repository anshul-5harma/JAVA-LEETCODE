class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int to_return = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = i; j < arr.length; j += 2) {
                for(int k = i; k <= j; k++) {
                    to_return += arr[k];
                }
            }
        }
        return to_return;
    }
}