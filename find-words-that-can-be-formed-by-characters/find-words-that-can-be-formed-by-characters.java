class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] characters = new int[26];
        for(char ch : chars.toCharArray()) {
            characters[ch - 'a']++;
        }
        int sum = 0;
        for(String word : words) {
            int[] count = characters.clone();
            boolean flag = true;
            for(char ch : word.toCharArray()) {
                count[ch - 'a']--;
                if(count[ch - 'a'] < 0) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                sum += word.length();
            }
        }
        return sum;
    }
}