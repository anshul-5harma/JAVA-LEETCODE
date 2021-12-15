class Solution {
    public String[] findWords(String[] words) {
        List<String> list = new ArrayList();
        for(String word : words) {
            if(compute("qwertyuiop", word.toLowerCase()) || compute("asdfghjkl", word.toLowerCase()) || compute("zxcvbnm", word.toLowerCase())) {
                list.add(word);
            }
        }
        String[] to_return = new String[list.size()];
        for(int i = 0; i < list.size(); i++) {
            to_return[i] = list.get(i);
        }
        return to_return;
    }
    public static boolean compute(String row, String word) {
        for(char c : word.toCharArray()) {
            if(row.indexOf(c) < 0) return false;
        }
        return true;
    }
}