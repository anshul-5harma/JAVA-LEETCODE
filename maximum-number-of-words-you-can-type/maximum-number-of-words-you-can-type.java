class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        Set<Character> set = new HashSet();
        for(char ch : brokenLetters.toCharArray()) {
            set.add(ch);
        }
        boolean flag = false;
        int counter = 0;
        String[] _text = text.split(" ");
        for(int i = 0 ; i < _text.length; i++) {
            for(char ch : _text[i].toCharArray()) {
                if(!set.contains(ch)) {
                    flag = true;
                } else {
                    flag= false;
                    break;
                }
            }
            if(flag) {
                counter++;
            }
        }
        return counter;
    }
}