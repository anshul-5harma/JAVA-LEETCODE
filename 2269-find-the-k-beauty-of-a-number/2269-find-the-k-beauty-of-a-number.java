class Solution {
    public int divisorSubstrings(int num, int k) {
        int current = 0;
        int to_return = 0;
        String converted = String.valueOf(num);
        for(int i = 0; i < converted.length() - k + 1; i++) {
            current = Integer.parseInt(converted.substring(i, i + k));
            if(current != 0 && num % current == 0) to_return++;
        }
        return to_return;
    }
}