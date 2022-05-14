class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap();
        for(int i=0; i < strs.length; i++) {
            int a[] = new int[26];
          for (char c : strs[i].toCharArray()) {
                a[c-'a']++;
            }
            
            List<String> match = map.getOrDefault(Arrays.toString(a), new ArrayList());
            match.add(strs[i]);
            map.put(Arrays.toString(a),match );
        }
       
        return new ArrayList(map.values());
    }
}