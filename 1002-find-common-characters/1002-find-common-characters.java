class Solution {
    public List<String> commonChars(String[] words) {
        int[] minFreq= new int[26];
        Arrays.fill(minFreq,Integer.MAX_VALUE);
        for(String word:words){
            int[] freq= new int[26];
            for(int i=0;i<word.length();i++){
                int idx=word.charAt(i)-'a';
                 freq[idx]++;
            }
            for(int i=0;i<26;i++){
                minFreq[i]=Math.min(minFreq[i],freq[i]);
            }
        }
        List<String> ans= new ArrayList<>();
        for(int i=0;i<26;i++){
             while(minFreq[i]>0){
                ans.add(String.valueOf((char)(i+'a')));
                minFreq[i]--;
            }
        }
        return ans;
    }
}