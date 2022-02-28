class Solution {
    public int maxArea(int[] h) {
        
        int f =0; int l = h.length - 1;
        int max = 0;
        while(f<l) {
            int min = Math.min(h[f],h[l] );
           max = Math.max(max, min* (l -f));
        
            if(h[f] < h[l]) {
                f++;
            }else {
                l--;
            }
        }
        return max;
    }
}