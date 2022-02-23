class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int counter = 0;
        List<Integer> list = new ArrayList();
        if(s1.length() != s2.length()) return false;
        for(int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i) != s2.charAt(i)) {
                counter++;
                list.add(i);
            }
        }
        if(counter > 2) return false;
        return counter == 0 || (counter == 2 && s1.charAt(list.get(0)) == s2.charAt(list.get(1)) && s1.charAt(list.get(1)) == s2.charAt(list.get(0)));
    }
}