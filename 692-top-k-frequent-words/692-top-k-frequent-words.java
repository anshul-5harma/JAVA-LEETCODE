class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new TreeMap();
        for(int i = 0; i < words.length; i++) {
            map.put(words[i], map.getOrDefault(words[i], 0) + 1);
        }
        List<String> list = new ArrayList();
        int max = 0;
        String holder = "";
        for(int i = 0; i < k; i++) {
            max = Collections.max(map.values());
            for(var entry : map.entrySet()) {
                if(entry.getValue() == max) {
                    holder = entry.getKey();
                    break;
                }
            }
            list.add(holder);
            map.remove(holder);
        }
        return list;
    }
}