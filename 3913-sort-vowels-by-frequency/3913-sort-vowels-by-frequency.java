class Solution {
    public String sortVowels(String s) {
      HashMap<Character,Integer> map= new HashMap<>();
      HashMap<Character,Integer> first= new HashMap<>();
      for(int i=0;i<s.length();i++){
        if(isVowel(s.charAt(i))){
        if(map.containsKey(s.charAt(i))) map.put(s.charAt(i),map.get(s.charAt(i))+1);
        else {
            map.put(s.charAt(i),1);
            first.put(s.charAt(i),i);
        }
        }
    }
      PriorityQueue<Character> pq= new PriorityQueue<>((a,b)->{
        if (map.get(a).equals(map.get(b))) return first.get(a)-first.get(b);
        return map.get(b)-map.get(a);
      });
      for(int i=0;i<s.length();i++){
        if(isVowel(s.charAt(i))) pq.add(s.charAt(i));
      }
      StringBuilder ans= new StringBuilder();
      ans.append(s);
     
        for(int i=0;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                ans.setCharAt(i, pq.poll());
            }
        }
      return ans.toString();
    }
    public boolean isVowel(char ch){
        return (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u');
    }
   
}