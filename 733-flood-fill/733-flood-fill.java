class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        Queue<int[]> q = new LinkedList();
        int start = image[sr][sc];
        q.add(new int[] {sr, sc});
        System.out.println(start);
        int[][] ds = {{1,0}, {0, 1}, {-1, 0}, {0, -1}};
        while(! q.isEmpty()) {
            
           int[] index =  q.poll();
            image[index[0]][index[1]] = color;
            for (int[] d: ds) {
                int r = index[0] + d[0];
                int c =  index[1] + d[1];
                //System.out.println(r + " " + c);
                if(r >= 0 && r < image.length && c >= 0 && c < image[0].length && image[r][c] == start && image[r][c] != color ) {
                   // System.out.println(r + " " + c);
                    
                    q.add(new int[] {r, c});
                }
            }
            
        }
        
        return image;
    }
}