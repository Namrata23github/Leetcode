class Solution {
    public int countSubstrings(String s) {
        
        Map<String, Boolean> map = new HashMap<>();
        int result = 0;
        
        for ( int i = 0 ; i < s.length() ; i++) {
           result = result +  count ( s, i, "", map);
        }
        
        return result;
        
    }
    
    public int count ( String s, int ind, String r, Map<String, Boolean> map) {
        
       
        int result = 0;
        
        for ( int i = ind ; i < s.length() ; i++) {
            r = r + s.charAt(i);
             boolean p;
            if(map.get(r) != null) {
                p = map.get(r);
            } else {
                p = isPal(r);
                map.put(r, p);
            }
           
            
            
            if (p ) {
                result++;
            }
               
        }
        
        return result;
        
    }
    
    public boolean isPal (String r) {
        
        
        if(r.length() == 1) {
            return true;
        }
        for ( int i = 0 ; i < r.length()/2 ; i++) {
            if (r.charAt(i) != r.charAt (r.length() - 1 - i )) {
                return false;
            }
        }
        
         return true;
        
    }
    
    
}