class Solution {
    public int islandPerimeter(int[][] grid) {
        Integer result = 0;
        Queue<Integer> q = new LinkedList();
        for(int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 1) {
                   if(i - 1 < 0 || grid[i-1][j] == 0) {
                     //  System.out.println(i + "  " + j);
                       result = result + 1;
                   }
                    if(j - 1 < 0 || grid[i][j - 1] == 0) {
                      //  System.out.println(i + "  " + j);
                       result = result + 1;
                   }
                    
                    if(i+1 >= grid.length || grid[i+1][j] == 0) {
                       // System.out.println(i + "  " + j);
                       result = result + 1;
                   }
                    
                      if(j+1 >= grid[0].length || grid[i][j + 1] == 0) {
                         // System.out.println(i + "  " + j);
                       result = result + 1;
                   }
                }
                
            }
            
          
        }
        
          return result;
    }
}