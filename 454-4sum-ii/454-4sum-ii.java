class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int l1 = nums1.length;
                    int l2 = nums2.length;
        int l3 = nums3.length;
        int l4 = nums4.length;

        HashMap<Integer, Integer> hm = new HashMap();
        for(int i=0;i<l1;i++) {
            for(int j=0;j<l2;j++) {
                Integer sum = nums1[i] + nums2[j];
                hm.put(sum, hm.getOrDefault(sum, 0) + 1)  ;   
            }
        }
        int res = 0;
              for(int i=0;i<l3;i++) {
            for(int j=0;j<l4;j++) {
                Integer sum = nums3[i] + nums4[j];
                res = res + hm.getOrDefault(-1 * sum, 0);
                
            }
              }
        
        return res;
    }
}