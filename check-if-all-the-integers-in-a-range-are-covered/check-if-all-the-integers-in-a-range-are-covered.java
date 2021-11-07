class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        Set<Integer> set = new HashSet();
        for(int[] num : ranges) {
            for(int i = num[0]; i <= num[1]; i++) {
                set.add(i);
            }
        }
        for(int i = left; i <= right; i++) {
            if(!set.contains(i)) {
                return false;
            }
        }
        return true;
    }
}