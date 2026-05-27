class Solution {
    public int reverseDegree(String s) {
        int sum=0;
       for(int i=0;i<s.length();i++){
        int val= (int)s.charAt(i);
        int a= 123-val;
        sum+=a*(i+1);
       } 
       return sum;
    }
}