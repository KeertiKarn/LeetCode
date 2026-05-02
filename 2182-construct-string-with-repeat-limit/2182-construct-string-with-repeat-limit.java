class Solution {
    public String repeatLimitedString(String s, int repeatLimit) {
        int[] freq= new int[26];
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }
        PriorityQueue<Character> pq = new PriorityQueue<>(
            (a,b)->b-a 
        );
        for(int i=0;i<26;i++){
            if(freq[i]>0){
                pq.add((char)(i+'a'));
            }
        }
        StringBuilder ans= new StringBuilder();
        while(!pq.isEmpty()){
            char ch= pq.poll();
            int count= freq[ch -'a'];
            int use= Math.min(count,repeatLimit);
            for (int i=0;i<use;i++){
                ans.append(ch);
            }
            freq[ch-'a']-= use;
            if(freq[ch-'a']>0){
                if(pq.isEmpty()) break; 
                char next = pq.poll();
                ans.append(next);
                freq[next-'a']--;
                if(freq[next-'a']>0){
                    pq.add(next);
                }
                pq.add(ch);
            }
        }

        return ans.toString();
    }
}