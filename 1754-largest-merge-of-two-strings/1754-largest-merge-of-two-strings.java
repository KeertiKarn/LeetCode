class Solution {
    public String largestMerge(String word1, String word2) {
        int i=0;
        int j=0;
        StringBuilder ans= new StringBuilder();
        while(i<word1.length() && j<word2.length()){
            char ch1= word1.charAt(i);
            char ch2= word2.charAt(j);
            if(ch1>ch2){
              ans.append(ch1);
              i++;
            }
            else if(ch2>ch1){
                ans.append(ch2);
                j++;
            }
            else{     //in case both are equal
                if(word1.substring(i).compareTo(word2.substring(j))>0){
                    ans.append(ch1);
                    i++;
                }
                else{
                    ans.append(ch2);
                    j++;
                }
            }
        }
        while(i<word1.length()){
            ans.append(word1.charAt(i));
            i++;
        }
        while(j<word2.length()){
            ans.append(word2.charAt(j));
            j++;
        }
        return ans.toString();
   }
}