class Solution {
    public int minTimeToType(String word) {
        char current = 'a';
        int counter = 0;
        for(int i = 0; i < word.length(); i++) {
            int absolute = Math.min(Math.abs(word.charAt(i) - current), 26 - Math.abs(word.charAt(i) - current));
            counter += absolute + 1;
            current = word.charAt(i);
        }
        return counter;
    }
}