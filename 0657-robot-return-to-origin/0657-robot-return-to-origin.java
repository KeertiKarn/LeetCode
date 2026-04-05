class Solution {
    public boolean judgeCircle(String moves) {
        int lr=0;
        int ud=0;
        for(int i=0;i<moves.length();i++){
            Character ch = moves.charAt(i);
            if(ch=='L') lr++;
            else if(ch=='R') lr--;
            else if(ch=='U') ud++;
            else if(ch=='D') ud--;
        }
        return (lr==0&&ud==0);
    }
}