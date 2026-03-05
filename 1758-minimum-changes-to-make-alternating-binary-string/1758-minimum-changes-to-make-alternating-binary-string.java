class Solution {
    public int minOperations(String s) {
        StringBuilder s1=  new StringBuilder("0");
        StringBuilder s2= new StringBuilder("1");
        for(int i=1;i<s.length();i++){
            if(i%2!=0) {
                s1.append("1");
                s2.append("0");
        }
        else{
            s1.append("0");
            s2.append("1");
        }
    }
    int count1=0;
    int count2=0;
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)!=s1.charAt(i)) count1++;
        if(s.charAt(i)!=s2.charAt(i)) count2++;
    }
    return Math.min(count1,count2);
}
}