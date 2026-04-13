class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        int max= Integer.MIN_VALUE;
        arr[0]=1;
        int i=1;
        while(i<arr.length){
            if(arr[i]-arr[i-1]!=0 && arr[i]-arr[i-1]!=1) arr[i]=arr[i-1]+1;
            i++;
        }
        return arr[arr.length-1];
    }
}