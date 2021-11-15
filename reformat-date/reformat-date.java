class Solution {
    public String reformatDate(String date) {
        String[] splits = date.trim().split(" ");
        StringBuilder sb = new StringBuilder();
        sb.append(splits[2]);
        sb.append('-');
        String dt = splits[0].replaceAll("[^0-9]", "");
        if(dt.length() < 2) {
            dt = "0" + dt;
        }
        String[] arr = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        for(int i = 0; i < arr.length; i++) {
            if(splits[1].equals(arr[i])) {
                if(i < 9) {
                    String temp = "" + (i+1);
                    sb.append("0"+temp);
                } else {
                    sb.append(i+1);
                }
                sb.append('-');
            }
        }
        sb.append(dt);
        return sb.toString();
    }
}