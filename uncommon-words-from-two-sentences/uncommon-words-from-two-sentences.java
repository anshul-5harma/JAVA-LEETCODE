class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> map = new HashMap();
        String[] _s1 = s1.split(" ");
        String[] _s2 = s2.split(" ");
        for(int i = 0; i< _s1.length; i++) {
            map.put(_s1[i], map.getOrDefault(_s1[i], 0) + 1);
        }
        for(int i = 0; i< _s2.length; i++) {
            map.put(_s2[i], map.getOrDefault(_s2[i], 0) + 1);
        }
        List<String> list = new ArrayList();
        for (var entry : map.entrySet()) {
            if(entry.getValue() == 1) {
                list.add(entry.getKey());
            }
        }
        return list.toArray(new String[list.size()]);
    }
}