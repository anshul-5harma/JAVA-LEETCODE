class Solution {
    public int percentageLetter(String s, char letter) {
        int counter = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == letter) counter++;
        }
        return counter == 0 ? 0 : compute(counter, s.length());
    }
    
    public static int compute(int counter, int length) {
        return (int) Math.floor(counter * 100 / length);
    }
}