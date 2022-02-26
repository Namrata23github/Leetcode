class Solution {
    public int searchInsert(int[] n, int t) {
        int a = 0; int b = n.length -1;
        
        while(a<=b) {
            int m = a + ((b-a)/2);
            
            if(n[m] == t) {
                return m;
            }
           else if(n[m] < t) {
                a = m +1;
            }else {
                b = m -1;
            }
        }
        return a;
        
    }
}