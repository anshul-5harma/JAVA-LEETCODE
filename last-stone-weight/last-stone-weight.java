class Solution {
    public int lastStoneWeight(int[] stones) {
        List<Integer> list = new ArrayList();
        for(int i : stones) list.add(i);
        while(list.size() > 1) {
            Collections.sort(list);
            int last = list.get(list.size() - 2);
            int second = list.get(list.size() - 1);
            if(last == second) {
                list.remove(list.size() - 2);
                list.remove(list.size() - 1);
            } else {
                list.remove(list.size() - 2);
                list.remove(list.size() - 1);
                list.add(second - last);
            }
        }
        if(list.size() == 0) return 0;
        return list.get(0);
    }
}