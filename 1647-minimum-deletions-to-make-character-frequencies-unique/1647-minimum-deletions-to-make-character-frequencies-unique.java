class Solution {
    public int minDeletions(String s) {
        
        int [] freq = new int [26];
        
        for(int i =0; i<s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0; i<26; i++) {
            if(freq[i] >0) {
                pq.add(freq[i]);
            
            }
        
        }
        
        int dc = 0;
        while(pq.size() > 1) {
            int te = pq.remove();
            
            if(te == pq.peek()) {
                
                if(te - 1 > 0) {
                    pq.add(te-1);
                }
                
                ++dc;
            }
        }
        
        return dc;
    }
}