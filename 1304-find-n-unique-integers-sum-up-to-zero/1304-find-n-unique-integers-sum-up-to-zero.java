class Solution {
    public int[] sumZero(int n) {
        
        int na[] = new int[n];
         int a = 0;
            int ii = 0;
        if(n%2!=0) {
           
           na[ii] = a;
                   ++ii;
        }
 
        for(int i = ii; i< n; i++) {
                a = a+1;
                na[i] = a;

                na[++i] = a * -1;
            }
         return na;
    }
}