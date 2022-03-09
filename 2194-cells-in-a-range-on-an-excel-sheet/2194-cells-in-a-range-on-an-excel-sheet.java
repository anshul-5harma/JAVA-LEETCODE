class Solution {
    public List<String> cellsInRange(String s) {
        char start = s.charAt(0);
        char end   = s.charAt(3);
        char start_number = s.charAt(1);
        char end_number   = s.charAt(4);
        List<String> list = new ArrayList();
        for(char ch = start; ch <= end; ch++) {
            for(char j = start_number; j <= end_number; j++) {
                String holder = "" + ch + j;
                list.add(holder);
            }
        }
        return list;
    }
}