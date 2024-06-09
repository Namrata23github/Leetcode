class Solution {
    public int rob(int[] nums) {
        
        int prev1 = nums[0];
        int prev2 = 0;
        
        
        
        for ( int i = 1 ; i < nums.length; i++) {
            
            int pick = nums [i] + prev2;
            int notpick = prev1;
            
            int cur = Math.max ( pick, notpick);
            prev2 = prev1;
            prev1 = cur;
            
            
        }
        
        return prev1;
      
        // return rob ( nums, 0, new int[nums.length]);
        
    }
    
    
    public int rob ( int[] nums, int index, int mem[]) {
        
       
        if ( index >= nums.length) {
            return 0;
        }
        
         if ( mem[index] != 0) {
            return mem[index];
        }
        
        int pick  = nums[index] + rob ( nums, index + 2, mem);
        int notpick = rob ( nums, index + 1, mem);
        
    
        
        mem[index] =  Math.max ( pick, notpick);
        return mem[index];
    }
}