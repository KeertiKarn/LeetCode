class Solution {
    public int minimumPushes(String word) {
       int[] freq= new int[26];
       for(int i=0;i<word.length();i++){
        freq[word.charAt(i)-'a']++;
       }
       Arrays.sort(freq);
       int res=0;
       int mul=1;
       int count=8;
       for(int i=25;i>=0;i--){
        if(freq[i]!=0) {
            res+=mul*freq[i];
           count--;
        }
        if(count==0){
            count=8;
            mul++;
        }
       }
      return res;
      
       } 
    }
