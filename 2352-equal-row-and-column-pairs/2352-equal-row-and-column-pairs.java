class Solution {
    public int equalPairs(int[][] grid) {
      HashMap<List<Integer>,Integer> map= new HashMap<>();
      //har row kitni baar aaya h map m add kr lo
      for(int i=0;i<grid.length;i++){
        List<Integer> row= new ArrayList<>();
        for(int j=0;j<grid[0].length;j++){
            row.add(grid[i][j]);
        }
        if(map.containsKey(row)) map.put(row,map.get(row)+1);
        else map.put(row,1);
      }
      //now column check kro exist krta ki nhi agar krta toh kitne pair h
      int count=0;
      for(int j=0;j<grid[0].length;j++){
        List<Integer> col= new ArrayList<>();
        for(int i=0;i<grid.length;i++){
            col.add(grid[i][j]);
        }
        if(map.containsKey(col)) count+= map.get(col);
      }
      return count;

    }
}