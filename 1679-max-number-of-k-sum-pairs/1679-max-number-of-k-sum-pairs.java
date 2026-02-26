class Solution {
    public int maxOperations(int[] nums, int k) {
      HashMap<Integer,Integer> map= new HashMap<>();
      int count=0;
      for(int ele: nums){
        int comp= k-ele;
        if(map.containsKey(comp) && map.get(comp)>0){
            count++;
            map.put(comp,map.get(comp)-1);
        }
        else{
            if(map.containsKey(ele)) map.put(ele,map.get(ele)+1);
            else map.put(ele,1);
        }
      }
      return count;  
    }
}