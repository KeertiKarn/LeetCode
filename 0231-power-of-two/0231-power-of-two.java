class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<1) return false;
        if(n==1) return true;
        String binary = Integer.toBinaryString(n);
        int count=0;
        for(int i=0;i<binary.length();i++){
            if(binary.charAt(i)=='1') count++;
            if(count>1) return false;
        }
        return count==1;
    }
}