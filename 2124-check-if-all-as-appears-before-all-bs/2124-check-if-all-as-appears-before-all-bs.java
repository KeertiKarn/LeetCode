class Solution {
    public boolean checkString(String s) {
        int firstb=-1;
        int lasta=-1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a') lasta=i;
            else if(firstb==-1) firstb=i;
        }
        if(firstb==-1 || lasta==-1) return true;
        return firstb>lasta;
    }
}