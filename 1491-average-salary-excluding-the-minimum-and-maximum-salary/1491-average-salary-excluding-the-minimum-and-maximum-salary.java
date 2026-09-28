class Solution {
    public double average(int[] salary) {
        double sum=0;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int ele: salary){
            sum+=ele;
            min=Math.min(ele,min);
            max=Math.max(ele,max);
        }
        sum=sum-min-max;
        double n= salary.length-2;
        double result= sum/n;
        return result;
    }
}