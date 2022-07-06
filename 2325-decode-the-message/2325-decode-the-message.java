class Solution {
    public String decodeMessage(String key, String message) {
        Map<Character, Character> map = new HashMap();
        char start = 'a';
        for(int i = 0; i < key.length(); i++) {
            if(!map.containsKey(key.charAt(i)) && key.charAt(i) != ' ') {
                map.put(key.charAt(i), start++);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < message.length(); i++) {
            if(map.containsKey(message.charAt(i))) {
                sb.append(map.get(message.charAt(i)));
            } else {
                sb.append(' ');
            }
        }
        return sb.toString();
    }
}