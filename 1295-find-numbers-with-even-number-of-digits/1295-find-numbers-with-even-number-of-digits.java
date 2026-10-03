class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int ele: nums){
            int dig=0;
            while(ele>0){
                dig++;
                ele/=10;
            }
            if(dig%2==0) count++;
        }
        return count;
    }
}