class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        ArrayList<String> list = new ArrayList();
        String[] _text = text.split(" ");
        for(int i = 0; i < _text.length - 2; i++) {
            if(_text[i].equals(first) && _text[i+1].equals(second)) {
                list.add(_text[i+2]);
            }
        }
        String[] to_return = new String[list.size()];
        for(int i = 0; i < list.size(); i++) {
            to_return[i] = list.get(i);
        }
        return to_return;
    }
}