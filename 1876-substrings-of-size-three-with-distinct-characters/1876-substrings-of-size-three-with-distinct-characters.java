class Solution {
    public int countGoodSubstrings(String s) {
        if(s.length()<=2) return 0;
        HashMap<Character,Integer> map= new HashMap<>();
        for(int i=0;i<=2;i++){
            if(map.containsKey(s.charAt(i))) map.put(s.charAt(i),map.get(s.charAt(i))+1);
            else map.put(s.charAt(i),1);
        }
        int count=0;
        if(map.size()==3) count++;
        int start=1;
        int end=3;
        while(end<s.length()){
            if(map.containsKey(s.charAt(end))) map.put(s.charAt(end),map.get(s.charAt(end))+1);
            else map.put(s.charAt(end),1);
            map.put(s.charAt(start-1),map.get(s.charAt(start-1))-1);
            if(map.get(s.charAt(start-1))==0) map.remove(s.charAt(start-1));
            if(map.size()==3) count++;
            start++;
            end++;
        }
        return count;
        
    }
}