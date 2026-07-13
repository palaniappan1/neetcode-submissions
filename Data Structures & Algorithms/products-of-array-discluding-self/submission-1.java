class Solution {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] productArray = new int[length];
        for(int i =0 ; i < length; i++){
            int product = 1;
            for(int j = 0; j < length; j++){
                if(i != j){
                    product *= nums[j];
                }
            }
            productArray[i] = product;
        }
        return productArray;
    }
}  
