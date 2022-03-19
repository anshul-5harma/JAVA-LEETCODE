class Solution {
    public int countVowelSubstrings(String word) {
        int counter = 0;
        for(int i = 0; i < word.length() - 4; i++) {
            Set<Character> set = new HashSet();
            for(int j = i; j < word.length(); j++) {
                char ch = word.charAt(j);
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    set.add(ch);
                    if(set.size() == 5) {
                        counter++;
                    }
                } else {
                    break;
                }
            }
        }
        return counter;
    }
}