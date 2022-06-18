class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        List<Integer> rows = new ArrayList<>();
        List<Integer> columns = new ArrayList<>();
        
        
        //search for row
        for(int i = 0; i < matrix.length; i++) {
            if(matrix[i][0] == target || matrix[i][matrix[0].length - 1] == target) {
                return true;
            } else if(matrix[i][0] < target && matrix[i][matrix[0].length - 1] > target) {
                rows.add(i);
            }
        }
        
        
        
          //search for coloums
        
       // System.out.println(matrix[0].length + " " + matrix[0][0] + " " +  matrix[matrix[0].length - 1][0]);
        for(int i = 0; i < matrix[0].length; i++) {
            if(matrix[0][i] == target || matrix[matrix.length - 1][i] == target) {
                return true;
            } else if(matrix[0][i] < target && matrix[matrix.length - 1][i] > target) {
                columns.add(i);
            }
        }
        
        for(Integer row: rows) {
            for (Integer column: columns) {
                if(matrix[row][column] == target) {
                    return true;
                }
            }
        }
        return false;
    }
}