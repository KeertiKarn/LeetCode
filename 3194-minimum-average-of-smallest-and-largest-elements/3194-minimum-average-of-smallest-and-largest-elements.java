class Solution {
    public double minimumAverage(int[] nums) {
        double[] arr= new double[nums.length/2];
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        int k=0;
        while(i<j){
            double avg= (nums[i]+nums[j])/2.0;
            arr[k]=avg;
            k++;
            i++;
            j--;
        }
        double min=Double.MAX_VALUE;
        for(double ele: arr) min=Math.min(min,ele);
        return min;
    }
}