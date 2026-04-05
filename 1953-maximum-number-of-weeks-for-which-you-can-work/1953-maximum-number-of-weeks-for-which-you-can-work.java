class Solution {
    public long numberOfWeeks(int[] milestones) {
       long sum=0;
       long max=0;
       for(int n: milestones){
        sum += n;
        if(n>max) max=n;
       } 
       sum -=max;
       if(max>sum+1) return 2*sum+1;
       return sum+max;
    }
}