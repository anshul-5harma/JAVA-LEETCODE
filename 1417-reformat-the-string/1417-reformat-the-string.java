class Solution {
    public String reformat(String s) {
        StringBuilder numbers = new StringBuilder();
        StringBuilder alphas = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                numbers.append(s.charAt(i));
            } else alphas.append(s.charAt(i));
        }
        System.out.println(alphas);
        if(alphas.length() == numbers.length()) return alpha(alphas.toString(), numbers.toString());
        if(Math.abs(alphas.length() - numbers.length()) != 1 || Math.abs(numbers.length() - alphas.length()) != 1) return "";
        return alphas.length() > numbers.length() ? alpha(alphas.toString(), numbers.toString()) : number(alphas.toString(), numbers.toString()); 
    }
    
    public static String alpha(String alphas, String numbers) {
        char[] ch = new char[alphas.length() + numbers.length()];
        int start = 0;
        for(int i = 0; i < alphas.length(); i++) {
            ch[start] = alphas.charAt(i);
            start += 2;
        }
        int other = 1;
        for(int i = 0; i < numbers.length(); i++) {
            ch[other] = numbers.charAt(i);
            other += 2;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < ch.length; i++) {
            sb.append(ch[i]);
        }
        return sb.toString();
    }
    public static String number(String alphas, String numbers) {
        char[] ch = new char[alphas.length() + numbers.length()];
        int start = 0;
        for(int i = 0; i < numbers.length(); i++) {
            ch[start] = numbers.charAt(i);
            start += 2;
        }
        int other = 1;
        for(int i = 0; i < alphas.length(); i++) {
            ch[other] = alphas.charAt(i);
            other += 2;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < ch.length; i++) {
            sb.append(ch[i]);
        }
        return sb.toString();
    }
}