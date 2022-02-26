/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int a = 0; int b= n-1;
        
        while(a<=b){
            int m = a + ((b-a)/2);
            
            if(isBadVersion(m)) {
                b = m -1;
            }else {
                a = m + 1;
            }
        }
        return a;
    }
}