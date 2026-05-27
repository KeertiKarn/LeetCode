class Solution {
    public int maxDistinct(String s) {
        int[] dis= new int[26];
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int idx= ch-'a';
            dis[idx]++;
        }
        for(int ele: dis){
            if(ele>0) count++;
        }
        return count;
    }
}