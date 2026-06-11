class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
     ArrayList<ArrayList<Integer>> list= new ArrayList<>();
     for(int i=0;i<mat.length;i++){
        for(int j=0;j<mat[i].length;j++){
            int diagonal = i+j;
            if(list.size()<=diagonal){
                ArrayList<Integer> temp= new ArrayList<>();
                temp.add(mat[i][j]);
                list.add(temp);
            }
            else{
                ArrayList<Integer> temp= list.get(diagonal);
                temp.add(mat[i][j]);
            }
        }
     }   
     int[] result= new int[mat.length*mat[0].length];
     int idx=0;
     for(int i=0;i<list.size();i++){
        List<Integer> arr= list.get(i);
        if(i%2==0) {
            for(int j=arr.size()-1;j>=0;j--) result[idx++]=arr.get(j);
        }
        else{
        for(int j=0;j<arr.size();j++) result[idx++]=arr.get(j);
        }
     }
     return result;
    }
}