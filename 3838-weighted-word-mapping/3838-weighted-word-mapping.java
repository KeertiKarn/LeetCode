class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder ans= new StringBuilder();
        for(String ele:words){
            int sum=0;
            for(int i=0;i<ele.length();i++){
                char ch= ele.charAt(i);
                int idx= ch-'a';
                sum+=weights[idx];
            }
            sum%=26;
            char result= (char)((25-sum)+'a');
            ans.append(result);
        }
        return ans.toString();
    }
}