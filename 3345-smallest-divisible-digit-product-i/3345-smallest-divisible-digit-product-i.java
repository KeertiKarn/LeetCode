class Solution {
    public int smallestNumber(int n, int t) {
        int num=productofDigit(n);
        while(num%t!=0){
            n++;
            num=productofDigit(n);
        }
        return n;
    }
    public int productofDigit(int n){
        int prod=1;
        while(n>0){
            prod*=n%10;
            n/=10;
        }
        return prod;
    }
}