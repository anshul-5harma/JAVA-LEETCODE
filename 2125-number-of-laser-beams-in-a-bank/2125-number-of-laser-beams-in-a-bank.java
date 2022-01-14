class Solution {
    public int numberOfBeams(String[] banks) {
        int prev = 0;
        int answer = 0;
        for(String bank : banks) {
            int current = 0;
            for(int i = 0; i < bank.length(); i++) {
                if(bank.charAt(i) == '1') {
                    current++;
                }
            }
            if(current != 0) {
                answer += prev * current;
                prev = current;
            }
        }
        return answer;
    }
}