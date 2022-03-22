class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> b =  new ArrayList();
        List<Integer> a = new ArrayList();
            
        for(int i=0; i<numRows; i++) {
            a.add(0,1);
            
            for(int j=1; j<a.size()-1  ;j++) {
               
                a.set(j, a.get(j) + a.get( j+1));
            }
            
             
            b.add(new ArrayList(a));
        }
        return b;
    }
}

