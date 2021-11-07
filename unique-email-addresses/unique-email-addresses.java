class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet();
        for(String email : emails) {
            String[] splits = email.split("@");
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < splits[0].length(); i++) {
                if(splits[0].charAt(i) >= 'a' && splits[0].charAt(i) <= 'z') {
                    sb.append(splits[0].charAt(i));
                } else if(splits[0].charAt(i) == '+') {
                    break;
                } else {
                    continue;
                }
            }
            sb.append("@");
            sb.append(splits[1]);
            set.add(sb.toString());
        }
        return set.size();
    }
}