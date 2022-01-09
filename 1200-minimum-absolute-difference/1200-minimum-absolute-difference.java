class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int difference = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length - 1; i++) {
            difference = Math.min(difference, arr[i+1] - arr[i]);
        }
        List<List<Integer>> list = new ArrayList();
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i+1] - arr[i] == difference) {
                list.add(Arrays.asList(arr[i], arr[i+1]));
            }
        }
        return list;
    }
}