class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
       List<List<Integer>> result = new ArrayList();
       List<Integer> list = new ArrayList();
       boolean[] freq  = new boolean[nums.length];
        
       per(nums, result, list, freq); 
        return result;
    }
    
     void per(int[] nums, List<List<Integer>> result, List<Integer> list, boolean[] freq) {
         
         if(list.size() == nums.length) {
            result.add(new ArrayList<>(list));
             return;
         }
         
         for(int i = 0; i < nums.length; i++) {
             
             if(!freq[i]) {
                 freq[i] = true;
                 list.add(nums[i]);
                 per(nums, result, list, freq); 
                 freq[i] = false;
                 list.remove(list.size()-1);
             }
         }
     }
}