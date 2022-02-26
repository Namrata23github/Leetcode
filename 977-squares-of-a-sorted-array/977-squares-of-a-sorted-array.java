class Solution {
    public int[] sortedSquares(int[] nums) {
   int[] squaresArr = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            squaresArr[i] = nums[i]*nums[i];
        }
        int leftPtr = 0;
        int rightPtr = nums.length-1;
        int currPos = nums.length-1;
        int[] res = new int[nums.length];
        while(leftPtr<=rightPtr){
            if(squaresArr[rightPtr]>squaresArr[leftPtr]){
               res[currPos] = squaresArr[rightPtr];
                rightPtr--;
            }else{
                res[currPos] = squaresArr[leftPtr];
                leftPtr++;
            }
            currPos--;
        }
        return res;
    }
}