class Solution {
    public int countPoints(String rings) {
        Map<Integer, Set<Character>> map = new HashMap();
        for(int i = 1; i < rings.length(); i += 2) {
            if(map.containsKey(rings.charAt(i) - '0')) {
                Set<Character> set = map.get(rings.charAt(i) - '0');
                set.add(rings.charAt(i - 1));
                map.put(rings.charAt(i) - '0', set);
            } else {
                Set<Character> set = new HashSet();
                set.add(rings.charAt(i - 1));
                map.put(rings.charAt(i) - '0', set);
            }
        }
        int counter = 0;
        for(Set<Character> set : map.values()) {
            if(set.size() == 3) counter++;
        }
        return counter;
    }
}