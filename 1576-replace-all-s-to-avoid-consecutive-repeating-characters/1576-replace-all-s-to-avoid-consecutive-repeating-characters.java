class Solution {
    public String modifyString(String s) {
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<s.length();i++){
          if(s.charAt(i)!='?') sb.append(s.charAt(i));
          else{
          char ch1='.';
          char ch2='.';
          if(i>0) ch1=sb.charAt(i-1);
          if(i<s.length()-1) ch2=s.charAt(i+1);
          if(ch1=='a' && ch2=='b') sb.append('c');
          else if(ch1=='b' && ch2=='a') sb.append('c');
          else if(ch1=='a' && ch2=='a') sb.append('b');
          else if(ch1=='a' || ch2=='a') sb.append('b');
          else sb.append('a');
          }
        }
        return sb.toString();
    }
}