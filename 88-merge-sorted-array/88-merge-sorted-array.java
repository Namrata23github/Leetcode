class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int a = m-1, b=n-1, c = n+m-1;
        
        while(a>=0 && b>=0) {
            nums1[c--] = nums1[a] > nums2[b] ? nums1[a--] : nums2[b--];
        }
        while(b>=0){
            nums1[c--] = nums2[b--];
        }
    }
}