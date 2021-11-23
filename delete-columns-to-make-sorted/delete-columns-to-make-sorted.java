class Solution {
    public int minDeletionSize(String[] strs) {
        int word_length = strs[0].length() - 1;
        int counter = 0;
        while(word_length >= 0) {
            boolean flag = false;
            for(int i = 0; i < strs.length - 1; i++) {
                if(strs[i].charAt(word_length) <= strs[i + 1].charAt(word_length)) {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }
            if(flag == false) {
                counter++;
            }
            word_length--;
        }
        return counter;
    }
}