class Solution {
    public int[] countOppositeParity(int[] nums) {
        int even=0;
        int odd=0;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]%2==0){
                even++;
                nums[i]=odd;
            }
            else{
               odd++;
               nums[i]=even;
            }
        }
        return nums;
    }
}