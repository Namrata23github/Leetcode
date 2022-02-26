class Solution {
    public int search(int[] nums, int target) {
       int a = 0; int b = nums.length -1;
        
        while(a<b) {
            int m = a + (b-a+1)/2;
            if(target<nums[m]) {
                b = m - 1;
            } else {
                a = m;
            }
        }
         return nums[a]==target? a: -1;
    }
   
}