class Solution {
    public int search(int[] num, int target) {
    int l = 0;
        int r = num.length -1;
        
        while(l<=r) {
            int mid = l + (r - l)/2;
            
            if(num[mid] == target) {
                return mid;
            }
              //left portion
            if(num[l] <= num[mid]) {
                if( target > num[mid] || target < num[l]) {
                     l = mid + 1;
                } else {
                    r = mid -1;
                }
            } else {
                if(target < num[mid] || target > num[r]) {
                    r = mid -1;
                }else {
                    l = mid + 1;
                }
            }
           
        }
        return -1;
    }
}