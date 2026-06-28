class Solution {
    public int maxArea(int[] heights) {
        int maxWater = 0;
        for(int i =0; i < heights.length; i++){
            for(int j= i + 1; j < heights.length; j++){
                int tempMax = (j - i) * Math.min(heights[i], heights[j]);
                if(tempMax > maxWater){
                    maxWater = tempMax;
                }
            }
        }
        return maxWater;
    }
}
