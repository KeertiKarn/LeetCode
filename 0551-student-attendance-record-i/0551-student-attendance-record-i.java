class Solution {
    public boolean checkRecord(String s) {
        int countA=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A') countA++;
            if(countA>=2) return false;
        }
        int i=0;
        if(s.length()<3) return true;
        while(i<s.length()-2){
            char ch1= s.charAt(i);
            char ch2= s.charAt(i+1);
            char ch3= s.charAt(i+2);
            if(ch1=='L' && ch2=='L' && ch3=='L') return false;
            i++;
        }
        return true;
    }
}