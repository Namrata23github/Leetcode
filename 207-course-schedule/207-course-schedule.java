class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        HashMap<Integer, List<Integer>>  map = new HashMap();
        int visited[] = new int[numCourses];
        
                 for(int i=0; i<numCourses; i++) {
        map.put(i,new ArrayList<Integer>());
    }
        
        for(int i = 0; i < prerequisites.length; i++ ) {
           List<Integer> arr = map.get(prerequisites[i][0]);
            arr.add(prerequisites[i][1]);
            
            map.put(prerequisites[i][0], arr);
        }
        
        for(int i = 0; i < numCourses ; i++) {
            if(!dfs(map,  visited,  i)) {
                return false;
            }
        }
        return true;
    }
    
    boolean dfs(HashMap<Integer, List<Integer>>  map, int[] visited, int node) {
        
        visited[node] = 1;
        
        for (int n: map.get(node)) {
            if(visited[n] == 1) return false;
            if(visited[n] == 0) {
                if(!dfs(  map,  visited,  n)) {
                    return false;
                }
            }
        }
        
        visited[node] =2;
        return true;
    }
}