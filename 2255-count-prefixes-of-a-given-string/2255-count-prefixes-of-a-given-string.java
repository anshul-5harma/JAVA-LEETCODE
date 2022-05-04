class Solution {
    public int countPrefixes(String[] words, String s) {
        int to_return = 0;
        for(int i = 0; i < words.length; i++) {
            if(s.indexOf(words[i]) == 0) {
                to_return++;
            }
        }
        return to_return;
    }
}