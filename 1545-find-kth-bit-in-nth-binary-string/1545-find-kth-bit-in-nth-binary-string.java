class Solution {
    public char findKthBit(int n, int k) {
        String s= helper(n);
        return s.charAt(k-1);
    }
    public String helper(int n){
        if(n==1) return "0";
        return helper(n-1)+"1"+reverse(invert(helper(n-1)));
    }
    public String reverse(String original){
        StringBuilder sb= new StringBuilder(original);
        return sb.reverse().toString();
    }
    public String invert(String original){
        char[] chars = original.toCharArray();
        for (int i = 0; i < chars.length; i++)  chars[i] = (char) (chars[i] ^ 1);
        return new String(chars);
    }
}