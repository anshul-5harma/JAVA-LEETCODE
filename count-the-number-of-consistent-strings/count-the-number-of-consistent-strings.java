class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet();
        for(int i = 0; i < allowed.length(); i++) {
            set.add(allowed.charAt(i));
        }
        boolean flag = false;
        int counter = 0;
        for(String s : words) {
            for(int j = 0; j < s.length(); j++) {
                if(set.contains(s.charAt(j))) {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }
            if(flag) counter++;
        }
        return counter;
    }
}