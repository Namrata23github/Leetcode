class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        
        if(grid[0][0] == 1) {
            return -1;
        }
        
        int m = grid.length;
        int n = grid[0].length;
        
        Queue<int[]> q = new LinkedList();
        
        q.add(new int[] {0, 0, 1}) ;
        grid[0][0] = 1;
            
        while(!q.isEmpty()) {
            int size = q.size();
            
            while(size-- > 0) {
            int[] v = q.poll();
                
                if(v[0] == m-1 && v[1] == n-1 ) {
                    return v[2];
                }
            int[][] dir = {{0,1}, {1,0}, {-1, 0}, {0, -1}, {1, 1}, {-1, -1}, {-1, 1}, {1, -1}};
            
                
            
            for(int[] d : dir) {
                int r = v[0] + d[0];
                int c = v[1] + d[1];
                
                if(r >= 0 && c>=0 && r < m && c < n && grid[r][c]==0) {
                    q.add(new int[] {r, c,v[2]+1 });
                    grid[r][c] = 1;
                }
            }
            
        }
    }
        return -1;
}
}