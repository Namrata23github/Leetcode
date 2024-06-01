class Solution {
    public List<Integer> getRow(int rowIndex) {

        int[] result = new int [rowIndex + 1];
        Arrays.fill (result, 1);

        for ( int i = 2 ;  i <= rowIndex; i++) {

            for ( int j = i - 1; j > 0 ; j-- ) {

                result[j] = result[j] + result[j-1];
            }
        }

        return IntStream.of(result).boxed().collect(Collectors.toList());

            
        
    }
}