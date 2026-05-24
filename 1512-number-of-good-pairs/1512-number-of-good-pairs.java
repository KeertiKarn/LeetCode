class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int ele: nums){
            if(map.containsKey(ele)) map.put(ele,map.get(ele)+1);
            else map.put(ele,1);
        }
        for(int key: map.values()){
            count+=(key)*(key-1)/2;
        }
        return count;
    }
}