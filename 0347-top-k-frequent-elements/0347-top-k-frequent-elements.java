// class Pair implements Comparable<Pair>{
//   int num;
//   int freq;
//   Pair(int num,int freq){
//     this.num=num;
//     this.freq=freq;
//   }
//   public int compareTo(Pair p){
//    return this.freq-p.freq;
//   }
// }

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele: nums){
            if(map.containsKey(ele)){
                map.put(ele,map.get(ele)+1);
            }
            else{
                map.put(ele,1);
            }
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((b,a)->{
            int d1= map.get(a);
            int d2= map.get(b);
            return d1-d2;
        });
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            pq.add(entry.getKey());
        }
        int i=0;
        while(!pq.isEmpty() && k>0){
            ans[i]=pq.remove();
            i++;
            k--;
        }
        //   for (Map.Entry<Integer,Integer> entry : map.entrySet()){
        //     int num = entry.getKey();
        //     int diff= entry.getValue();
        //     pq.add(new Pair(num,diff));
        //     if(pq.size()>k){
        //         pq.remove();
        //     }
        //   } 
        //   for(int i=0;i<k;i++){
        //    Pair p = pq.remove();
        //    ans[i] = p.num;
        //   }
         return ans;
    }
}