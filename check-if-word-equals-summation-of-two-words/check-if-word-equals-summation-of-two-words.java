class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        String firstSum = "";
        String secondSum = "";
        String targetSum = "";
        for(int i = 0; i < firstWord.length(); i++) {
            firstSum += firstWord.charAt(i) - 'a';
        }
        for(int i = 0; i < secondWord.length(); i++) {
            secondSum += secondWord.charAt(i) - 'a';
        }
        for(int i = 0; i < targetWord.length(); i++) {
            targetSum += targetWord.charAt(i) - 'a';
        }
        return Integer.valueOf(firstSum) + Integer.valueOf(secondSum) == Integer.valueOf(targetSum);
    }
}