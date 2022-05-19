class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> a = new ArrayList();
        List<Integer> b = new ArrayList();
        
        subsets(a, b, nums, 0);
        return a;
        
    }
    
    void subsets(List<List<Integer>> a, List<Integer> b, int[] nums, int in) {
        a.add(new ArrayList(b));
        for(int i = in; i< nums.length; i++) {
            //System.out.println(nums[i]);
            b.add(nums[i]);
             subsets(a, b, nums, i+1);
            b.remove(b.size() - 1);
        }
    }
    
    
}