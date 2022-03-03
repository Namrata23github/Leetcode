class Solution {
    public String longestCommonPrefix(String[] strs) {
        String p = strs[0];
        for(int i=0; i<strs.length; i++) {
            while(strs[i].indexOf(p) != 0) {
                p = p.substring(0 , p.length()-1);
            }
        }
        return p;
    }
    
}