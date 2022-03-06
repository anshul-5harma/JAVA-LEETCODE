class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String, String> map = new HashMap();
        for(List<String> list : knowledge) {
            map.put(list.get(0), list.get(1));
        }
        StringBuilder sb = new StringBuilder();
        int index = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                System.out.println(s.substring(index, i));
                sb.append(s.substring(index, i));
                index = i + 1;
            } else if(s.charAt(i) == ')') {
                sb.append(map.getOrDefault(s.substring(index, i), "?"));
                index = i + 1;
            }
        }
        sb.append(s.substring(index));
        return sb.toString();
    }
}