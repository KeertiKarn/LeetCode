class Solution {
    public int numberOfBeams(String[] bank) {
      ArrayList<Integer> list= new ArrayList<>();
      for( String ele: bank){
        int count=0;
        for(int i=0;i<ele.length();i++){
            if(ele.charAt(i)=='1') count++;
        }
        if(count!=0){
           list.add(count);
        }
      }  
      int result=0;
      for(int i=0;i<list.size()-1;i++){
        result+=list.get(i)*list.get(i+1);
      }
      return result;
    }
}