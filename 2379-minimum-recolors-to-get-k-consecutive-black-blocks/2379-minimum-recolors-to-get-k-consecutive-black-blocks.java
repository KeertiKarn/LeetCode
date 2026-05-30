class Solution {
    public int minimumRecolors(String blocks, int k) {
      int start=0;
      int end=0;
      int count=0;
      int ans=0;
      while(end<k){
          if(blocks.charAt(end)=='W') count++;
          end++;
      }  
      ans=count;
      while(end<blocks.length()){
        if(blocks.charAt(start)=='W') count--;
        start++;
        if(blocks.charAt(end)=='W') count++; 
        end++;
        ans= Math.min(count,ans);
      }
      return ans;
    }
}