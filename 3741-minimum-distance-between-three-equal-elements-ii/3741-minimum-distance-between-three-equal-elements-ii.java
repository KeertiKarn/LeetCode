class Solution {
    public int minimumDistance(int[] nums) {
      HashMap<Integer,List<Integer>> map= new HashMap<>();
      for(int i=0;i<nums.length;i++){
        int ele= nums[i];
        if(map.containsKey(ele)){
          List<Integer> temp= map.get(ele);
          temp.add(i);
          map.put(ele,temp);
        }
        else{
            List<Integer> l= new ArrayList<>();
            l.add(i);
            map.put(ele,l);
        }
      }  
      int ans= Integer.MAX_VALUE;
      for(Map.Entry<Integer,List<Integer>> entry: map.entrySet()){
        List<Integer> li= entry.getValue();
        if(li.size()>=3){
         for(int m=0;m<=li.size()-3;m++) {

            int currentDist = 2 * (li.get(m + 2) - li.get(m));
            ans = Math.min(ans, currentDist);
        }
        }
      }
      if(ans==Integer.MAX_VALUE) return -1;
      return ans;
    }
}