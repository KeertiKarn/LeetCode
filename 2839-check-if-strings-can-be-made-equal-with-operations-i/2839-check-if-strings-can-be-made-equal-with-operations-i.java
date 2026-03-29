class Solution {
    public boolean canBeEqual(String s1, String s2) {
        if(s1.equals(s2)) return true;

       StringBuilder temp1= new StringBuilder();
       temp1.append(s1.charAt(2)).append(s1.charAt(1)).append(s1.charAt(0)).append(s1.charAt(3));
       StringBuilder temp2= new StringBuilder();
       temp2.append(s1.charAt(0)).append(s1.charAt(3)).append(s1.charAt(2)).append(s1.charAt(1));
       StringBuilder temp5= new StringBuilder();
       temp5.append(s1.charAt(2)).append(s1.charAt(3)).append(s1.charAt(0)).append(s1.charAt(1));

       if(temp1.toString().equals(s2) || temp2.toString().equals(s2) ||temp5.toString().equals(s2)) return true;

       StringBuilder temp3= new StringBuilder();
       temp3.append(s2.charAt(2)).append(s2.charAt(1)).append(s2.charAt(0)).append(s2.charAt(3));
       StringBuilder temp4= new StringBuilder();
       temp4.append(s2.charAt(0)).append(s2.charAt(3)).append(s2.charAt(2)).append(s2.charAt(1));
       StringBuilder temp6= new StringBuilder();
       temp6.append(s2.charAt(2)).append(s2.charAt(3)).append(s2.charAt(0)).append(s2.charAt(1));

       if(temp3.toString().equals(s1) || temp4.toString().equals(s1) || temp6.toString().equals(s1)) return true;
     
       if(temp1.toString().equals(temp3.toString()) ||temp1.toString().equals(temp4.toString()) || temp1.toString().equals(temp6.toString())) return true;
       if(temp2.toString().equals(temp3.toString()) ||temp2.toString().equals(temp4.toString()) ||temp2.toString().equals(temp6.toString())) return true;
        if(temp5.toString().equals(temp3.toString()) ||temp5.toString().equals(temp4.toString()) ||temp5.toString().equals(temp6.toString())) return true;
       return false;
    }
}