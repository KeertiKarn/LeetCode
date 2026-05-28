class Solution {
    public int minSteps(String s, String t) {
        HashMap<Character,Integer> map= new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))) map.put(s.charAt(i),map.get(s.charAt(i))+1);
            else map.put(s.charAt(i),1);
        }
        HashMap<Character,Integer> map2= new HashMap<>();
        for(int i=0;i<t.length();i++){
            if(map2.containsKey(t.charAt(i))) map2.put(t.charAt(i),map2.get(t.charAt(i))+1);
            else map2.put(t.charAt(i),1);
        }
        int ans=0;
        for(char ch: map.keySet()){
            int val1= map.get(ch);
            int val2=0;
            if(map2.containsKey(ch)) val2= map2.get(ch);
            if(val1>val2) ans+=val1-val2;
        }
        return ans;
    }
}