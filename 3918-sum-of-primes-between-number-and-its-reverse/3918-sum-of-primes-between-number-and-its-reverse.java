class Solution {
    public int sumOfPrimesInRange(int n) {
        int reverse=0;
        int num=n;
        while(n>0){
           int digit=n%10;
           reverse=reverse*10+digit;
           n=n/10;
        }
        int sum=0;
        for(int i=Math.min(reverse,num);i<=Math.max(reverse,num);i++){
            if(isPrime(i)) sum+=i;
        }
        return sum;
    }
    public boolean isPrime(int n){
        if(n==1||n==0) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
}