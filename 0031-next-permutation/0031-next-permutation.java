class Solution {
    public void nextPermutation(int[] nums) {
        int j=nums.length-1;
        int i=nums.length-2;
        while(i>=0){
            if(nums[i]<nums[i+1]) break;
            i--;
        }
        if(i>=0){
            while(nums[j]<=nums[i]){
                j--;
            }
            int temp= nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            
        }
        //reverse suffix
        reverse(nums,i+1,nums.length-1);
    }
    public void reverse(int[] nums,int i,int j){
        while(i<=j){
            int temp= nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
}