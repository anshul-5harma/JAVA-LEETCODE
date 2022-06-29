class Solution {
    public String greatestLetter(String s) {
        Set<Character> set = new HashSet<>();
        for(char i: s.toCharArray()) set.add(i);
        for(char ch = 'Z'; ch >= 'A'; ch--)
            if(set.contains(ch) && set.contains(Character.toLowerCase(ch)))
                return ""+ch;
        return "";
    }
}