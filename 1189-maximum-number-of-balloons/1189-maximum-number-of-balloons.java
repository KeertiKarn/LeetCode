class Solution {
    public int maxNumberOfBalloons(String text) {
       HashMap<Character,Integer> map= new HashMap<>();
       for(int i=0;i<text.length();i++){
        char ch= text.charAt(i);
        if(map.containsKey(ch)) map.put(ch,map.get(ch)+1);
        else map.put(ch,1);
       } 
       int count=Integer.MAX_VALUE;
       String temp= "balloon";
       for(int i=0;i<temp.length();i++){
        if(!map.containsKey(temp.charAt(i))) return 0;
        if(temp.charAt(i)=='l' || temp.charAt(i)=='o') count = Math.min(count,map.get(temp.charAt(i))/2);
        else count=Math.min(count,map.get(temp.charAt(i)));
       }
       return count;
    }
}