class Solution {
    public boolean canJump(int[] nums) {
        int lastGoodIndPos =nums.length -1 ;
        
        for(int i = nums.length -2; i>=0; i--) {
            if(nums[i] + i >=lastGoodIndPos) {
                lastGoodIndPos = i;
            }
        }
        return lastGoodIndPos == 0; 
    }
}