class Solution {
    public boolean makeEqual(String[] words) {
        if(words.length < 2) {
            return true;
        }
        int[] frequency = new int[26];
        for(int i = 0; i < words.length; i++) {
            for(char c : words[i].toCharArray()) {
                frequency[c - 'a']++;
            }
        }
        for(int x : frequency) {
            if(x % words.length != 0) {
                return false;
            }
        }
        return true;
    }
}