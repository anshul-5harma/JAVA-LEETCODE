class Solution {
    public boolean strongPasswordCheckerII(String password) {
        if(password.length() < 8) return false;
        String specials = "!@#$%^&*()-+";
        boolean oneLowercase = false;
        boolean oneUppercase = false;
        boolean oneDigit = false;
        boolean special = false;
        char prev = ' ';
        for(char ch : password.toCharArray()) {
            if(ch == prev) {
                return false;
            }
            prev = ch;
            if(!oneLowercase) oneLowercase = ch >= 97 && ch <= 122;
            if(!oneUppercase) oneUppercase = ch >= 65 && ch <= 90;
            if(!oneDigit) oneDigit = Character.isDigit(ch);
            if(!special) special = specials.contains(Character.toString(ch));
        }
        return oneLowercase && oneUppercase && oneDigit && special;
    }
}