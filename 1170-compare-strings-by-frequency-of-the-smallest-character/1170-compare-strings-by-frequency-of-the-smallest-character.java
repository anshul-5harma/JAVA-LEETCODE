class Solution {
    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] to_return = new int[queries.length];
        for(int i = 0; i < queries.length; i++) {
            to_return[i] = compare(queries[i], words);
        }
        return to_return;
    }
    public static int compare(String str, String[] words) {
        int final_counter = 0;
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        int counter = 1;
        for(int i = 0; i < ch.length - 1; i++) {
            if(ch[i] == ch[i + 1]) {
                counter++;
            } else {
                break;
            }
        }
        for(int i = 0; i < words.length; i++) {
            char[] c = words[i].toCharArray();
            Arrays.sort(c);
            int cp = 1;
            for(int j = 0; j < c.length - 1; j++) {
                if(c[j] == c[j+1]) {
                    cp++;
                } else {
                    break;
                }
            }
            if(cp > counter) {
                final_counter++;
            }
        }
        return final_counter;
    }
}