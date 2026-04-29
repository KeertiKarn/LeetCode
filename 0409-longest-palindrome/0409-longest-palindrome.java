class Solution {
    public int longestPalindrome(String s) {
     HashMap<Character,Integer> map= new HashMap<>();
     for(int i=0;i<s.length();i++){
        if(map.containsKey(s.charAt(i))) map.put(s.charAt(i),map.get(s.charAt(i))+1);
        else map.put(s.charAt(i),1);
     } 
     int len=0;  
     boolean odd=false;
     for(int freq:map.values()){
        if(freq%2==0) len+=freq;
        else{
            odd=true;
            len+=(freq-1);
        }
     }
     if(odd) return len+1;
     return len;
    }
}