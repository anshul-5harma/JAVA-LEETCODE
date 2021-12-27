class Solution {
    public int findComplement(int num) {
        String binary = Integer.toBinaryString(num);
        char[] operations = binary.toCharArray();
        for(int i = 0; i < operations.length; i++) {
            if(operations[i] == '0') {
                operations[i] = '1';
            } else {
                operations[i] = '0';
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char ch : operations) sb.append(ch);
        return Integer.parseInt(sb.toString(), 2);
    }
}