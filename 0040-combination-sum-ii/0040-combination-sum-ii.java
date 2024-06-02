class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        
         backtrack (  candidates,  target,  0, new ArrayList<>(),  result);
        
        return result;
        
    }
    
    public void backtrack ( int[] candidates, int remain, int index, List<Integer> tempList, List<List<Integer>> result) {
        
        if ( remain  < 0 ) {
            return;
        }
        
        if ( remain == 0) {
            result.add(new ArrayList<>(tempList));
            return;
        }
        
        for ( int i = index ; i < candidates.length; i++) {
                        if(i > index && candidates[i] == candidates[i-1]) continue;

            tempList.add(candidates[i]);
            backtrack ( candidates, remain - candidates[i] , i + 1, tempList, result);
              tempList.remove ( tempList.size() - 1 );  
        }
        
        
        
    }
}