class Solution {
    public String thousandSeparator(int n) {
        StringBuilder sb = new StringBuilder();
        if(n < 1000) {
            return ""+n;
        } else {
            int counter = 0;
            while(n > 0) {
                int remainder = n % 10;
                sb.append(remainder);
                n /= 10;
                counter++;
                if(counter % 3 == 0 && n != 0) {
                    sb.append('.');
                    counter = 0;
                }
            }
        }
        return sb.reverse().toString();
    }
}