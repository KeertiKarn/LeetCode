class Solution {
    public int maximumLengthSubstring(String s) {
        int start=0;
        int end=0;
        int len=0;
        HashMap<Character,Integer> map= new HashMap<>();
        while(end<s.length()){
            char ch= s.charAt(end);
             if(map.containsKey(ch)) map.put(ch,map.get(ch)+1);
                else map.put(ch,1); 
                end++;
            while(map.get(ch)>2){
                char temp= s.charAt(start);
                map.put(temp,map.get(temp)-1);
                start++;
            }
            
            len=Math.max(len,end-start);
        }
        return len;
    }
}