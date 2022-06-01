class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList();
        for(int i = 0; i< nums.length; i++) {
            int abs = Math.abs(nums[i]);

            if(nums[abs-1] < 0) {
                result.add(Math.abs(nums[i]));
            } 
               nums[abs-1] = -nums[abs-1] ; 
            
            
        }
        return result;
    }
}