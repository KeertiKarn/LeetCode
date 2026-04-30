class Solution {
    public boolean validDigit(int n, int x) {
       int[] arr= new int[10];
       int first=0;
       while(n>0){
        int rem=n%10;
        first=rem;
        arr[rem]++;
        n=n/10;
       } 
       if(x!=first && arr[x]!=0) return true;
       return false;
    }
}