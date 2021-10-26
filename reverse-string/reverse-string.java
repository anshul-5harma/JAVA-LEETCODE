class Solution {
    public void reverseString(char[] s) {
        int low = 0;
        int high = s.length - 1 % 2;
        while(low < high) {
            char ch = s[low];
            s[low] = s[high];
            s[high] = ch;
            low++;
            high--;
        }
    }
}