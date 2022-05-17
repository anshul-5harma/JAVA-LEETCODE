class Solution {
    public List<String> removeAnagrams(String[] words) {
        String previous = "";
        List<String> to_return = new ArrayList();
        for(int i = 0; i < words.length; i++) {
            char[] ch = words[i].toCharArray();
            Arrays.sort(ch);
            if(!String.valueOf(ch).equals(previous)) {
                to_return.add(words[i]);
                previous = String.valueOf(ch);
            }
        }
        return to_return;
    }
}