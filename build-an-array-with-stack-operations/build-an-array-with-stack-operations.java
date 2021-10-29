class Solution {
    public List<String> buildArray(int[] target, int n) {
        int length = target.length - 1;
        int index = 0;
        ArrayList<String> list = new ArrayList();
        for(int i = 1; i <= target[length]; i++) {
            list.add("Push");
            if(i == target[index]) {
                index++;
            } else {
                list.add("Pop");
            }
        }
        return list;
    }
}