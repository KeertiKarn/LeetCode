class Solution {
    public boolean isFascinating(int n) {
        int one= 2*n;
        int two= 3*n;
        StringBuilder ans= new StringBuilder();
        ans.append(n).append(one).append(two);
        HashSet<Character> set= new HashSet<>();
        for(int i=0;i<ans.length();i++){
            if(set.contains(ans.charAt(i))) return false;
            if(ans.charAt(i)=='0') return false;
            set.add(ans.charAt(i));
        }
        return set.size()==9;

    }
}