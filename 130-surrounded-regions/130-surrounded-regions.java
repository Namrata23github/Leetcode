class Solution {
    public void solve(char[][] board) {
        int i = 0;
        for ( int j = 0; j < board[0].length; j++) {
            
      if(board[i][j] == 'O') {
          
       board =   dfs(board, i, j);
      }
        
        }
        
        
        
    for ( int j = 0; j < board.length; j++) {
            
      if(board[j][i] == 'O') {
          
         board =  dfs(board, j, i);
      }
        
        }
        
        i = board.length - 1;
        
    for ( int j = 0; j < board[0].length; j++) {
            
      if(board[i][j] == 'O') {
          
        board =  dfs(board, i, j );
      }
        
        }
        
    i = board[0].length - 1;   
        
    for ( int j = 0; j < board.length; j++) {
            
      if(board[j][i] == 'O') {
          
          board = dfs(board, j, i );
      }
        
        }
        
        i = 0;
        for(  ; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(board[i][j] == 'O') {
                    board[i][j] = 'X';
                }
                else if(board[i][j] == '2') {
                     board[i][j] = 'O';
                }
            }
        }
        
       
        
        
    }
    
    
    public char[][] dfs(char[][] board, int i1, int j1) {
               
        
           
               board[i1][j1] = '2';
                Stack<int[]> stack = new Stack();
        stack.push(new int[] {i1, j1});
                
                while(!stack.isEmpty()) {
                    
                   int[] arr =  stack.pop();
                    int i = arr[0];
                    int j = arr[1];
                
                int dir[][] = new int[][] {{1,0}, {-1,0}, {0, 1}, {0,-1}};
                for (int d[] : dir ) {
                    int x = i + d[0];
                     int y = j + d[1];
                                           

                    if(x > 0 && x < board.length && y > 0 && y < board[0].length && board[x][y] == 'O')
                    {
                       
                        stack.push(new int[] {x ,y});
                         board[x][y] = '2';
                        
                        
                    }
                }
                    
                   
            }
        
        return board;
            
    }
    
    
}