class Solution {
    public int countTriples(int n) {
        int counter = 0;
        for(int j = 1; j <= n; j++) {
            for(int x = 1; x <= n ;x++) {
                for(int i = 1; i <= n; i++) {
                    if(j * j + (x) * (x) == (i) * (i)) counter++;
                }
            }
        }
        return counter;
    }
}