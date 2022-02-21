class Solution {
    public int[] arrayRankTransform(int[] arr) {
        Map<Integer, Integer> map = new HashMap();
        int[] to_return = Arrays.copyOf(arr,arr.length);
        Arrays.sort(to_return); 
        int start = 1;
        for(int i = 0; i < arr.length; i++) {
            if(!map.containsKey(to_return[i])) {
                map.put(to_return[i], start++);
            }
        }
        for(int i = 0; i < to_return.length; i++) {
            to_return[i] = map.get(arr[i]);
        }
        return to_return;
    }
}