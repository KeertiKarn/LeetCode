class Solution {
    public int dayOfYear(String date) {
        int[] months= {31,28,31,30,31,30,31,31,30,31,30,31};
        int count=0;
        String[] arr= date.split("-");
        int month=Integer.parseInt(arr[1]);
        int day=Integer.parseInt(arr[2]);
        int year=Integer.parseInt(arr[0]);
       if (month>2 && ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))))  count++;
        for(int i=0;i<month-1;i++) count+=months[i];
        count+=day;
        return count;
    }
}