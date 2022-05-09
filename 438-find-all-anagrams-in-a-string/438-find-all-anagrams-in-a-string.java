class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        int pl = p.length();
         int paa[] = new int[26];
        List<Integer> list = new ArrayList();
        
        if (s.length() < p.length()) return list;
        int pa[] = new int[26];
        for(int i = 0 ; i< pl ; i++) {
            pa[p.charAt(i) - 'a']++;
            paa[s.charAt(i)  - 'a'] ++;
        }
        
        int ii = 0;
           if(Arrays.equals(paa, pa)) {
              list.add(0);
              
          }   
       for(int i = pl ; i< s.length()  ; i++) {
          
           
          
         
                paa[s.charAt(i) - 'a']++;
           paa[s.charAt(i-pl) - 'a']--;
           
          // System.out.println(Arrays.toString(paa));
           
                if(Arrays.equals(paa, pa)) {
              list.add(i - pl + 1);
              
          }    

       }
        return list;
    }
}