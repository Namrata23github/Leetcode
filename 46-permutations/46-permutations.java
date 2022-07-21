class Solution {
    
    List<List<Integer>> result = new ArrayList();

    public List<List<Integer>> permute(int[] nums) {
        backTrack(new ArrayList(), nums);
        return result;
    }
    
    public void backTrack (List<Integer> list, int[] nums) {
       
        if(list.size() == nums.length) {
            result.add(new ArrayList(list));
        }
        
        for(int i = 0; i < nums.length; i++) {
            if(list.contains(nums[i]))
            {
                continue;
            }
            
            
            list.add(nums[i]);
       
            backTrack(list, nums);
            list.remove(list.size()-1);
        }
    }
}