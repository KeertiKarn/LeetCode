class Solution {
        public int unique(int[] freq){
        int count=0;
        for(int ele: freq){
            if(ele>0) count++;
        }
        return count;
    }
    public boolean isItPossible(String word1, String word2) {
        int[] freq1= new int[26];
        int[] freq2= new int[26];
        for(int i=0;i<word1.length();i++){
            freq1[word1.charAt(i)-'a']++;
        }
        for(int i=0;i<word2.length();i++){
            freq2[word2.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            for(int j=0;j<26;j++){
                if(freq1[i]>0 && freq2[j]>0){
                    //swap kro
                freq1[i]--;
                freq1[j]++;
                freq2[j]--;
                freq2[i]++;
                if(unique(freq1)==unique(freq2)) return true;
                //nhi hua true to reswap kro
                freq1[i]++;
                freq1[j]--;
                freq2[i]--;
                freq2[j]++;
                }
            }
        }
          return false;
    }
}