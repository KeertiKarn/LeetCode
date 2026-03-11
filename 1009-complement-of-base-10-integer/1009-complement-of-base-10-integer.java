class Solution {
    public int bitwiseComplement(int n) {
        String binary= Integer.toBinaryString(n);
        StringBuilder comp= new StringBuilder();
        for(int i=0;i<binary.length();i++){
            if(binary.charAt(i)=='1') comp.append('0');
            else comp.append('1');
        }
        int ans = Integer.parseInt(comp.toString(), 2);
        return ans;
    }
}