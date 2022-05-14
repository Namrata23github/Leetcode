class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap();
        for(int i=0; i < strs.length; i++) {
            int a[] = new int[26];
            for(int j=0; j < strs[i].length(); j++) {
                char ch = strs[i].charAt(j);
                a[ch-'a']++;
            }
            
            List<String> match = map.getOrDefault(Arrays.toString(a), new ArrayList());
            match.add(strs[i]);
            map.put(Arrays.toString(a),match );
        }
       
        return new ArrayList(map.values());
    }
}