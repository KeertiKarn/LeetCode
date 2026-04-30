class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map= new HashMap<>();
        HashSet<Integer> set= new HashSet<>();
        int start=0;
        int end=0;
        int maxlen=0;
        while(end<fruits.length){
          set.add(fruits[end]);
          map.put(fruits[end],end);
          if(set.size()>2){
            int min=end;
            int minele=fruits[start];
            for(int ele: map.keySet()){
               if(map.get(ele)<min) {min=map.get(ele);
            minele=ele;}
            }
            set.remove(minele);
            map.remove(minele);
            start=min+1;
          }
          maxlen=Math.max(maxlen,end-start+1);
          end++;
        }
        maxlen=Math.max(maxlen,end-start);
        return maxlen;
    }
}