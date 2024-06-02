class Solution {
    public int[] searchRange(int[] nums, int target) {
       
        int i = 0;
        int j = nums.length - 1;
        
        int result [] = new int [2];
        result [0] = result[1] = -1;
        
        while ( i <= j ) {
            
            int mid = (i + j) / 2;
            
            if ( nums[mid] == target) {
                
                result [0] = mid;
                result [1] = mid;
                
                while ( mid > 0 && nums[mid] == nums[mid - 1]) {
                    result [0] = mid - 1;
                    mid--;
                }
                
                while ( mid < nums.length - 1  && nums[mid] == nums[mid + 1]) {
                    result [1] = mid + 1;
                    mid++;
                }
                break;
                
            }
            
            else if ( nums[mid] < target) {
                
                i = mid + 1;
                
            } else {
                j = mid - 1;
            }
        }
        
        return result;
        
    }
}