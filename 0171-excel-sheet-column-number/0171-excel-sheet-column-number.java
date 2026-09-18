class Solution {
    public int titleToNumber(String columnTitle) {
       int n= columnTitle.length();
       int num=0;
       for(int i=0;i<n;i++){
        char ch= columnTitle.charAt(i);
        num= num*26+(ch-'A'+1);
       } 
       return num;
    }
}