class Solution {
    public String reorganizeString(String s) {
        HashMap<Character,Integer> map= new HashMap<>();
        for(int i=0;i<s.length();i++){
              char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
       PriorityQueue<Character> pq = new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        for(Character ch: map.keySet()){
            pq.add(ch);
        }
        StringBuilder sb= new StringBuilder();
        char c= pq.remove();
        sb.append(c);
        map.put(c,map.get(c)-1);
        if(map.get(c)>0) pq.add(c);
        while(!pq.isEmpty()){
            char ch= pq.remove();
            if(sb.charAt(sb.length()-1)!=ch){
                sb.append(ch);
                map.put(ch,map.get(ch)-1);
                if(map.get(ch)==0) map.remove(ch);
                else pq.add(ch);
            }
            else{
                if(pq.isEmpty()) return "";
                char ch2= pq.remove();
                sb.append(ch2);
                map.put(ch2,map.get(ch2)-1);
                if(map.get(ch2)==0) map.remove(ch2);
                if(map.containsKey(ch2)) pq.add(ch2);
                pq.add(ch);
            }
          
        }
        return sb.toString();
    }
}