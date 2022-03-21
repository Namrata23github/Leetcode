class Solution {
    public int climbStairs(int n) {
        
        Map<Integer, Integer> m = new HashMap();
        
         climb(m, n);
        return m.get(n);
    }
    
    public int climb (Map<Integer, Integer> m, int n) {
        if(n < 0) {
            return 0;
        }
        
        if(n==0) {
            return 1;
        }
    
        int n1;
        if(m.containsKey(n-1)) {
            n1 = m.get(n-1);
        }else {
            n1 = climb(m, n-1);
        }
        
        int n2;
        if(m.containsKey(n-2)) {
            n2 = m.get(n-2);
        }else {
            n2 = climb(m, n-2);
        }
        
        
        
        m.put(n ,n1  + n2);
        return m.get(n);
    }
    
}