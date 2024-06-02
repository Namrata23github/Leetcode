class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        
   List<List<Integer>> result = new ArrayList<>();
        
        
         backtrack (  k, n, result,  1, new ArrayList<>(), 0);
        
        return result;
        
    }
    
        public void backtrack ( int k, int n, List<List<Integer>> result, int index, List<Integer> tempList, int sum) {
            
    
            if (sum == n && tempList.size() == k) {
                result.add(new ArrayList<>(tempList));
            }
            
         if ( index  >  9 || tempList.size() > k || sum > n) {
            return;
        }
            
        for ( int i = index ; i < 10; i++) {
            
            tempList.add(i);
            sum = sum + i;
            backtrack ( k ,n , result,  i + 1, tempList, sum);
            tempList.remove ( tempList.size() - 1 );  
            sum = sum - i;
        }
        }
}