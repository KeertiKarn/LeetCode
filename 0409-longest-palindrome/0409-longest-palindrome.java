class Solution {
    public int longestPalindrome(String s) {
      int[] count = new int[128];
      for(char c:s.toCharArray()) {
            count[c]++;
        }
     int len=0;  
     boolean odd=false;
     for(int freq:count){
        if(freq%2==0) len+=freq;
        else{
            odd=true;
            len+=(freq-1);
        }
     }
     if(odd) return len+1;
     return len;
    }
}