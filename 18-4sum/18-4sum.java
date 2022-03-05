class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> r1 = new HashSet();
        Arrays.sort(nums);
        int len = nums.length;
        for(int i= 0; i< len-3; i++) {
            for(int j= i+1; j< len-2; j++) {
                int l = j+1; int r = len-1;
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