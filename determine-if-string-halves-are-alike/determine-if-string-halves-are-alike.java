class Solution {
    public boolean halvesAreAlike(String s) {
        String first = (s.substring(0, s.length() / 2));
        String second = (s.substring(s.length() / 2));
        int counter = 0;
        for(int i = 0; i < first.length(); i++) {
            if(first.charAt(i) == 'a' || first.charAt(i) == 'e' || first.charAt(i) == 'i' || first.charAt(i) == 'o' || first.charAt(i) == 'u' || first.charAt(i) == 'A' || first.charAt(i) == 'E' || first.charAt(i) == 'I' || first.charAt(i) == 'O' || first.charAt(i) == 'U') {
                counter++;
            }
        }
        for(int i = 0; i < second.length(); i++) {
            if(second.charAt(i) == 'a' || second.charAt(i) == 'e' || second.charAt(i) == 'i' || second.charAt(i) == 'o' || second.charAt(i) == 'u' || second.charAt(i) == 'A' || second.charAt(i) == 'E' || second.charAt(i) == 'I' || second.charAt(i) == 'O' || second.charAt(i) == 'U') {
                counter--;
            }
        }
        return counter == 0;
    }
}