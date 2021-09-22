class Solution {
    public String sortSentence(String s) {
        StringBuilder sb = new StringBuilder();
        String[] splits = s.split(" ");
        Map<Integer, String> map = new TreeMap<>();
        for(int i = 0; i < splits.length; i++) {
            map.put(Integer.parseInt(splits[i].substring(splits[i].length() - 1)), splits[i].substring(0, splits[i].length() - 1));
        }
        Iterator<Integer> it = map.keySet().iterator();
        while (it.hasNext()) {
            int key = it.next();
            sb.append(map.get(key));
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}