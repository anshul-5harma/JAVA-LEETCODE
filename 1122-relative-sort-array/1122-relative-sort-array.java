class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        List<Integer> list1 = new ArrayList();
        List<Integer> list2 = new ArrayList();
        for(int i = 0; i < arr2.length; i++) {
            list2.add(arr2[i]);
            for(int j = 0; j < arr1.length; j++) {
                if(arr1[j] == arr2[i]) {
                    list1.add(arr2[i]);
                }
            }
        }
        Arrays.sort(arr1);
        for(int i = 0; i < arr1.length; i++) {
            if(!list2.contains(arr1[i])) {
                list1.add(arr1[i]);
            }
        }
        int[] to_return = new int[list1.size()];
        for(int i = 0; i < to_return.length; i++) {
            to_return[i] = list1.get(i);
        }
        return to_return;
    }
}