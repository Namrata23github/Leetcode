class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        Map<Integer, Map<Integer, Integer>> graph = new HashMap();
        
        for(int[] time: times) {
            if(!graph.containsKey(time[0])) {
                graph.put(time[0], new HashMap());
            }
            
            graph.get(time[0]).put(time[1], time[2]);
        }
        
        
            Queue<int[]> queue = new PriorityQueue<>((a, b) -> (Integer.compare(a[0], b[0])));
        
        queue.add(new int[] {0, k});
        Set<Integer> set = new HashSet<>();
    
        while(!queue.isEmpty()) {
           int node[] =  queue.poll();
            int time = node[0];
            int cur  = node[1];
            set.add(cur);
            //System.out.println(time + " " + cur + " " + set.size());
            if(set.size() == n) {
                return time;
            }
            
           Map<Integer, Integer> map =  graph.getOrDefault(cur, new HashMap());
            for(int adj : map.keySet()) {
              if(!set.contains(adj)) {
                queue.add(new int[] { time + map.get(adj), adj });
              }
            }
            
        }
        
        return -1;
    }
}