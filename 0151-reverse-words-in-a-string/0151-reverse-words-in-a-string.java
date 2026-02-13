class Solution {
    public String reverseWords(String s) {
        String[] words = s.split("\\s+");
        int i=0;
        int j=words.length-1;
        while(i<j){
            String temp = words[i];
            words[i]=words[j];
            words[j]=temp;
            i++; 
            j--;
        }
        StringBuilder sb = new StringBuilder();
        for(int x=0;x<words.length;x++){
              sb= sb.append(words[x]).append(" ");
        }
        return sb.toString().trim();
    }
}