class Solution {
    public int climbStairs(int n) {
        return climb (  n, new int[n + 1] );
    }

    public int climb ( int n, int[] dp ) {

       

        if ( n < 0) {
            return 0;
        }

        if ( n == 0) {
            return 1;
        } 

         if(dp[n] != 0) {
            return dp[n];
        }

        dp[n] =  climb ( n - 1, dp) + climb ( n - 2, dp);
        return dp[n];
    }
}