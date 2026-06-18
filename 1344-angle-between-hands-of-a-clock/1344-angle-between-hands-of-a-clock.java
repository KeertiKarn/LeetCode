class Solution {
    public double angleClock(int hour, int minutes) {
        double degree1= 0.5*(Math.abs(60*hour-11*minutes));
        double degree2= Math.abs(360-degree1);
        return Math.min(degree1,degree2);
    }
}