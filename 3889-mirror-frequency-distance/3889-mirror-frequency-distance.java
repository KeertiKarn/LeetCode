class Solution {
    public int mirrorFrequency(String s) {
        int[] alphabet= new int[26];
        int[] num=new int[10];
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))) alphabet[s.charAt(i)-'a']++;
            else num[s.charAt(i)-'0']++;
        }
        int sum=0;
        int j=alphabet.length-1;
        int i=0;
        while(i<=j){
         int diff=Math.abs(alphabet[i]-alphabet[j]);
         sum+=diff;
         i++;
         j--;
        }
        i=0;
         j=num.length-1;
        while(i<=j){
         int diff=Math.abs(num[i]-num[j]);
         sum+=diff;
         i++;
         j--;
        }
        return sum;
    }
}