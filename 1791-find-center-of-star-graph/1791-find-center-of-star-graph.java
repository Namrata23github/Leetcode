class Solution {
    public int findCenter(int[][] edges) {
HashMap<Integer, Integer> map = new HashMap();        
        for(int i = 0; i<edges.length; i++) {
           Integer val = map.getOrDefault(edges[i][0], 0) + 1;
               
               if (val >= edges.length) return edges[i][0];
          map.put(edges[i][0], val);
              
              val = map.getOrDefault(edges[i][1], 0) + 1;
               
               if (val >= edges.length) return edges[i][1];
          map.put(edges[i][1], val);
        }
        
          return -1;
        
        
        
    }
}