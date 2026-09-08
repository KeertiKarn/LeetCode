class Solution {
    public int maxPower(String s) {
        int[] pow= new int[s.length()];
        pow[0]=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)) pow[i]=pow[i-1]+1;
            else pow[i]=1;
        }
        int max=Integer.MIN_VALUE;
        for(int ele: pow) max=Math.max(ele,max);
        return max;
    }
}