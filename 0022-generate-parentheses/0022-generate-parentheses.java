class Solution {
        static List<String> ans;
    	public static void p(int open, int close, int n,String s) {
		
		if(s.length()==2*n) {
			ans.add(s);
			return;
		}
		if(open<n) p(open+1,close,n,s+"(");
		if(close<open) p(open, close+1, n,s+")");
		
	}
    public List<String> generateParenthesis(int n) {
        ans=new ArrayList<>();
        p(0,0,n,"");
        return ans;
    }
}