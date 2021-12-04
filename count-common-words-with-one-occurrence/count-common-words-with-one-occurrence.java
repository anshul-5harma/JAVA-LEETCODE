class Solution {
    public int countWords(String[] words1, String[] words2) {
        Map<String, Integer> map1 = new HashMap();
        Map<String, Integer> map2 = new HashMap();
        for(int i = 0; i < words1.length; i++) {
            map1.put(words1[i], map1.getOrDefault(words1[i], 0) + 1);
        }
        for(int i = 0; i < words2.length; i++) {
            map2.put(words2[i], map2.getOrDefault(words2[i], 0) + 1);
        }
        Set<String> set1 = new HashSet();
        for (var entry : map1.entrySet()) {
            if(entry.getValue() == 1) {
                set1.add(entry.getKey());
            }
        }
        Set<String> set2 = new HashSet();
        for (var entry : map2.entrySet()) {
            if(entry.getValue() == 1) {
                set2.add(entry.getKey());
            }
        }
        set1.retainAll(set2);
        return set1.size();
    }
}