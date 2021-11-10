class Solution {
    public boolean areNumbersAscending(String s) {
        s = s.replaceAll("[^0-9]", " ").replaceAll("\\s+", " ");
        String[] arr = s.trim().split(" ");
        for(int i = 0; i < arr.length - 1; i++) {
            if(Integer.valueOf(arr[i]) >= Integer.valueOf(arr[i+1])) {
                return false;
            }
        }
        return true;
    }
}