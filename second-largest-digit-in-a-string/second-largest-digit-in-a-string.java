class Solution {
    public int secondHighest(String s) {
        Set<Character> set = new TreeSet();
        s = s.replaceAll("[^0-9]", "");
        for(int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }
        if(set.size() < 2) {
            return -1;
        }
        List<Character> list = new ArrayList<Character>(set);
        char second = list.get(list.size() -  2);
        return second - '0';
    }
}