class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> r1 = new HashSet();
        Arrays.sort(nums);
        
        for(int i= 0; i< nums.length-3; i++) {
            for(int j= i+1; j< nums.length-2; j++) {
                int l = j+1; int r = nums.length-1;
                while(l<r) {
                    int sum = nums[i] + nums[j] + nums[l] + nums[r] ;
                if(sum == target) {
                    r1.add(Arrays.asList(nums[i] , nums[j] , nums[l] , nums[r]));
                }
                if(sum > target) {
                    r--;
                }else {
                    l++;
                }
            }
            }
        
        }
        return new ArrayList(r1);
        
    }
}