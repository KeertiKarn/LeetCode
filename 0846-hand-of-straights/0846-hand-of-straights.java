class Solution {
    public boolean isNStraightHand(int[] nums, int k) {
                if(nums.length%k!=0) return false;
        HashSet<Integer> set= new HashSet<>();
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])) map.put(nums[i],map.get(nums[i])+1);
            else map.put(nums[i],1);
            set.add(nums[i]);
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                int count=1;
                map.put(nums[i],map.get(nums[i])-1);
                if(map.get(nums[i])==0){
                    map.remove(nums[i]);
                    set.remove(nums[i]);
                }
                while(count!=k){
                    if(!set.contains(nums[i]+count)) return false;
                    map.put(nums[i]+count,map.get(nums[i]+count)-1);
                     if(map.get(nums[i]+count)==0){
                    map.remove(nums[i]+count);
                    set.remove(nums[i]+count);
                    }
                    count++;
                }
            }

        }
        return true;
    }
}