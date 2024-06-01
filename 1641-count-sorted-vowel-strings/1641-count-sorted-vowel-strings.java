class Solution {
    public int countVowelStrings(int n) {
        
        
        int[] vo = new int[5];
        Arrays.fill(vo, 1);
        

        for ( int i = 0 ; i < n ; i++) {
               int sum = 0;
            for ( int j = 0 ; j < 5; j++) {
                sum = sum + vo[j] ;
                vo[j] = sum;
                
            }
            
        }
        return vo[4];
        
    }
    
    
}