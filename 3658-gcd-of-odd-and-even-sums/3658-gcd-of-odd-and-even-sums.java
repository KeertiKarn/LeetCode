class Solution {
    public int gcdOfOddEvenSums(int n) {
        int EvenSum= n*(n+1);
        int OddSum= n*n;
        int result= gcd(EvenSum,OddSum);
        return result;
    }
    public int gcd(int a,int b){
        while(b!=0){
            int temp= b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}