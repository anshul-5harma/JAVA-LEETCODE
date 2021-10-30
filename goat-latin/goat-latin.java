class Solution {
    public String toGoatLatin(String sentence) {
        String[] test_arr = sentence.split(" ");
        String final_str = "";

        for(int i = 0 ; i < test_arr.length; i++) {
            char ch = test_arr[i].charAt(0);
            if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch =='I' || ch == 'u' || ch == 'U' || ch == 'o' || ch == 'O') {
                test_arr[i] += "ma";
                for (int j = 0; j <= i; j++) {
                    test_arr[i] += 'a';
                }
                final_str += test_arr[i] + " ";
            } else {
                String extract = test_arr[i].substring(0,1);
                String left_over = test_arr[i].substring(1);
                String manipulated = left_over + extract + "ma";
                for (int j = 0; j <= i; j++) {
                    manipulated += 'a';
                }
                final_str += manipulated + " ";
            }
        }
        return final_str.trim();
    }
}