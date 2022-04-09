class Solution {
    public int[] processQueries(int[] queries, int m) {
        List<Integer> list = new ArrayList();
        int[] to_return = new int[queries.length];
        for(int i = 0; i < m; i++) {
            list.add(i + 1);
        }
        for(int i = 0; i < queries.length; i++) {
            to_return[i] = list.indexOf(queries[i]);
            list.remove(list.indexOf(queries[i]));
            list.add(0, queries[i]);
        }
        return to_return;
    }
}