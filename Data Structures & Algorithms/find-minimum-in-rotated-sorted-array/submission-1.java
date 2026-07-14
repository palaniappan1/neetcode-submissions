class Solution {
    public int findMin(int[] nums) {
        int length = nums.length;
        int minNumber = nums[0];
        for(int i = 1; i < length; i++){
            if(nums[i] < minNumber){
                minNumber = nums[i];
            }
        }
        return minNumber;
    }
}
