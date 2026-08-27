class Solution {
    public void duplicateZeros(int[] arr) {
        int[] result= new int[arr.length];
        int i=0;
        int j=0;
        while(i<result.length){
            if(arr[j]!=0) {
            result[i]=arr[j];
            i++;
            j++;
            }
            else{
                result[i]=0;
                i++;
                if(i<result.length) result[i]=0;
                i++;
                j++;
            }
        }
        for(i=0;i<result.length;i++){
            arr[i]=result[i];
        }
    }
}