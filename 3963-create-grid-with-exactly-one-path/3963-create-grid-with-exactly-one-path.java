class Solution {
    public String[] createGrid(int m, int n) {
        String[] result= new String[m];
        for(int i=0;i<m;i++){
            StringBuilder sb= new StringBuilder();
            if(i==0) for(int j=0;j<n;j++) sb.append(".");
            else{
                for(int j=0;j<n-1;j++) sb.append("#");
                sb.append(".");
            }
            result[i]= sb.toString();
        }
        return result;
    }
}