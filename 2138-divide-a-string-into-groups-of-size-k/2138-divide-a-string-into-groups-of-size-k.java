class Solution {
    public String[] divideString(String s, int k, char fill) {
        if(s.length() % k != 0) {
            int filler = k - (s.length() % k);
            for(int i = 1; i <= filler; i++) {
                s += fill;
            }
        }
        ArrayList<String> list = new ArrayList();
        int counter = 0;
        while(counter < s.length()) {
            StringBuilder sb = new StringBuilder();
            sb.append(s.substring(counter, counter + k));
            list.add(sb.toString());
            counter += k;
        }
        return list.toArray(new String[list.size()]);
    }
}