class Solution {
    public String truncateSentence(String s, int k) {
        String[] temp= s.split("\\s+");
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<k;i++){
            sb.append(temp[i]);
            if(i<k-1) sb.append(" ");
        }
        return sb.toString();
    }
}