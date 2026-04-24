class Solution {
    public long countBadPairs(int[] nums) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]-i)){
                map.put(nums[i]-i,map.get(nums[i]-i)+1);
            }
            else map.put(nums[i]-i,1);
        }
        long goodpairs=0;
        for(int ele: map.keySet()){
            int freq= map.get(ele);
           if(freq>1) goodpairs += (long)(freq)*(freq-1)/2;
        }
        int n= nums.length;
        long total = (long)n * (n - 1) / 2;
        return total-goodpairs;
    }
}