class Solution {
    public int[] shortestToChar(String s, char c) {
        ArrayList<Integer> list = new ArrayList();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == c) {
                list.add(i);
            }
        }
        int[] to_return = new int[s.length()];
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < s.length(); i++) {
            for(int j = 0; j < list.size(); j++) {
                int absolute = Math.abs(i - list.get(j));
                min = Math.min(min, absolute);
            }
            to_return[i] = min;
            min = Integer.MAX_VALUE;
        }
        return to_return;
    }
}