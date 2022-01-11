class Solution {
    public String capitalizeTitle(String title) {
        StringBuilder sb = new StringBuilder();
        String[] splits = title.split(" ");
        for(int i = 0; i < splits.length; i++) {
            if(splits[i].length() < 3) {
                sb.append(splits[i].toLowerCase());
            } else {
                splits[i] = splits[i].toLowerCase();
                sb.append((char) (((int) splits[i].charAt(0)) - 32));
                sb.append(splits[i].substring(1));
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}