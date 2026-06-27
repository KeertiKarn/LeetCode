class Solution {
    public int maximumLength(int[] nums) {
        HashMap<Long,Integer> map= new HashMap<>();
        for(int ele: nums){
            if(map.containsKey((long)ele)) map.put((long)ele,map.get((long)ele)+1);
            else map.put((long)ele,1);
        }
        int maxlen=1;
        // Special case for 1
        if (map.containsKey(1L)) {
            int cnt=map.get(1L);
            if(cnt%2==0)
                maxlen= Math.max(maxlen,cnt-1);
            else
                maxlen= Math.max(maxlen,cnt);
        }
        for(long key: map.keySet()){
             if(key==1) continue;
            long curr= key;
            int len= 0;
            while(map.containsKey(curr)){
                  if(map.get(curr)>=2){
                    len+=2;
                    curr*=curr;
                  }
                  else{
                    len++;
                    break;
                  }
                }
                if(!map.containsKey(curr)) len--;
                maxlen=Math.max(maxlen,len);
            }
        
          return maxlen;
    }
}