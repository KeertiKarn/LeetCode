class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0) return new ArrayList<>();
        HashMap<String,List<String>> map= new HashMap<>();
        for(String s: strs){
            char[] temp= s.toCharArray();
            Arrays.sort(temp);
            String sorted= String.valueOf(temp);
            if(!map.containsKey(sorted)){
                map.put(sorted,new ArrayList<>());
            }
            map.get(sorted).add(s);
        }
        return new ArrayList<>(map.values());
    }
}