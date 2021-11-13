class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        if(word2.length() > word1.length()) {
            String word2_first_part = word2.substring(0, word1.length());
            String word2_second_part = word2.substring(word1.length());
            for(int i = 0; i < word1.length(); i++) {
                sb.append(word1.charAt(i));
                sb.append(word2_first_part.charAt(i));
            }
            sb.append(word2_second_part);
        } else {
            String word1_first_part = word1.substring(0, word2.length());
            String word1_second_part = word1.substring(word2.length());
            for(int i = 0; i < word2.length(); i++) {
                sb.append(word1_first_part.charAt(i));
                sb.append(word2.charAt(i));
            }
            sb.append(word1_second_part);
        }
        return sb.toString();
    }
}