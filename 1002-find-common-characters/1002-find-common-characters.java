class Solution {
    public List<String> commonChars(String[] words) {
        List<String> list = new ArrayList();
        int[] min_freq = new int[26];
        Arrays.fill(min_freq, Integer.MAX_VALUE);
        for(String current : words) {
            int[] char_freq = new int[26];
            for(int i = 0; i < current.length(); i++) {
                char_freq[current.charAt(i) - 'a']++;
            }
            for(int i = 0; i < 26; i++) {
                min_freq[i] = Math.min(min_freq[i], char_freq[i]);
            }
        }
        for(int i = 0; i < 26; i++) {
            while(min_freq[i] > 0) {
                list.add("" + (char)(i + 'a'));
                min_freq[i]--;
            }
        }
        return list;
    }
}