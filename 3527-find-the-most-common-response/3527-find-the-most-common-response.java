class Solution {
    public String findCommonResponse(List<List<String>> responses) {
        HashMap<String,Integer> map= new HashMap<>();

        for(int i=0;i<responses.size();i++){
            HashSet<String> set=new HashSet<>();

            for(int j=0;j<responses.get(i).size();j++){
                String temp= responses.get(i).get(j);
                if(!set.contains(temp)){
                    if(map.containsKey(temp)){
                        map.put(temp,map.get(temp)+1);
                    }
                    else map.put(temp,1);
                    set.add(temp);
                }
            }
        }
        String ans=null;
        int maxfreq=0;
        for(String key: map.keySet()){
            if(map.get(key)>maxfreq || (map.get(key)==maxfreq && key.compareTo(ans)<0)){
                ans=key;
                maxfreq=map.get(key);
            }
        }
        return ans;
    }
}