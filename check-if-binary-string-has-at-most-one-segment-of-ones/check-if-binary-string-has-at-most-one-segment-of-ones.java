class Solution {
    public boolean checkOnesSegment(String s) {
        List<Integer> list = new ArrayList();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '1') {
                list.add(i);
            }
        }
        if(list.size() > 1) {
            for(int i = 1; i < list.size(); i++) {
                if(list.get(i) - list.get(i - 1) != 1) {
                    return false;
                }
            }
        }
        return true;
    }
}