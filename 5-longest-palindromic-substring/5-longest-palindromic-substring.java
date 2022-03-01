class Solution {
    public String longestPalindrome(String s) {
       int l= s.length();
        boolean a[][] =new boolean[l][l];
        int maxLength = 1; 
        int start = 0;
        
        for (int i = 0; i < l; ++i)
            a[i][i] = true;
    
        for(int i=0; i<l-1; i++) {
    
        boolean val =    s.charAt(i) == s.charAt(i+1);
                  a[i][i+1] =val ;    
                if(val) {
                    maxLength =2;
                    start = i;
                
              
            }
        }
        
      for (int k = 3; k <= l; ++k) {
 
            for (int i = 0; i < l - k + 1; ++i) {
                
                int j = i + k - 1;
 
               
                if (a[i + 1][j - 1]
                    && s.charAt(i) == s.charAt(j)) {
                    a[i][j] = true;
 
                    if (k > maxLength) {
                        start = i;
                        maxLength = k;
                    }
                }
            }
        }
    
        return s.substring(start, start + maxLength);
    }
}