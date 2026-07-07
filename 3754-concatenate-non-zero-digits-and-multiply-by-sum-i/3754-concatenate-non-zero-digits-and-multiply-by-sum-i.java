class Solution {
    public long sumAndMultiply(int n) {
       long num=0;
       while(n>0){
        int dig=n%10;
        if(dig!=0) num=num*10+dig;
        n/=10;
       } 
       long x=0;
       while(num>0){
        long dig=num%10;
        x=x*10+dig;
        num/=10;
       }
       long sum=0;
       long temp=x;
       while(temp>0){
        sum+=temp%10;
        temp/=10;
       }
       return x*sum;
    }
}