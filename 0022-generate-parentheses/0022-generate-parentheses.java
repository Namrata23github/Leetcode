class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>  result = new ArrayList<>();
            
            generate(result, n, 0, 0, "");
        return result;
    }
    
    
    public void generate ( List<String> result, int n, int l, int r , String s) {
        
        if ( l == n && r == n) {
            result.add(s);
        }
        
        if ( l < n ) {
            
            generate ( result, n, l + 1,r, s + "(");
            
        } if ( r < l) {
            generate ( result, n,l, r + 1, s + ")");
        }
        
        
    }
}