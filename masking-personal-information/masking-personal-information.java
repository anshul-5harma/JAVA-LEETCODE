class Solution {
    public String maskPII(String s) {
        StringBuilder sb = new StringBuilder();
        String to_return = "";
        if (s.indexOf('@') != -1) {
            s = s.toLowerCase();
            String[] str = s.split("@");
            sb.append(str[0].charAt(0));
            for(int i = 1; i <= 5; i++) {
                sb.append("*");
            }
            sb.append(s.charAt(str[0].length() - 1)).append("@").append(str[1]);
            to_return = sb.toString();   
        } else {
            s = s.replaceAll("[^0-9]", "");
            if(s.length() > 10) {
                sb.append("+");
                int distance = s.length() - 10;
                for(int i = 1; i <= distance; i++) {
                    sb.append('*');
                }
                sb.append('-');
            }
            int counter = 1;
            while(counter <= 2) {
                for(int i = 1; i <= 3; i++) {
                    sb.append('*');
                }
                sb.append('-');
                counter++;
            }
            sb.append(s.substring(s.length() - 4));
            to_return = sb.toString();
        }
        return to_return;
    }
}