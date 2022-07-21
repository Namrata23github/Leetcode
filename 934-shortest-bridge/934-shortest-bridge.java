class Solution {
    public int shortestBridge(int[][] grid) {
        
        List<List<int[]>> islands = new ArrayList();
        for(int i = 0; i < grid.length && islands.size() < 2; i++) {
            for(int j = 0; j < grid[0].length && islands.size() < 2; j++) {
                if(grid[i][j] == 1) {
                    List<int[]> island = new ArrayList();
                    dfs(grid, i, j, island);
                    islands.add(island);
                }
            }
        }
        
       List<int[]> island1 = islands.get(0);
        List<int[]> island2 = islands.get(1);
        
        int min = grid.length * grid[0].length;
        for(int[] i1: island1) {
            for(int [] i2 : island2) {
                min = Math.min(min, Math.abs(i2[0] - i1[0]) + Math.abs(i2[1] - i1[1]) - 1 );
            }
        }
        
        return min;
    }
    
    void dfs (int[][] grid, int i, int j, List<int[]> island) {
        
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] != 1) {
            return;
        }
        grid[i][j] = 2;
        island.add(new int[]{i,j});
        dfs(grid, i + 1 , j , island);
        dfs(grid, i , j + 1 , island);
        dfs(grid, i - 1 , j , island);
        dfs(grid, i , j - 1 , island);

    }
}