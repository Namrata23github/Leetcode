class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
      for(int l = 0; l < matrix.length; l++) {  
        for(int k = 0; k < matrix[0].length; k++) {
            
            int i = l+1;
            int j = k + 1;
            
           
        while ( i < matrix.length && j < matrix[0].length) {
             
            if(matrix[l][k] != matrix[i++][j++] ) {
               
                return false;
            }
            
        }
        }
      }
        
               
       
        return true;
    }
}