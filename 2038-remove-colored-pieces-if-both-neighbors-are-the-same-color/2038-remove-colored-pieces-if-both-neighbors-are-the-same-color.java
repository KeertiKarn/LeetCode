class Solution {
    public boolean winnerOfGame(String colors) {
       int countA=0;
       int countB=0;
       for(int i=1;i<colors.length()-1;i++){
        char left= colors.charAt(i-1);
        char right=colors.charAt(i+1);
        char curr= colors.charAt(i);
        if(left==right && curr=='A' && curr==left ) countA++;
        else if(left==right && curr=='B' && curr==left) countB++;
       } 
       return countA>countB;
    }
}