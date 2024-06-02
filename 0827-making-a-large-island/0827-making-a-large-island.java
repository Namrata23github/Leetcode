class Solution {
    public int largestIsland(int[][] grid) {
        
        Map<Character, Integer> map = new HashMap<>();
        char ch = 'A';
        
        for ( int i = 0 ; i < grid.length; i++) {
             for ( int j = 0 ; j < grid[i].length; j++) {
                 
                 if ( grid[i][j] == 1) {
                    
                     dfs (  grid , ch,  map ,  i ,  j );
                         ch = (char)((int)ch + 1);
                 }
                 
             }
        }
        
        int max = 0;
        int size = 0;
        
            for ( int i = 0 ; i < grid.length; i++) {
             for ( int j = 0 ; j < grid[i].length; j++) {
                 
                 if ( grid[i][j] == 0) {
                     
                     HashSet<Character> covered = new HashSet<>();
                     
                     
                     size = 
                         findSize ( grid, i + 1, j, map, covered) + 
                         findSize ( grid, i , j + 1, map, covered) + 
                         findSize ( grid, i - 1, j, map, covered) + 
                         findSize ( grid, i  , j - 1, map, covered);
                     max = Math.max ( max, size);
                 }
                 
                 
             }
        }
        
        return Math.max(max + 1, map.getOrDefault('A', 0) );
        
        
    }
    
    public int findSize (int[][] grid  , int i , int j , Map<Character, Integer> map, HashSet<Character> covered ) {
          if (  i < 0 || j < 0 || i >= grid.length || j >= grid.length || grid[i][j] == 0 || covered.contains((char) grid[i][j])) {
            return 0 ;
        }
        
        
        
         covered.add((char) grid[i][j]);
        return map.get((char)grid[i][j]);
        
        
        
    }
    
    void dfs ( int[][] grid , char ch, Map<Character, Integer> map , int i , int j ) {
        
        if ( i < 0 || j < 0 || i >= grid.length || j >= grid.length || grid[i][j] != 1) {
            return ;
        }
         
           int size = map.getOrDefault(ch,0 ) + 1;
            map.put(ch , size);
        
        
            grid[i][j] = ch;
            
            dfs (grid, ch, map, i + 1, j);
            dfs (grid, ch, map, i, j - 1);
            dfs (grid, ch, map, i , j + 1);
            dfs (grid, ch, map, i - 1, j );
        
        
    }
    
    
}