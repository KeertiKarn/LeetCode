class Solution {
    public int totalWaviness(int num1, int num2) {
        int count=0;
        for(int i=num1;i<=num2;i++){
            count+= isWavy(i);
        }
        return count;
    }
    public int isWavy(int n){
        if(n<100) return 0;
        int waviness=0;
        String num=  String.valueOf(n);
        for(int i=1;i<num.length()-1;i++){
          char a= num.charAt(i-1);
          char b= num.charAt(i);
          char c= num.charAt(i+1);
          if(a<b && b>c) waviness++;
          else if(a>b && b<c) waviness++;
        } 
        return waviness;
    }
}