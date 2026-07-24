class Solution {
    public boolean isSameAfterReversals(int num) {
        StringBuilder sb= new StringBuilder();
        sb.append(num);
        int rev1= Integer.parseInt(sb.reverse().toString());
        StringBuilder r= new StringBuilder();
        r.append(rev1);
        int rev2= Integer.parseInt(r.reverse().toString());
        return num==rev2;
    }
}