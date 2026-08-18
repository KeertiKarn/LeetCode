class Solution {
    public int largestInteger(int[] nums, int k) {
        if(k==nums.length){
            int max=Integer.MIN_VALUE;
            for(int ele:nums) max=Math.max(max,ele);
            return max;
        }
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int ele:nums){
            if(map.containsKey(ele)) map.put(ele,map.get(ele)+1);
            else map.put(ele,1);
            }
            int max=Integer.MIN_VALUE;
            if(k==1){
            for(int key: map.keySet()){
               if(map.get(key)==1) max=Math.max(max,key);
            }
            if(max==Integer.MIN_VALUE) return -1;
            return max;
            }
            int option1=-1;
            int option2=-1;
            if(map.get(nums[0])==1) option1= nums[0];
            if(map.get(nums[nums.length-1])==1) option2= nums[nums.length-1];
            return Math.max(option1,option2);

    }
}