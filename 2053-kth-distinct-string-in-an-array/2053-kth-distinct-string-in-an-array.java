class Solution {
    public String kthDistinct(String[] arr, int k) {
       HashMap<String,Integer> map= new HashMap<>();
       for(String ele:arr){
        if(map.containsKey(ele)) map.put(ele,map.get(ele)+1);
        else map.put(ele,1);
       } 
       for(int i=0;i<arr.length;i++){
        if(map.get(arr[i])==1){
         k--;
         if(k==0) return arr[i];   
        }
       }
       return "";
    }
}