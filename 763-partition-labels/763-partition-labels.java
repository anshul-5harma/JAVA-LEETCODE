class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] holder = new int[26];
        List<Integer> list = new ArrayList();
        for(int i = 0; i < s.length(); i++) {
            holder[s.charAt(i) - 'a'] = i;
        }
        int start = 0;
        while(start < s.length()) {
            char word = s.charAt(start);
            int end = holder[word - 'a'];
            for(int j = start; j <= end; j++) {
                end = Math.max(end, holder[s.charAt(j) - 'a']);
            }
            list.add(end - start + 1);
            start = end + 1;
        }
        return list;
    }
}