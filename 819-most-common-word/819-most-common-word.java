class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String[] para_splits = paragraph.replaceAll("[^a-zA-Z0-9 ]", " ").toLowerCase().split("\\s+");
        Set<String> set = new HashSet();
        for(String str : banned) {
            set.add(str);
        }
        Map<String, Integer> map = new HashMap();
        for(int i = 0; i < para_splits.length; i++) {
            if(!set.contains(para_splits[i])) {
                map.put(para_splits[i], map.getOrDefault(para_splits[i], 0) + 1);
            }
        }
        int MAX = Integer.MIN_VALUE;
        String[] to_return = new String[1];
        for(var entry : map.entrySet()) {
            if(entry.getValue() > MAX && entry.getKey() != " ") {
                MAX = entry.getValue();
                to_return[0] = entry.getKey();
            }
        }
        return to_return[0];
    }
}