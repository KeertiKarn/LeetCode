class Solution {
    public boolean isDigitorialPermutation(int n) {
        int[] fac= new int[10];
        int[] arr= new int[10];
        int[] brr= new int[10];
        fac[0]=1;
        fac[1]=1;
        for(int i=2;i<10;i++) fac[i]=i*fac[i-1];
        int sum=0;
        while(n>0){
            int digit= n%10;
            sum+=fac[digit];
            arr[digit]++;
            n=n/10;
        }
        while(sum>0){
            int digit=sum%10;
            brr[digit]++;
            sum=sum/10;
        }
        return Arrays.equals(arr,brr);
    }
}