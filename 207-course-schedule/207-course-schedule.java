class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if(numCourses > 0 && prerequisites.length == 0) {
            return true;
        }
        
    
        Map<Integer,List<Integer>> graph = new HashMap();
              for(int i=0; i<numCourses; i++) {
        graph.put(i,new ArrayList<Integer>());
    }
        
        for(int i=0; i<prerequisites.length; i++) {
           List<Integer> c = graph.get(prerequisites[i][0]);
            c.add(prerequisites[i][1]);   
            graph.put(prerequisites[i][0], c);
        }
        
  
        int[] visited = new int[numCourses];
        
        for(int i=0; i < numCourses; i++) {
            if(!dfs(i, graph, visited)) {
                return false;
            };
        }
        
        return true;
        
    }
    
    public boolean dfs(int course, Map<Integer,List<Integer>> graph, int[] visited) {
        visited[course] = 1;
        
        List<Integer> c = graph.get(course);
        
        for(Integer n: c) {
            if(visited[n] == 1) return false;
            if(visited[n] == 0) {
                if(!dfs(n, graph, visited)) {
                    return false;
                }
            }
                
        }
    visited[course] = 2;
        return true;
        
    }
}