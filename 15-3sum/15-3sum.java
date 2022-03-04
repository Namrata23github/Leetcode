class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
      Arrays.sort(nums);
        Set<List<Integer>> ans = new HashSet();
        for(int i=0; i<nums.length -2; i++) {
            for(int j = i + 1,k = nums.length -1; j < k;) {
                int sum = nums[i] + nums[j] + nums[k];
                if( sum == 0)
                {
                    ans.add(Arrays.asList(nums[i],nums[j++], nums[k--] ));
                }
                
              else if(sum > 0){
                  --k;
              }else {
                  ++j;
              }
            }
            
        }
        return new ArrayList<>(ans);
    }
}