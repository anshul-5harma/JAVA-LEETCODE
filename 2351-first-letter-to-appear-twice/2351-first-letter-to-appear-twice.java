class Solution {
    public char repeatedCharacter(String s) {
        int[] holder = new int[26];
        for(char ch : s.toCharArray()) {
            if(++holder[ch - 'a'] == 2) return ch;
        }
        return 'a';
    }
}