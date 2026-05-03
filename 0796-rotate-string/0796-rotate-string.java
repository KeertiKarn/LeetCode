class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        StringBuilder temp= new StringBuilder();
        temp.append(s).append(s);
        return temp.indexOf(goal)!=-1;
    }
}