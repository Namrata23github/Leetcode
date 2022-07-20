



class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length + nums2.length == 1) {
            return nums1.length == 1 ?  nums1[0]  : nums2[0] ;
        }
        
        int mid = (nums1.length + nums2.length) / 2;
 System.out.println(mid);

        int j = 0;
        int k = 0;
        
        
        int a = 0; 
        int b  = 0;
        
        
        while( j < nums1.length && k < nums2.length && j + k <= mid) {
              a = b;
            if(nums1[j] < nums2[k]) {
                b = nums1[j++];
            } else {
                b = nums2[k++];
            }
        }
        
        while(j < nums1.length && j + k <= mid) {
            a = b;
             b = nums1[j++];
        }
        
          while(k < nums2.length && j + k <= mid) {
            a = b;
             b = nums2[k++];
        }
        

        if((nums1.length + nums2.length) % 2 == 0) {
            
            return (double)(a+b)/2;
        } 
           return b;
        
    }
}