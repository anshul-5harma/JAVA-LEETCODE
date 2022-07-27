class Solution {
    public int rearrangeCharacters(String text, String target) {
        int[] frequency = new int[26];
        for(char ch : text.toCharArray()) {
            frequency[ch - 'a']++;
        }
        char[] balloon = target.toCharArray();
        int answer = 0;
        while(true) {
            boolean flag = true;
            for(int i = 0; i < balloon.length; i++) {
                if(frequency[balloon[i] - 'a'] == 0) {
                    flag = false;
                    break;
                } else {
                    frequency[balloon[i] - 'a']--;
                }
            }
            if(!flag) {
                break;
            } else {
                answer++;
            }
        }
        return answer;
    }
}