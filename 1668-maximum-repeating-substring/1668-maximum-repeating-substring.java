class Solution {
    public int maxRepeating(String sequence, String word) {
           int result = 0;
        String w = word;
        while(sequence.contains(w)) {
            w = w + word;
            result++;
        }

        return result;
    }
}