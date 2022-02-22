class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int alice = 0;
        int bob = 0;
        for(int i : aliceSizes) alice += i;
        for(int i : bobSizes) bob += i;
        int difference = (bob - alice) / 2;
        Set<Integer> set = new HashSet();
        for(int i : bobSizes) set.add(i);
        for(int i : aliceSizes) {
            if(set.contains(i + difference)) {
                return new int[] {i, i + difference};
            }
        }
        return null;
    }
}