class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int result = 0;
        for(char ch : stones.toCharArray()) {
            if(jewels.indexOf(ch)!= -1) {
                result++;
            }
        }
        return result;
    }
}