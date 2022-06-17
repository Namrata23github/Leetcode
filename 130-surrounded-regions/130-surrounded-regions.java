class Solution {
    public void solve(char[][] board) {
        
        int [][] ds = {{1,0}, {0,1}, {-1,0}, {0, -1}};
        Stack<int[]> s = new Stack();
        
        for(int i = 0; i< board.length; i++) {
         
            
            if(board[i][0] == 'O') {
                  //System.out.println( "*****1******" );
                s.push(new int[] { i, 0});
                dfs(board, s);
            }
            
               if(board[i][board[0].length - 1] == 'O') {
                                    // System.out.println( "*****2******" );

                s.push(new int[] { i, board[0].length - 1});
                dfs(board, s);
            }
            
            
           
        }
        
         for(int i = 0; i< board[0].length; i++) {
                             

                if(board[0][i] == 'O' ) {
                      //System.out.println( "*****3******" );
                s.push(new int[] { 0, i});
                    dfs(board, s);
                }
                
            
             
               if(board[board.length - 1][i] == 'O') {
                    // System.out.println( "*****4******" );
                s.push(new int[] { board.length - 1, i});
                dfs(board, s);
            }
         }
        
        
         for(int i = 0; i< board.length; i++) {
             for(int j = 0; j< board[0].length; j++) {
                if(board[i][j] == '1') {
                    //System.out.println(i + " " + j + "   1" );
                    board[i][j] = 'O';
                }
                 
                 else if(board[i][j] == 'O') {
                                        // System.out.println(i + " " + j + "   0" );

                     board[i][j] = 'X';
                 }
             }
         }
        
    }
    
    
    void dfs(char[][] board, Stack<int[]> s) {
        
        int[][] ds = {{1,0}, {0,1}, {-1, 0}, {0, -1}};
        
        while(!s.isEmpty()) {
            int[] v = s.pop();
            board[v[0]][v[1]] = '1';
             //System.out.println( v[0] + " "  + v[1] );
             
            for(int[] d : ds) {
                int r = v[0] + d[0];
                int c = v[1] + d[1];
                
                if(r >= 0 && r < board.length && c >= 0 && c < board[0].length && board[r][c] == 'O') {
                   
                    s.push(new int[] { r, c});
                }
            }
        }
        
         //System.out.println( "***********" );
    }
}