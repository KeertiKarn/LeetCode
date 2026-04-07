class Solution {
    public String reverseWords(String s) {
       String[] temp= s.split("\\s+"); 
       for(int i=0;i<temp.length;i++){
        StringBuilder t= new StringBuilder(temp[i]);
          temp[i]= t.reverse().toString();
       }
       StringBuilder sb= new StringBuilder();
       for(int i=0;i<temp.length;i++){
        if(i!=temp.length-1) sb.append(temp[i]+" ");
        else sb.append(temp[i]);
       }
       return sb.toString();
    }
   
}