class Solution {
    public String reformatNumber(String number) {
        StringBuilder without_dashes = new StringBuilder();
        for(int i = 0; i < number.length(); i++) {
            if(number.charAt(i) >= '0' && number.charAt(i) <= '9') {
                without_dashes.append(number.charAt(i));
            }
        }
        StringBuilder to_return = new StringBuilder();
        int i = 0;
        int length = without_dashes.length();
        while(length > 4) {
            to_return.append(without_dashes.substring(i, i + 3)).append("-");
            length -= 3;
            i += 3;
        }
        if(length == 4) {
            to_return.append(without_dashes.substring(i, i + 2)).append("-").append(without_dashes.substring(i + 2, i + 4));
        } else if(length == 3) {
            to_return.append(without_dashes.substring(i, i + 3));
        } else if(length == 2) {
            to_return.append(without_dashes.substring(i, i + 2));
        }
        return to_return.toString();
    }
}