class Solution {
    public String maximumTime(String time) {
        StringBuilder ans= new StringBuilder(time);
        for(int i=0;i<time.length();i++){
          char ch= time.charAt(i);
          if(i==0 && ch=='?'){
            if(time.charAt(1)<'4' || time.charAt(1)=='?') ans.setCharAt(i,'2');
            else ans.setCharAt(i,'1');
          }
          else if(i==1 && ch=='?'){
            if(ans.charAt(0)=='2') ans.setCharAt(i,'3');
            else ans.setCharAt(i,'9');
          }
          else if(i==3 && ch=='?'){
            ans.setCharAt(i,'5');
          }
          else if(i==4 && ch=='?'){
            ans.setCharAt(i,'9');
          }
        }
        return ans.toString();
    }
}