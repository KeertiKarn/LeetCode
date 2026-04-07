class Solution {
    public List<String> stringSequence(String target) {
        List<String> ans= new ArrayList<>();
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<target.length();i++){
            char ch= target.charAt(i);
            char temp= 'a';
            while(temp!=ch){
                ans.add(sb.append(temp).toString());
                sb.deleteCharAt(sb.length() - 1);
                temp++;
            }
            sb.append(ch);
            ans.add(sb.toString()); 
        }
        return ans;
    }
}