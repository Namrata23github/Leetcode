class Solution {
    
     List<List<Integer>> a = new ArrayList();
        List<Integer> b = new ArrayList();
    public List<List<Integer>> subsets(int[] nums) {
     
    
        subsets( nums, 0);
        return a;
        
    }
    
    void subsets( int[] nums, int in) {
        a.add(new ArrayList(b));
        for(int i = in; i< nums.length; i++) {
            b.add(nums[i]);
             subsets( nums, i+1);
            b.remove(b.size() - 1);
        }
    }
    
    
}