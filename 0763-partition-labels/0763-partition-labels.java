class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character, Integer> map= new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))) map.put(s.charAt(i),map.get(s.charAt(i))+1);
            else map.put(s.charAt(i),1);
        }
        HashSet<Character> set= new HashSet<>();
        List<Integer> ans= new ArrayList<>();
        int i=0;
        while(i<s.length()){
            int start=i;
            set.add(s.charAt(i));
            map.put(s.charAt(i),map.get(s.charAt(i))-1);
            if(map.get(s.charAt(i))==0) set.remove(s.charAt(i));
            i++;
            while(!set.isEmpty() && i<s.length()){
                if(!set.contains(s.charAt(i))) set.add(s.charAt(i));
                 map.put(s.charAt(i),map.get(s.charAt(i))-1);
                  if(map.get(s.charAt(i))==0) set.remove(s.charAt(i));
                  i++; 
            }
            ans.add(i-start);
        }
        return ans;
    }
}