class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map= new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            if(map.containsKey(ch)) map.put(ch,map.get(ch)+1);
            else map.put(ch,1);
        }
        PriorityQueue<Character> pq= new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
    for(char ch:map.keySet()) pq.add(ch);
        StringBuilder sb= new StringBuilder();
        while(!pq.isEmpty()){
        char ch=pq.remove();
        int freq=map.get(ch);

    while(freq-- > 0)
        sb.append(ch);
}
        return sb.toString();

    }
}