class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int product=1;
        int num=n;
        while(n>0){
            int temp=n%10;
            sum+=temp;
            product*=temp;
            n/=10;
        }
        return num%(sum+product)==0;
    }
}