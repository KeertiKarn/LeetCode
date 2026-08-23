class Solution {
    public boolean sumGame(String num) {
        int leftsum=0;
        int rightsum=0;
        int leftcount=0;
        int rightcount=0;
        for(int i=0;i<num.length();i++){
            int temp= num.charAt(i);
            if(i<num.length()/2){
                if(temp=='?') leftcount++;
                else leftsum+=temp-'0';
            }
            else{
                if(temp=='?') rightcount++;
                else rightsum+=temp-'0';
            }
        }
        return (leftsum-rightsum)*2!=9*(rightcount-leftcount);
    }
}