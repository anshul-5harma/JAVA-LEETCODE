class Solution {
    public String reorderSpaces(String text) {
        int space_counter = 0;
        char[] converted = text.toCharArray();
        for(int i = 0; i < converted.length; i++) {
            if(converted[i] == ' ') {
                space_counter++;
            }
        }
        if(space_counter == 0) return text;
        text = text.replaceAll("\\s+", " ").trim();
        String[] splits = text.split(" ");
        int words = splits.length - 1;
        if(words < 1) {
            int start = 0;
            while(start < space_counter) {
                splits[0] += " ";
                start++;
            }
            return splits[0];
        }
        int each_spaces = space_counter / words;
        int left_spaces = space_counter % words;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < splits.length; i++) {
            sb.append(splits[i]);
            int start = 0;
            while(start < each_spaces) {
                sb.append(" ");
                start++;
            }
        }
        String to_return = sb.toString().trim();
        int start = 0;
        while(start < left_spaces) {
            to_return += " ";
            start++;
        }
        return to_return;
    }
}