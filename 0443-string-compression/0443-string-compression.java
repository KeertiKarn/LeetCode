class Solution {
    public int compress(char[] chars) {
        if(chars.length<=1) return chars.length;
        StringBuilder ans= new StringBuilder();
        int i=0;
        while(i<chars.length-1){
            ans.append(chars[i]);
            if(chars[i]!=chars[i+1]) i++;
            else{
            int j=i+1;
            int count=1;
            while(j<chars.length && chars[i]==chars[j]){
              count++;
              j++;
            } 
            ans.append(""+count);
            i=j;
            
            }
          }
          if(i<chars.length && chars[i]!=chars[i-1]) ans.append(chars[i]); 
          for(int j=0;j<ans.length();j++){
            chars[j]=ans.charAt(j);
          }
          
          return ans.length();
    }
}