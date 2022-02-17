class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] to_return = new int[num_people];
        int count = 1;
        int start = 0;
        while(candies > 0) {
            if(candies < count) {
                to_return[start] += candies;
            } else {
                to_return[start] += count;
            }
            start++;
            candies -= count;
            count++;
            if(start == to_return.length) {
                start = 0;
            }
        }
        return to_return;
    }
}