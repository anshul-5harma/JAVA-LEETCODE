class Solution {
    public int prefixCount(String[] words, String pref) {
        int counter = 0;
        for(String word : words) {
            if(word.indexOf(pref) == 0) counter++;
        }
        return counter;
    }
}