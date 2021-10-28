class Solution {
    public String reversePrefix(String word, char ch) {
        int index = -1;
        for(int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == ch) {
                index = i;
                break;
            }
        }
        String sub = word.substring(0, index + 1);
        return compute(sub, word.substring(index + 1));
    }
    public static String compute(String first, String second) {
        String s = "";
        for(int i = 0; i < first.length(); i++) {
            s = first.charAt(i) + s;
        }
        return s + second;
    }
}