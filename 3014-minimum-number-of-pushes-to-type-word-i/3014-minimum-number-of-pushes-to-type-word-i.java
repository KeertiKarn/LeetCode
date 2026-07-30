class Solution {
    public int minimumPushes(String word) {
        int mul=1;
        int res=0;
        int count=8;
        int i=0;
        while(i<word.length()){
          while(count>0 && i<word.length()){
            res+=mul;
            count--;
            i++;
          }
          count=8;
          mul++;
        }
        return res;
    }
}