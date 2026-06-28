class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] results = new int[temperatures.length];
        Arrays.fill(results, 0);
        for(int i = 0; i < temperatures.length; i++){
            int count = 0;
            for(int j = i + 1; j < temperatures.length; j++){
                count++;
                if(temperatures[j] > temperatures[i]){
                    results[i] = count;
                    break;
                }
            }
        }
        return results;
    }
}
