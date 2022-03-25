class Solution {
    public String[] getFolderNames(String[] names) {
        Map<String, Integer> map = new HashMap();
        for(int i = 0; i < names.length; i++) {
            String holder = names[i];
            while(map.containsKey(holder)) {
                int counter = map.get(names[i]);
                counter += 1;
                map.put(names[i], counter);
                StringBuilder sb = new StringBuilder();
                sb.append(names[i]).append("(").append(counter).append(")");
                holder = sb.toString();
            }
            map.put(holder, 0);
            names[i] = holder;
        }
        return names;
    }
}