class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        sortArray(nums);
        int longestSequence = 1;
        int maxLongestSequence = 1;
        for(int i = 0; i< nums.length - 1; i++){
            if(nums[i] + 1 == nums[i + 1]){
                longestSequence++;
            } else if(nums[i] != nums[i + 1]){
                longestSequence = 1;
            }
            maxLongestSequence = Math.max(maxLongestSequence, longestSequence);
        }
        return maxLongestSequence;
    }

    public int[] sortArray(int[] nums){
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = 0; j < nums.length - 1 - i; j++){
                if(nums[j] > nums[j + 1]){
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        return nums;
    }
}
