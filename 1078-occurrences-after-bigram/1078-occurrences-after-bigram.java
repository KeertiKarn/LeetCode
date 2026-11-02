class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String[] arr= text.split("\\s+");
        int i=0;
        List<String> list = new ArrayList<>();
        while(i<arr.length-2){
            String one= arr[i];
            String two= arr[i+1];
            if(one.equals(first) && two.equals(second)) list.add(arr[i+2]);
            i++;
        }
        return list.toArray(new String[0]);
    }
}