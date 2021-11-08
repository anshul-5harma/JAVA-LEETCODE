class Solution {
    public int[] replaceElements(int[] arr) {
        int MAX = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                MAX = Math.max(MAX, arr[j]);
            }
            arr[i] = MAX;
            MAX = Integer.MIN_VALUE;
        }
        arr[arr.length - 1] = -1;
        return arr;
    }
}