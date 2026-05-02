class Solution {
    public boolean checkIfCanBreak(String s1, String s2) {
        char[] arr= s1.toCharArray();
        char[] brr= s2.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(brr);
        boolean case1= true;
        boolean case2=true;
        //checking if s1 break s2
        for(int i=0;i<s1.length();i++){
            if(arr[i]<brr[i]){
                case1=false;
                break;
            }
        }
        //checking if s2 break s1
        for(int i=0;i<s2.length();i++){
            if(arr[i]>brr[i]){
                case2=false;
                break;
            }
        }
        return case1||case2;

    }
}