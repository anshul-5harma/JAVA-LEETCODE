class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int i = 0;
        int j = 0;
        if (ransomNote.equals(magazine)) {
            return true;
        } else {
            char[] _ransome = ransomNote.toCharArray();
            char[] _magazine = magazine.toCharArray();
            Arrays.sort(_magazine);
            Arrays.sort(_ransome);
            while (i < _ransome.length && j < _magazine.length) {
                if (_ransome[i] == _magazine[j]) {
                    i++;
                }
                j++;
            }
        }
        return i == ransomNote.length();
    }
}