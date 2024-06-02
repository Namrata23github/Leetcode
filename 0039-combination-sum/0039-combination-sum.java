class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
         List<List<Integer>> result = new ArrayList<>();
            Arrays.sort(candidates);

        
        comb ( candidates, target, result, 0, new ArrayList<>());
        return result;
        
    }
    
    public void comb ( int[] candidates, int target, List<List<Integer>> result, int index, List<Integer> list) {   
        
       if ( target  < 0) {
           
           return;
       }
        
        if ( target  == 0) {
           result.add(new ArrayList<>(list));
            return;
       }
        
        for ( int i = index; i < candidates.length; i++) {
            
            list.add(candidates[i]);
            
            comb ( candidates, target - candidates[i],result, i , list);
            
            
            list.remove(list.size() - 1);
            
            
        }
    }
}