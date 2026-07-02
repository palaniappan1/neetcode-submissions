class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> numberAndFrequency = new HashMap<>();
        for (int num : nums) {
            numberAndFrequency.put(num, numberAndFrequency.getOrDefault(num, 0) + 1);
        }
        return numberAndFrequency.entrySet().stream()
                .sorted((e1, e2) -> Integer.compare(e2.getValue(), e1.getValue()))
                .limit(k)
                .mapToInt(Map.Entry::getKey)
                .toArray();
    }
}
