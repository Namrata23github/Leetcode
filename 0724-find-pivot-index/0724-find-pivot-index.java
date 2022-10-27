class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for (int i = 1; i < nums.length ; i++) {
            sum = sum + nums[i];
        }
        
        if(sum==0) {
            return 0;
        }
        
        int s = 0;
        
        for(int i = 1; i < nums.length; i++) {
            sum = sum - nums[i];
            s = s + nums[i-1];
            
            if(sum == s) {
                return i;
            }
        }
        
        return -1;
    }
}