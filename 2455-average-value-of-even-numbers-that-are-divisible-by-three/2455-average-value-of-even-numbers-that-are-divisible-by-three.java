class Solution {
    public int averageValue(int[] nums) {
        int count=0;
        int sum=0;
        for(int ele:nums){
            if(ele%6==0){
                count++;
                sum+=ele;
            }
        }
        if(count==0) return 0;
        return sum/count;
    }
}