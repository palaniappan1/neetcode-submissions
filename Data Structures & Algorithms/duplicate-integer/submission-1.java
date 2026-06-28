class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> visited = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(!visited.add(nums[i])){
               return true; 
            }
        }
        return false;
    }
}