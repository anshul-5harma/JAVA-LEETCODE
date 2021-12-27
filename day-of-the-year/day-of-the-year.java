class Solution {
    public int dayOfYear(String date) {
        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] parts = date.split("-");
        int days = 0;
        boolean isLeapYear = ((Integer.parseInt(parts[0]) % 4 == 0) && (Integer.parseInt(parts[0]) % 100 != 0) || (Integer.parseInt(parts[0]) % 400 == 0));
        if (isLeapYear) {
            months[1] = 29;
        }
        if(parts[1].equals("01")) {
            return Integer.valueOf(parts[2]);
        } 
        for(int i = 0; i < Integer.valueOf(parts[1]) - 1; i++) {
                days += months[i];
        }  
        return days + Integer.valueOf(parts[2]);
    }
}