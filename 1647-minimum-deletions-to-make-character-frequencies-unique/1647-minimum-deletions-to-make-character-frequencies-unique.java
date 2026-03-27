class Solution {
    public int minDeletions(String s) {
        HashMap<Character,Integer> map= new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            if(map.containsKey(ch)) map.put(ch,map.get(ch)+1);
            else map.put(ch,1);
        }
        int[] freq= new int[map.size()];
        int i=0;
        for(int val: map.values()){
            freq[i]= val;
            i++;
        }
        Arrays.sort(freq);
        i=freq.length-2;
        int count=0;
        while(i>=0){
          while(freq[i]>0 && freq[i]>=freq[i+1]){
            freq[i]--;
            count++;
          }
          i--;
        }
        return count;
    }
}