class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String, String> map = new HashMap();
        for(List<String> list : knowledge) {
            map.put(list.get(0), list.get(1));
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder holder = new StringBuilder();
        boolean key = false;
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '(') {
                key = true;
            } else if(ch == ')') {
                key = false;
                sb.append(map.getOrDefault(holder.toString(), "?"));
                holder.setLength(0);
            } else {
                if(key) holder.append(ch);
                else sb.append(ch);
            }
        }
        return sb.toString();
    }
}