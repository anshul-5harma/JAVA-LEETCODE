class Solution {
    public int minTimeToType(String word) {
        char current = 'a';
        int counter = 0;
        for(int i = 0; i < word.length(); i++) {
            int distance = Math.abs(word.charAt(i) - current);
            int absolute = Math.min(distance, 26 - distance);
            counter += absolute + 1;
            current = word.charAt(i);
        }
        return counter;
    }
}