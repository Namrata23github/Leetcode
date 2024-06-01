class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        
        if( arr.length == 0) {
            return 0;
        }
       
       return maxSum( arr, k, 0, new int[arr.length]);
        
      
    }
    
    public int maxSum ( int[] arr, int k  ,int index, int dp[]) {
        
       
        
        if ( index == arr.length) {
            return 0;
        }
        
         if ( dp[index] != 0) {
            
            return dp[index];
        }
        
        
        int maxi = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        
        int l = 0;
        
         for ( int i = index; i < Math.min( index + k , arr.length); i++) {
             l++;
             
             maxi = Math.max ( maxi, arr[i]);
             
            
             int sum =   l * maxi + maxSum ( arr, k, i + 1, dp);
             max = Math.max(max , sum);
             
             
             
             
         }
        
        dp[index ] = max;
        
        return max;
    }
    
    
}