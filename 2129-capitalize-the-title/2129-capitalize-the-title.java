class Solution {
    public String capitalizeTitle(String title) {
        String[] arr= title.toLowerCase().split("\\s+");
        for(int i=0;i<arr.length;i++){
            StringBuilder temp= new StringBuilder();
            temp.append(arr[i]);
            if(temp.length()>2) temp.setCharAt(0,(char)(temp.charAt(0)-32));
            arr[i]= temp.toString();
        }
       return String.join(" ", arr);
    }
}