class Solution {
    public String truncateSentence(String s, int k) {
        String[] splits = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = 0;  i < k; i++) {
            sb.append(splits[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}