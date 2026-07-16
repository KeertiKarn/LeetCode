class Solution {
    public long gcdSum(int[] nums) {
        int max=Integer.MIN_VALUE;
        int[] prefixGcd= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            max=Math.max(nums[i],max);
            prefixGcd[i]=gcd(nums[i],max);
        }
        Arrays.sort(prefixGcd);
        int i=0;
        int j=prefixGcd.length-1;
        long sum=0;
        while(i<j){
            int temp=gcd(prefixGcd[i],prefixGcd[j]);
            sum+=temp;
            i++;
            j--;
        }
        return sum;
    }
    public int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}