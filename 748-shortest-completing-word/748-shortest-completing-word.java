class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        licensePlate = licensePlate.replaceAll("[^A-Za-z]", "").toLowerCase();
        System.out.println(licensePlate);
        int[] holder = new int[26];
        for(char ch : licensePlate.toCharArray()) {
            holder[ch - 'a']++;
        }
        String to_return = "";
        for(int x = 0; x < words.length; x++) {
            int[] current = new int[26];
            for(char ch : words[x].toCharArray()) {
                if(holder[ch - 'a'] != 0) {
                    current[ch - 'a']++;
                }
            }
            boolean flag = true;
            for(int i = 0; i < 26; i++) {
                if(current[i] < holder[i]) {
                    flag = false;
                    break;
                }
            }
            if(to_return.equals("") && flag == true) {
                to_return += words[x];
            }
            if(flag == true && words[x].length() < to_return.length()) {
                to_return = new String();
                to_return += words[x];
            }
        }
        return to_return;
    }
}