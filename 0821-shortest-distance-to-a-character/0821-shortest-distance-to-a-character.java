class Solution {
    public int[] shortestToChar(String s, char c) {
        int[] arr= new int[s.length()];
        int prev=Integer.MIN_VALUE;
        int next=0;
        int j=0;
        int i=0;
        while(i<s.length()){
            while(j<s.length() && s.charAt(j)!=c) j++;
            next=j;
            while(i<next){
                if(prev==Integer.MIN_VALUE) arr[i]=next-i;
                else if(next>=s.length()) arr[i]=i-prev;
                else arr[i]=Math.min((i-prev),(next-i));
                i++;
            }
            prev=next;
            j++;
        }
        return arr;
    }
}