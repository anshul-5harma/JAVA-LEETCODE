class Solution {
    public boolean isAnagram(String s, String t) {
        char[] _s = s.toCharArray();
        char[] _t = t.toCharArray();
        Arrays.sort(_s);
        Arrays.sort(_t);
        if(_s.length != _t.length) {
            return false;
        }
        for(int i = 0; i < _s.length; i++) {
            if(_s[i] != _t[i]) {
                return false;
            }
        }
        return true;
    }
}