class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
       int max = releaseTimes[0];
        char longest = keysPressed.charAt(0);
        for(int i = 1; i < releaseTimes.length; i++) {
            if(releaseTimes[i] - releaseTimes[i-1] > max || releaseTimes[i] - releaseTimes[i-1] == max && longest < keysPressed.charAt(i)) {
                max = releaseTimes[i] - releaseTimes[i-1];
                longest = keysPressed.charAt(i);
            }
        }
        return longest;
    }
}