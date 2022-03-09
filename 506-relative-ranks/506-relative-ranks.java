class Solution {
    public String[] findRelativeRanks(int[] score) {
        Map<Integer, Integer> map = new TreeMap();
        for(int i = 0; i < score.length; i++) {
            map.put(score[i], i);
        }
        String[] to_return = new String[score.length];
        int counter = 0;
        for(Integer value : map.values()) {
            if(counter == score.length - 3) {
                to_return[value] = "Bronze Medal";
            } else if(counter == score.length - 2) {
                to_return[value] = "Silver Medal";
            } else if(counter == score.length - 1) {
                to_return[value] = "Gold Medal";
            } else {
                to_return[value] = score.length - counter + "";
            }
            counter++;
        }
        return to_return;
    }
}