class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> hashMap = new HashSet<>();
        for (int num: nums){
            if(hashMap.contains(num)){
                return true;
            }
            hashMap.add(num);
        }
        return false;
    }
}