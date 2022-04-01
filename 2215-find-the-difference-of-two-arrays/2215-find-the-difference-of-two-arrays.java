class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet();
        Set<Integer> set2 = new HashSet();
        for(int n : nums1) { set1.add(n);}
        for(int n : nums2) { set2.add(n);}
        List<List<Integer>> list = new ArrayList();
        list.add(new ArrayList());
        list.add(new ArrayList());
        for(int n : set1) {
            if(!set2.contains(n)) {
                list.get(0).add(n);
            }
        }
        for(int n : set2) {
            if(!set1.contains(n)) {
                list.get(1).add(n);
            }
        }
        return list;
    }
}