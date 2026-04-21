class Solution {
    public int movesToMakeZigzag(int[] nums) {
        int[] copy= Arrays.copyOf(nums,nums.length);
        int count1=0;
        int count2=0;
        for(int i=0;i<nums.length;i++){
            if(i%2!=0){
                int right= Integer.MAX_VALUE;
                int left= Integer.MAX_VALUE;
               if(i<nums.length-1) right= nums[i+1];
               if(i>0) left=nums[i-1];
               int min= Math.min(right,left);
               if(nums[i]>=min) count1+= nums[i]-(min-1);  
            }
            else if(i%2==0){
                int right= Integer.MAX_VALUE;
                int left= Integer.MAX_VALUE;
               if(i<nums.length-1) right= copy[i+1];
               if(i>0) left=copy[i-1];
                int min= Math.min(right,left);
               if(copy[i]>=min) count2+= copy[i]-(min-1);
            }
        }
        return Math.min(count1,count2);
    }
}