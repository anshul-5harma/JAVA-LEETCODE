class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList();
        for(int i = 0; i < candies.length; i++) {
            list.add(compute(candies, candies[i], extraCandies));
        }
        return list;
    }
    public static boolean compute(int[] arr, int element, int candies) {
        int added = element + candies;
        for(int i = 0; i < arr.length; i++) {
            added = Math.max(arr[i], added);
        }
        return added == (element + candies);
    }
}