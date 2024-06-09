class Solution {
    public int rob(int[] nums) {
        
      return Math.max ( rob(nums, 0, nums.length - 1) , rob (nums, 1, nums.length ));
    }
    
    public int rob ( int[] nums, int start , int end) {
        
        if ( start > nums.length - 1) {
            return 0;
        }
        
        int prev1 = nums[start];
        int prev2 = 0;
        
        
        
        for ( int i = start + 1; i < end; i++) {
            
            int pick = nums [i] + prev2;
            int notpick = prev1;
            
            int cur = Math.max ( pick, notpick);
            prev2 = prev1;
            prev1 = cur;  
            
        }
        
        return prev1;
    }
    
    
    
}