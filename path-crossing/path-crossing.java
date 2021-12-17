class Solution {
    public boolean isPathCrossing(String path) {
        Set<String> set = new HashSet();
        int x = 0;
        int y = 0;
        set.add(""+x+y);
        for(int i = 0; i < path.length(); i++) {
            if(path.charAt(i) == 'N') {
                ++y;
                if(set.contains(""+x+y)) return true;
                set.add(""+x+y);
            } else if(path.charAt(i) == 'S') {
                --y;
                if(set.contains(""+x+y)) return true;
                set.add(""+x+y);
            } else if(path.charAt(i) == 'E') {
                ++x;
                if(set.contains(""+x+y)) return true;
                set.add(""+x+y);
            } else if(path.charAt(i) == 'W') {
                --x;
                if(set.contains(""+x+y)) return true;
                set.add(""+x+y);
            }
        }
        return false;
    }
}