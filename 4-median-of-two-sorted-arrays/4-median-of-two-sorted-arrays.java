class Solution {
    public double findMedianSortedArrays(int[] num1, int[] num2) {
     
        int sum = num1.length + num2.length;
        
        int medium = ((sum + 1)/2 );
              
        int i = 0;
        int count = 0;
        int j = 0;
        
 int median1 = 0;
         int median2;
        if(num1.length == 0) {
            
                median2 = num2[medium - 1];
            
            if(sum%2 == 0)  {
                median1 = num2[medium];
            }
            
        } else if(num2.length == 0) {
            median2 = num1[medium - 1];
            
             if(sum%2 == 0)  {
                median1 = num1[medium];
             }
            
        } else {
        
         median1 = num1[0];
       median2 = num1[0];
        while ( i < num1.length && j < num2.length) {
            if(num1[i] < num2[j]) {
                 median2 = median1;
                 median1 = num1[i];
                i++;
               
            } else {
                median2 = median1;
                median1 = num2[j];
                j++;
                
            }
            if(++count == medium + 1) {
                break;
            }
            
        }
        
        
        
        while(count < medium + 1) {
            if(i < num1.length) {
                median2 = median1;
                median1 = num1[i];
                i++;
                count++;
            } else {
                median2 = median1;
                median1 = num2[j]; 
                j++;
                  count++;
            }
        } 
        }
        
            
            if(sum % 2 == 0) {
                //System.out.println(median1 +  " " + median2);
                return (double) (median1 + median2)/2;
            }
                return median2; 
            
        
    }
}