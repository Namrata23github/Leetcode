class Solution {
    public List<List<Integer>> subsets(int[] candidates) {
        
        List<List<Integer>> result = new ArrayList<>();
        
         backtrack (  candidates,  result,  0, new ArrayList<>());
        
        return result;
        
    }
    
        public void backtrack ( int[] candidates, List<List<Integer>> result, int index, List<Integer> tempList) {
            
            
        
        if ( index  >  candidates.length) {
            return;
        }
    
            
            result.add(new ArrayList<>(tempList));
        
        for ( int i = index ; i < candidates.length; i++) {
                        

            tempList.add(candidates[i]);
            backtrack ( candidates , result,  i + 1, tempList);
              tempList.remove ( tempList.size() - 1 );  
        }
        
        
        
    }
}