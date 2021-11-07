class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> map = new HashMap();
        for(int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        Set<Integer> set = new HashSet();
        for(var entry : map.entrySet()) {
            set.add(entry.getValue());
        }
        return set.size() == 1;
    }
}