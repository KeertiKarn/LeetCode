class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int fiveper= arr.length*5/100;
        int start=fiveper;
        int end=arr.length-1-fiveper;
        double sum=0;
        double count=0;
        for(int i=start;i<=end;i++){
            sum+=arr[i];
            count++;
        }
        return sum/count;

    }
}