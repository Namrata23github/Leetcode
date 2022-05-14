class Solution {
    public int[][] merge(int[][] in) {
     List<int[]> result = new ArrayList();
                if(in.length == 0 || in == null) 
                    return result.toArray(new int[0][]);

        
        Arrays.sort(in, (a, b) -> a[0] - b[0]);
        
         int sp = in[0][0];
        int ep = in[0][1];
         int sc = in[0][0];
        int ec = in[0][1];
      
        int c = 0;
        for(int i = 1; i < in.length; i++) {
             sc = in[i][0];
             ec = in[i][1];
            
            if(ep < sc ) {
                // result[c][0] = sp;
                //  result[c++][1] = ep;
                result.add(new int [] {sp, ep});
                sp = sc;
                ep = ec;
            } else {
                ep = Math.max(ep , ec);
            }
        }
    result.add(new int [] {sp, ep});

        
        
      return result.toArray(new int[0][]);  
    }
        
    
}