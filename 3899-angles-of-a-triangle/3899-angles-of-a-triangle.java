class Solution {
    public double[] internalAngles(int[] sides) {
        if(sides[0]+sides[1]<=sides[2]) return new double[0];
        if(sides[1]+sides[2]<=sides[0]) return new double[0];
        if(sides[2]+sides[0]<=sides[1]) return new double[0];
        int a= sides[0];
        int b= sides[1];
        int c= sides[2];
        double val1= (b*b+c*c-a*a)/(2.0*b*c);
        double val2= (c*c+a*a-b*b)/(2.0*c*a);
        double val3= (a*a+b*b-c*c)/(2.0*a*b);
        double[] ans= new double[3];
        double r1 = Math.acos(val1);
        ans[0] = Math.toDegrees(r1);
        double r2 = Math.acos(val2);
        ans[1] = Math.toDegrees(r2);
        double r3 = Math.acos(val3);
        ans[2] = Math.toDegrees(r3);
        Arrays.sort(ans);
        return ans;

    }
}