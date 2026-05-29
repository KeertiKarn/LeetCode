class Solution {
    public int longestContinuousSubstring(String s) {
      int start=0;
      int end=0;
      int max=0;
      while(end<s.length()){
          while(end<s.length()-1 && s.charAt(end)+1==s.charAt(end+1)) end++;
         max=Math.max(max,end-start+1);
         start=end+1;
         end=start;
      }
      return max;
    }
}