class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        List<String> list = new ArrayList();
        Map<String, Integer> map =  new HashMap();
        for(int i = 0; i < cpdomains.length; i++) {
            String[] split = cpdomains[i].split("\\s+");
            int number = Integer.valueOf(split[0]);
            String[] domain_part = split[1].split("\\.");
            String concat = "";
            for(int j = domain_part.length - 1; j >= 0 ; --j) {
                concat = domain_part[j] + (j < domain_part.length - 1 ? "." : "") + concat;
                map.put(concat, map.getOrDefault(concat, 0) + number);
            }
        }
        for(String str : map.keySet()) {
            list.add("" + map.get(str) + " " + str);
        }
        return list;
    }
}