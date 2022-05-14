class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       
        Map<int [], List<String>> map = new TreeMap<>(new Comparator<int []>() {
            @Override public int compare(int [] a, int [] b) {
                for (int i = 0; i < 26; i++) if (a[i] != b[i]) { return (a[i] - b[i]); }
                return 0;
            }});
      
        for(int i=0; i < strs.length; i++) {
            int a[] = new int[26];
          for (char c : strs[i].toCharArray()) {
                a[c-'a']++;
            }
            
            List<String> match = map.getOrDefault(a, new ArrayList());
            match.add(strs[i]);
            map.put(a,match );
        }
       
        return new ArrayList(map.values());
    }
}