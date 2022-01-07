class Solution {
    public int[] minOperations(String boxes) {
        int[] to_return = new int[boxes.length()];
        for(int i = 0; i < boxes.length(); i++) {
            int counter = 0;
            for(int j = 0; j < boxes.length(); j++) {
                if(i != j) {
                    if(boxes.charAt(j) == '1') {
                        counter += Math.abs(j - i);
                    }   
                }
            }
            to_return[i] = counter;
        }
        return to_return;
    }
}