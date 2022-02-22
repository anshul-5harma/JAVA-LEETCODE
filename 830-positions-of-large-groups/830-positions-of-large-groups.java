class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> list = new ArrayList();
        int start = 0;
        for(int i = 0; i < s.length(); i++) {
            if(i == s.length() - 1 || s.charAt(i) != s.charAt(i + 1)) {
                if(i - start + 1 >= 3) {
                    list.add(Arrays.asList(new Integer[] {start, i}));
                }
                start = i + 1;
            }
        }
        return list;
    }
}