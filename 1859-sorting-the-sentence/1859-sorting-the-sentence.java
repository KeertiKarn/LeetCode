class Solution {
    public String sortSentence(String s) {
        String[] arr= s.split("\\s+");
        Arrays.sort(arr,(a,b)->Character.compare(a.charAt(a.length() - 1), b.charAt(b.length() - 1)));
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i].substring(0,arr[i].length()-1);
        }
        return String.join(" ", arr);
    }
}