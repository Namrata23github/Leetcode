class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        int pl = p.length();
        List<Integer> list = new ArrayList();
        int pa[] = new int[26];
        for(int i = 0 ; i< pl ; i++) {
            pa[p.charAt(i) - 'a']++;
        }
        
       for(int i = 0 ; i<= s.length() - pl  ; i++) {
           int paa[] = new int[26];
           
           for(int j = i ; j< i + pl; j++) {
                paa[s.charAt(j) - 'a']++;
           }
           
          // System.out.println(Arrays.toString(paa));
                   

          if(Arrays.toString(paa).equals( Arrays.toString(pa))) {
              list.add(i);
          }
       }
        return list;
    }
}