class Solution {
    public String toGoatLatin(String sentence) {
        String[] words= sentence.split("\\s+");
        StringBuilder ans= new StringBuilder();
        for(int i=0;i<words.length;i++){
            StringBuilder sb= new StringBuilder();
            sb.append(words[i]);
            char ch= words[i].charAt(0);
            if(!isVowel(ch)){
                sb.deleteCharAt(0);
                sb.append(ch);
            }
            sb.append("ma");
            for(int j=0;j<i+1;j++) sb.append("a");
            ans.append(sb);
            if(i<words.length-1) ans.append(" ");
        }
        return ans.toString();
    }
    public boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') return true;
        if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') return true;
        return false;
    }
}