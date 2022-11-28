class Solution {
    public int singleNumber(int[] nums) {
        
        HashMap<Integer, Integer> elem = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++) {
            
            elem.put(nums[i], elem.getOrDefault(nums[i] , 0) + 1);
            
        }
        
        for(Map.Entry<Integer, Integer> entry : elem.entrySet()) {
            if(entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return 0;
        
    }
}