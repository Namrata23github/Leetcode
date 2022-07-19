class Solution {
    public void solve(char[][] board) {
        
        Stack<int[]> stack = new Stack();
        for(int i = 0; i < board.length; i++) {
            
            
            if(board[i][0] == 'O') {
                board[i][0] = '*';
                stack.push(new int[]{i,0});
                dfs (board, stack);
            }
            
             if(board[i][board[0].length - 1] == 'O') {
                 board[i][board[0].length - 1] = '*';
                stack.push(new int[]{i,board[0].length - 1});
                dfs (board, stack);
            }
            
            
        }
        
           for(int i = 0; i < board[0].length; i++) {
            
            
            if(board[0][i] == 'O') {
                board[0][i] = '*';
                stack.push(new int[]{0,i});
                dfs (board, stack);
            }
            
             if(board[board.length - 1][i] == 'O') {
                 board[board.length - 1][i] = '*';
                stack.push(new int[]{board.length - 1, i});
                dfs (board, stack);
            }
            
            
        }
        
         for(int i = 0; i < board.length; i++) {
             
              for(int j = 0; j < board[0].length; j++) {
                  
                  if(board[i][j] == '*') {
                      board[i][j] = 'O';
                  } else if(board[i][j] == 'O') {
                      board[i][j] = 'X';
                  }
              }
         }
        
        
    }
    
    
    void dfs(char[][] board, Stack<int[]> stack ) {
        
        while(!stack.isEmpty()) {
            int arr[] = stack.pop();
            
            int dir[][] = new int[][] {{1,0}, {-1, 0}, {0,1}, {0,-1}};
            
            for(int d[]: dir) {
                int x = arr[0] + d[0];
                int y = arr[1] + d[1];
                
                if(x > 0 && x < board.length && y > 0 && y < board[0].length && board[x][y] == 'O') {
                    board[x][y] = '*';
                    stack.push(new int[] {x,y});
                }
            }
            
            
        }
    }
}